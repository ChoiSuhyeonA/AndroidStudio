package com.example.projcet7_5ex;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    View toastView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast toast = new Toast(getApplicationContext());

                ImageView img = new ImageView(getApplicationContext());
                img.setImageResource(R.drawable.android);
                toast.setView(img);
                //위치 지정
                Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                int xOffset = (int) (Math.random()*display.getWidth()); int yOffset = (int) (Math.random()*display.getHeight());


                toast.setGravity(Gravity.CENTER, 50, 50);
                toast.show();
            }
        });


    }
}

