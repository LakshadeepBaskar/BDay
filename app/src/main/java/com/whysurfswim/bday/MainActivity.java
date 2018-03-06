package com.whysurfswim.bday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    EditText mUserNameEditText;
    Button mGenerateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserNameEditText = findViewById(R.id.username_editText);
        mGenerateButton = findViewById(R.id.generate_button);
        AdView adView = this.findViewById(R.id.adView);
        MobileAds.initialize(this, "ca-app-pub-6059528612565667/8468844477");
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        mGenerateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = mUserNameEditText.getText().toString();
                if (userText.isEmpty()) {
                    mUserNameEditText.setError("User name must be filled");
                } else {
                    Intent mIntent = new Intent(MainActivity.this, RegisterActivity.class);
                    mIntent.putExtra("textData", userText);
                    startActivity(mIntent);
                }
            }
        });
    }
}
