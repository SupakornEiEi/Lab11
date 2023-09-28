package com.example.lab11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.imageViewholder> {

    Context context;
    ArrayList<Shoe>imagesArraylist;

    public MyAdapter(Context context, ArrayList<Shoe> imagesArraylist) {
        this.context = context;
        this.imagesArraylist = imagesArraylist;
    }

    @NonNull
    @Override
    public imageViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false);
        return new imageViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull imageViewholder holder, int position) {
        Shoe Shoeimage=imagesArraylist.get(position);
        holder.shoetitle.setText(Shoeimage.getTitle());

        String url;
        url=Shoeimage.getImage();
        Picasso.get().load(url).into(holder.shoeimage);

    }

    @Override
    public int getItemCount() {
        return imagesArraylist.size();
    }

    public class imageViewholder extends RecyclerView.ViewHolder{

        ImageView shoeimage;
        TextView shoetitle;
        public imageViewholder(@NonNull View itemView) {
            super(itemView);

            shoeimage = itemView.findViewById(R.id.shoeimage);
            shoetitle = itemView.findViewById(R.id.shoetitle);

        }
    }
}
