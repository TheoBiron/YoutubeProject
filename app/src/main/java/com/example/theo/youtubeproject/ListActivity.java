package com.example.theo.youtubeproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

public class ListActivity extends AppCompatActivity implements OnVideoSelectedListener{

    private RecyclerView recyclerView;
    private static final String VIDEO_URL = "https://www.googleapis.com/youtube/v3/search?part=snippet&type=video";//&q=kemarfabrice&key=";
    public String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Intent intent = getIntent();
        if (intent.hasExtra("search")) {
            text = intent.getStringExtra("search");
        }
        getVideos();
    }

    private void getVideos() {
        StringRequest videosRequest = new StringRequest(VIDEO_URL + "&q="+ text + "&key=" +Constants.API_KEY, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                VideoJson videoJson = new Gson().fromJson(response, VideoJson.class);

                setAdapter(videoJson.getItems());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Videos", "Error");
            }
        });

        Volley.newRequestQueue(this).add(videosRequest);
    }

    private void setAdapter(Items items){
        VideosAdapter adapter = new VideosAdapter(items);
        adapter.setOnVideoSelectedListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onVideoSelected(Item item) {
        VideoDetails.start(this, item.getSnippet().getTitle(), item.getSnippet().getDescription());
    }
}
