package com.example.projcet7_6ex;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup gr;
    RadioButton rb;
    Button button;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.button);
        gr = findViewById(R.id.gr);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                View dlgView = View.inflate(MainActivity.this,R.layout.dialog,null);
                img = (ImageView) dlgView.findViewById(R.id.imageView1);
                dlg.setView(dlgView);
                switch (gr.getCheckedRadioButtonId()) {
                    case R.id.rg1: dlg.setTitle("강아지");
                    img.setImageResource(R.drawable.dog);
                    break;
                    case R.id.rg2: dlg.setTitle("고양이");
                    img.setImageResource(R.drawable.cat);
                    break; case R.id.rg3: dlg.setTitle("토끼");
                    img.setImageResource(R.drawable.rabbit);
                    break;
                    case R.id.rg4: dlg.setTitle("말");
                    img.setImageResource(R.drawable.horse);
                    break;
                }
                dlg.setPositiveButton("닫기",null);
                dlg.show();


            }
        });
    }
}
