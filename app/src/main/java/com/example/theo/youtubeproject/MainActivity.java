package com.example.theo.youtubeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String URL = "";
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        VideosAdapter adapter = new VideosAdapter(generateVideos(10));
        recyclerView.setAdapter(adapter);
    }

    private List<Video> generateVideos(int size){
        List<Video> videos = new ArrayList<>();
        for(int i = 0; i < size; i++){
            Video video = new Video("Title" + i, "Channel" + i);
            videos.add(video);
        }
        return videos;
    }
}
