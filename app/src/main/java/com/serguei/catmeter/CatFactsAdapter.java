package com.serguei.catmeter;// Created by Serguei Outenkov on 8/28/16.

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;


public class CatFactsAdapter extends RecyclerView.Adapter {
    List<String> catFacts;
    Context context;

    public CatFactsAdapter(List<String> catFacts, Context context) {
        this.catFacts = catFacts;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new CatFactViewHolder(LayoutInflater.from(context).inflate(R.layout.cat_fact_list_item, parent, false));

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String catFact = catFacts.get(position);
        CatFactViewHolder viewHolder = (CatFactViewHolder) holder;

        //Imagen Random de un gato

        //Generamos un ID random en un rango
        int min = 300;
        int max = 500;
        Random r = new Random();
        int width = r.nextInt(max - min + 1) + min;
        int height = r.nextInt(max - min + 1) + min;

        //Url de la imagen
        String imageURL = "https://placekitten.com/" + width + "/" + height;

        //Seteamos la imagen al image View con Picasso
        Picasso.with(context).load(imageURL).placeholder(R.mipmap.ic_launcher).into(viewHolder.catFactImageView);

        //Seteamos texto
        viewHolder.catFactTextView.setText(catFact);
    }

    @Override
    public int getItemCount() {
        return catFacts.size();
    }

    static class CatFactViewHolder extends RecyclerView.ViewHolder {

        CircleImageView catFactImageView;
        TextView catFactTextView;

        public CatFactViewHolder(View itemView) {
            super(itemView);

            catFactImageView = (CircleImageView) itemView.findViewById(R.id.cat_fact_image);
            catFactTextView = (TextView) itemView.findViewById(R.id.cat_fact_text);
        }
    }
}
