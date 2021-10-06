package com.vlm.gc2014digitalmag;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class pedaRecyclerViewAdapter extends RecyclerView.Adapter<pedaRecyclerViewAdapter.Myclass> {
    pedaActivity pedaActivity;
    ArrayList<String> imgArryList;
    ArrayList<String> lastwordlist;
    public pedaRecyclerViewAdapter(pedaActivity pedaActivity, ArrayList<String> imgArrylist,ArrayList<String> lastwordlist) {
        this.imgArryList=imgArrylist;
        this.lastwordlist=lastwordlist;
        Log.d("messege", " ======================= "+lastwordlist.get(2));
        this.pedaActivity=pedaActivity;
    }

    @NonNull
    @Override
    public Myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(pedaActivity).inflate(R.layout.activity_recycler_view_adapter,parent,false);
        return new pedaRecyclerViewAdapter.Myclass(view);
    }

    @NonNull

    @Override
    public void onBindViewHolder(@NonNull Myclass holder, int position) {
        Glide.with(pedaActivity).load(imgArryList.get(position)).placeholder(R.mipmap.defaultimage).into(holder.imageView);
        holder.setTitle(lastwordlist.get(position));

    }

    @Override
    public int getItemCount() {
        return imgArryList.size();
    }
    class Myclass extends RecyclerView.ViewHolder{
        ImageView imageView;

        TextView lastword;
        View mView;

        public Myclass(@NonNull View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            mView = itemView;
        }
        public void setTitle(String title)
        {
            lastword = (TextView)mView.findViewById(R.id.lastword1);
            lastword.setText(title);

        }
    }
}
