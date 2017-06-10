package com.doomcat.lolopponent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView mSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearchButton = (ImageView) findViewById(R.id.searchButton);
        mSearchButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mSearchButton){
            Intent intent = new Intent(MainActivity.this, PlayerActivity.class);
            startActivity(intent);
        }
    }
}
