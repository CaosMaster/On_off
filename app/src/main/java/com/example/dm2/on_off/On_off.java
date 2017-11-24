package com.example.dm2.on_off;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class On_off extends AppCompatActivity {
    private RelativeLayout fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_off);

        fondo= (RelativeLayout) findViewById(R.id.backfondo);
    }

    public void apagar(View v){

        fondo.setBackgroundColor(Color.GRAY);
    }

    public void encender(View v){

        fondo.setBackgroundColor(Color.YELLOW);
    }
}
