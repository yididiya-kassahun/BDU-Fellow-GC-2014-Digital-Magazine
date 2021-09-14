package com.vlm.gc2014digitalmag;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.Myclass>{
polyActivity polyActivity;
ArrayList<String> imgArryList;
//    ArrayList<String> lastwordlist;
    public RecyclerViewAdapter(polyActivity polyActivity, ArrayList<String> imgArrylist) {
        this.imgArryList=imgArrylist;
        Log.d("messege","======================="+imgArrylist.get(0));
        this.polyActivity=polyActivity;
    }

    @NonNull
    @Override
    public Myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(polyActivity).inflate(R.layout.activity_recycler_view_adapter,parent,false);
        return new Myclass(view);
    }

    @NonNull

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.Myclass holder, int position) {
        Glide.with(polyActivity).load(imgArryList.get(position)).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return imgArryList.size();
    }
    class Myclass extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView lastword;
        public Myclass(@NonNull View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            lastword= itemView.findViewById(R.id.imagetext);
        }
    }
}