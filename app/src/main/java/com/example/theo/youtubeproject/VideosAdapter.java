package com.example.theo.youtubeproject;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class VideosAdapter extends RecyclerView.Adapter<VideosViewHolder>{

    private final Items items;
    private OnVideoSelectedListener onVideoSelectedListener;

    public VideosAdapter(Items items){
        this.items = items;
    }

    @Override
    public VideosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_video, parent, false);
        return new VideosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideosViewHolder holder, int position) {
        holder.setOnVideoSelectedListener(onVideoSelectedListener);
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

    public void setOnVideoSelectedListener(OnVideoSelectedListener onVideoSelectedListener){
        this.onVideoSelectedListener = onVideoSelectedListener;
    }
}
