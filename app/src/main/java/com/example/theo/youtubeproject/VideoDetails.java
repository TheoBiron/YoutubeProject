package com.example.theo.youtubeproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class VideoDetails extends AppCompatActivity {

    private static final String VIDEO = "VIDEO";
    private static final String DESCRIPTION = "DESCRIPTION";
    private String videoTitle;
    private String videoDescription;
    private RelativeLayout relativeLayout;
    private TextView descriptionView;

    public static void start(Context context, String videoTitle, String description){
        Intent intent = new Intent(context, VideoDetails.class);
        intent.putExtra(VIDEO, videoTitle);
        intent.putExtra(DESCRIPTION, description);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_details);

        videoTitle = getIntent().getStringExtra(VIDEO);
        videoDescription = getIntent().getStringExtra(DESCRIPTION);
        relativeLayout = (RelativeLayout) findViewById(R.id.activity_video_details);
        descriptionView = (TextView) findViewById(R.id.description);
        descriptionView.setText(videoDescription);

    }
}
