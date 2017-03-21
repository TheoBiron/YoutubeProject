package com.example.theo.youtubeproject;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class VideosViewHolder extends RecyclerView.ViewHolder{

    private TextView title;
    private TextView channel;

    public VideosViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        channel = (TextView) itemView.findViewById(R.id.channel);
    }

    public void bind(Video video){
        title.setText(video.getTitle());
        channel.setText(video.getChannel());
    }
}
