package com.example.android.donatoriide10;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void facebookPage(View view){

        try {
            Intent intentfb = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + "747432698720518"));
            if (intentfb.resolveActivity(getPackageManager()) != null) {
                startActivity(intentfb);
            }
        } catch (Exception e) {
            Intent intentfb =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/" + "donatoriide10"));
            if (intentfb.resolveActivity(getPackageManager()) != null) {
                startActivity(intentfb);
            }
        }
    }

}
