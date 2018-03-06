package com.whysurfswim.bday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Lakshadeep-PC on 1/7/2018.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String message = getIntent().getExtras().getString("message");
        //Log.e("TAg",message+"iijioj");

    }
}
