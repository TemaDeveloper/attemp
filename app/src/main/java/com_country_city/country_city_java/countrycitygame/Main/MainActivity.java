package com_country_city.country_city_java.countrycitygame.Main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com_country_city.country_city_java.countrycitygame.DifficultyLvls.LightLvlsActivity;
import com_country_city.country_city_java.countrycitygame.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView lightLvlsCardView;
    private FloatingActionButton fabFaq, fabFeedBack, fabExpend;
    private boolean switchingExpendableBtn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

    private void init() {

        lightLvlsCardView = findViewById(R.id.card_view_light_lvls);
        fabFaq = findViewById(R.id.fab_faq);
        fabFeedBack = findViewById(R.id.fab_feedback);
        fabExpend = findViewById(R.id.fab_expend);

        fabExpend.setOnClickListener(this);
        fabFaq.setOnClickListener(this);
        fabFeedBack.setOnClickListener(this);
        lightLvlsCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.card_view_light_lvls:
                startActivity(new Intent(getApplicationContext(), LightLvlsActivity.class));
                break;
            case R.id.fab_faq:
                startActivity(new Intent(getApplicationContext(), FAQActivity.class));
                break;
            case R.id.fab_expend:
                if (switchingExpendableBtn) {
                    fabExpend.setImageResource(R.drawable.img_cross);
                    fabFaq.show();
                    fabFeedBack.show();
                    switchingExpendableBtn = false;
                } else {
                    fabExpend.setImageResource(R.drawable.img_check);
                    fabFaq.hide();
                    fabFeedBack.hide();
                    switchingExpendableBtn = true;
                }
                break;
            case R.id.fab_feedback:
                Intent feedbackEmail = new Intent(Intent.ACTION_SEND);

                feedbackEmail.setType("text/email");
                feedbackEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{"freshart666@gmail.com"});
                feedbackEmail.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
                startActivity(Intent.createChooser(feedbackEmail, "Send Feedback:"));
                break;
        }
    }
}