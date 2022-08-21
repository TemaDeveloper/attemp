package com_country_city.country_city_java.countrycitygame.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com_country_city.country_city_java.countrycitygame.Moduls.ItemFAQ;
import com_country_city.country_city_java.countrycitygame.R;

public class AdapterFAQ extends RecyclerView.Adapter<AdapterFAQ.FAQViewHolder> {

    private ArrayList<ItemFAQ> listFAQ = new ArrayList<>();

    public AdapterFAQ(ArrayList<ItemFAQ> listFAQ) {
        this.listFAQ = listFAQ;
    }

    @NonNull
    @Override
    public FAQViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_faq, parent, false);
        return new FAQViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FAQViewHolder holder, int position) {
        ItemFAQ itemFAQ = listFAQ.get(position);
        holder.textTitle.setText(itemFAQ.getTitle());
        holder.textDescription.setText(itemFAQ.getDescription());
    }

    @Override
    public int getItemCount() {
        return listFAQ.size();
    }

    public class FAQViewHolder extends RecyclerView.ViewHolder {

        private TextView textTitle, textDescription;

        public FAQViewHolder(@NonNull View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.text_title_faq);
            textDescription = itemView.findViewById(R.id.text_description_faq);

        }
    }
}
