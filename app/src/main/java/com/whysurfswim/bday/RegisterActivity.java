package com.whysurfswim.bday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Lakshadeep-PC on 1/7/2018.
 */

public class RegisterActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView mMyImageViewText =findViewById(R.id.myImageViewText);
        CharSequence testData;
        testData = getIntent().getExtras().getString("textData");
        mMyImageViewText.setText(testData);
    }
}
