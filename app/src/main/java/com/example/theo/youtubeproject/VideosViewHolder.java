package com.example.theo.youtubeproject;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class VideosViewHolder extends RecyclerView.ViewHolder{

    private TextView title;
    private TextView description;
    private ImageView thumbnailsView;
    private OnVideoSelectedListener onVideoSelectedListener;

    public VideosViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        //description = (TextView) itemView.findViewById(R.id.description);
        thumbnailsView = (ImageView) itemView.findViewById(R.id.imageView);
    }

    public void bind(final Item item){
        title.setText(item.getSnippet().getTitle());
        //description.setText(item.getSnippet().getDescription());
        Picasso.with(thumbnailsView.getContext()).load(item.getSnippet().getThumbnails().getHigh().getUrl()).into(thumbnailsView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onVideoSelectedListener == null){
                    return;
                }
                onVideoSelectedListener.onVideoSelected(item);
            }
        });
    }

    public void setOnVideoSelectedListener(OnVideoSelectedListener onVideoSelectedListener){
        this.onVideoSelectedListener = onVideoSelectedListener;
    }
}
