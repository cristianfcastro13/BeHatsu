package com.android.example.behatsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button myMemoriesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myMemoriesButton = findViewById(R.id.myMemoriesButton);
        myMemoriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, CameraActivity.class));
            }
        });
    }

    public int openMemories () {
        //TODO: Hatsu this method before it's too late!
        return 0;
    }

}//END class

