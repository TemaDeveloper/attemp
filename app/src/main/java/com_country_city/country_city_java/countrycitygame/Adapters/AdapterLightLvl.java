package com_country_city.country_city_java.countrycitygame.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com_country_city.country_city_java.countrycitygame.Main.LvlActivity;
import com_country_city.country_city_java.countrycitygame.Moduls.ItemLvl;
import com_country_city.country_city_java.countrycitygame.R;

public class AdapterLightLvl extends RecyclerView.Adapter<AdapterLightLvl.LightLvlViewHolder> {

    private ArrayList<ItemLvl> lvls;
    private Context context;

    public AdapterLightLvl(Context context, ArrayList<ItemLvl> lvls) {
        this.lvls = lvls;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterLightLvl.LightLvlViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lvl, parent, false);
        return new LightLvlViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull AdapterLightLvl.LightLvlViewHolder holder, int position) {
        int currentPosition = position + 1;

        holder.textNum.setText(currentPosition + "." + lvls.get(position).getNum());
        holder.imgCircle.setImageResource(lvls.get(position).getImgCircle());
        holder.textScore.setText(lvls.get(position).getScore());

        //take previous position and look if it has the score that more then 0/10
        if(position > 0 && !lvls.get(position - 1).getScore().equals("0/10")){
            holder.itemView.setEnabled(true);
            holder.cardLvl.setBackgroundResource(android.R.color.white);
            holder.textNum.setTextColor(ContextCompat.getColor(context, R.color.blue));
            holder.textScore.setTextColor(ContextCompat.getColor(context, android.R.color.black));
        }else {
            holder.itemView.setEnabled(false);
            holder.cardLvl.setBackgroundResource(R.color.gray);
            holder.textNum.setTextColor(ContextCompat.getColor(context, R.color.gray_text));
            holder.textScore.setTextColor(ContextCompat.getColor(context, R.color.gray_text));
        }

        if (currentPosition == 1) {
            holder.itemView.setEnabled(true);
            holder.cardLvl.setBackgroundResource(android.R.color.white);
            holder.textNum.setTextColor(ContextCompat.getColor(context, R.color.blue));
            holder.textScore.setTextColor(ContextCompat.getColor(context, android.R.color.black));
        }

    }

    @Override
    public int getItemCount() {
        return lvls.size();
    }

    public class LightLvlViewHolder extends RecyclerView.ViewHolder {

        private TextView textNum, textScore;
        private ImageView imgCircle;
        private CardView cardLvl;

        public LightLvlViewHolder(@NonNull View itemView) {
            super(itemView);

            textNum = itemView.findViewById(R.id.text_num);
            cardLvl = itemView.findViewById(R.id.card_lvl);
            textScore = itemView.findViewById(R.id.text_score);
            imgCircle = itemView.findViewById(R.id.img_circle);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(context, LvlActivity.class);
                    intent.putExtra("num", textNum.getText().toString());
                    intent.putExtra("image_lvl", lvls.get(getAdapterPosition()).getImgCircle());
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
            });

        }
    }
}
