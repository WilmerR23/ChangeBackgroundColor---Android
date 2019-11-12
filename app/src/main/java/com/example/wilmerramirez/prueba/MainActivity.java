package com.example.wilmerramirez.prueba;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private int currentColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn:
                int color = 0;
                if (currentColor == 0) {
                  color = Color.BLUE;
                  currentColor = 1;
                } else {
                    color = Color.WHITE;
                    currentColor = 0;
                }
                getWindow().getDecorView().setBackgroundColor(color);
                break;
        }

    }
}
