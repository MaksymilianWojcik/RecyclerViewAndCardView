package com.example.maks.recyclerviewandcardview;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MAKS on 02.09.2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] titles = {"Chapter One", "Chapter Two",
            "Chapter Three",
            "Chapter Four",
            "Chapter Five",
            "Chapter Six",
            "Chapter Seven",
            "Chapter Eight"};

    private String[] details = {"Item one detail",
            "Item two detail",
            "Item 3 detail",
            "Item 4 detail",
            "Item 5 detail",
            "Item 6 detail",
            "Item 7 detail",
            "Item 8 detail"};

    private int[] images = {R.drawable.android_image_1,
            R.drawable.android_image_2,
            R.drawable.android_image_3,
            R.drawable.android_image_4,
            R.drawable.android_image_5,
            R.drawable.android_image_6,
            R.drawable.android_image_7,
            R.drawable.android_image_8};


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemTitle.setText(titles[position]);
        holder.itemDetail.setText(details[position]);
        holder.itemImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView) itemView.findViewById(R.id.item_image);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemDetail = (TextView) itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Snackbar.make(v, "Click detected on item: " + position, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }
            });
        }


    }
}
