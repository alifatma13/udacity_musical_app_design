package com.udacity.fatma.musicalappdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PaymentActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Button home = findViewById(R.id.home);

        //Added OnClick Listener to the button
        home.setOnClickListener(this);
    }

    //Action to be performed on Button Click
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home:
                //Intent to go to Home Screen
                Intent home = new Intent(this, MainActivity.class);
                startActivity(home);
        }
    }
}
