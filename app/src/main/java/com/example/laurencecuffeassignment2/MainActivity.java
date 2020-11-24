package com.example.laurencecuffeassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // debug Tags
    private static final String PTAG = "OpenCameraActive";
    private static final String VTAG = "GalleryActive";
    private static final String EMTAG = "EmailPrepActive";

    // making picture ID Just an Int
    private static final int pic_id = 120;
    // defining a variable for the view object textView
    protected TextView camera_open_id;

    /**
     * @author Laurence Cuffe
     * @version 0.8
     * Includes a working Implied intent for Open Camera trigering off the first textView
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camera_open_id =  findViewById(R.id.textView);
        Log.i(PTAG,"Camera_open_Id set ");
        camera_open_id.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent camera_intent
                        = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                // Start the activity with camera_intent,
                // and request pic id
                startActivityForResult(camera_intent, pic_id);
            }
        });
    }
}