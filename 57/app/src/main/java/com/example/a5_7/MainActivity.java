package com.example.a5_7;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(rgb(0, 255, 0));
        setContentView(baseLayout, params);

       LinearLayout baseLayout2 = new LinearLayout(this);
       baseLayout2.setOrientation(LinearLayout.HORIZONTAL);
       baseLayout2.setBackgroundColor(rgb(255, 0, 0));
        setContentView(baseLayout2, params);
        LinearLayout baseLayout3 = new LinearLayout(this);
        baseLayout3.setOrientation(LinearLayout.HORIZONTAL);
        baseLayout3.setBackgroundColor(rgb(255, 0, 0));
        setContentView(baseLayout3, params);

        baseLayout.addView(baseLayout2);
        baseLayout.addView(baseLayout3);


    }
}