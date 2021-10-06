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
ArrayList<String> lastwordlist;
    public RecyclerViewAdapter(polyActivity polyActivity, ArrayList<String> imgArrylist,ArrayList<String> lastwordlist) {
        this.imgArryList=imgArrylist;
        this.lastwordlist=lastwordlist;
        Log.d("messege", " ======================= "+lastwordlist.get(2));
        this.polyActivity=polyActivity;
    }

    @NonNull
    @Override
    public Myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(polyActivity).inflate(R.layout.activity_recycler_view_adapter,parent,false);
        return new RecyclerViewAdapter.Myclass(view);
    }

    @NonNull

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.Myclass holder, int position) {
        Glide.with(polyActivity).load(imgArryList.get(position)).placeholder(R.mipmap.defaultimage).into(holder.imageView);
        holder.setTitle(lastwordlist.get(position));
       // holder.lastword = lastwordlist.get(position);
      //  Glide.with(polyActivity).load(lastwordlist.get(position)).into(holder.lastword);
    }

    @Override
    public int getItemCount() {
        return imgArryList.size();
    }
    class Myclass extends RecyclerView.ViewHolder{
        ImageView imageView;
       // String lastword;

        TextView lastword;
        View mView;

        public Myclass(@NonNull View itemView){
            super(itemView);
           imageView = itemView.findViewById(R.id.image);
           mView = itemView;
         //  lastword = itemView.findViewById(R.id.lastword1);
        }
        public void setTitle(String title)
        {
            lastword = (TextView)mView.findViewById(R.id.lastword1);
            lastword.setText(title);

        }
    }
}