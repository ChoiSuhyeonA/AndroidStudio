package com.example.project7_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    FrameLayout frame;
    ImageView mountain1;
    ImageView mountain2;
    ImageView mountain3;
    EditText edit;
    Button button1;
    Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baseLayout = findViewById(R.id.baseLayout);
        frame = findViewById(R.id.frame);
        mountain1 = findViewById(R.id.mountain1);
        mountain2 = findViewById(R.id.mountain2);
        mountain3 = findViewById(R.id.mountain3);
        edit = findViewById(R.id.edit);
        button1=findViewById(R.id.button1);
        registerForContextMenu(button1);
        button2=findViewById(R.id.button2);
        registerForContextMenu(button2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater minflater = getMenuInflater();

        if(v==button1){
            menu.setHeaderTitle("배경색 변경");
            minflater.inflate(R.menu.menu2,menu);
        }
        if(v==button2){

            minflater.inflate(R.menu.menu3,menu);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1,menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.mountain1:
                mountain1.setVisibility(View.VISIBLE);
                mountain2.setVisibility(View.INVISIBLE);
                mountain3.setVisibility(View.INVISIBLE);
                mountain1.setSelected(true);
                return true;
            case R.id.mountain2:
                mountain2.setVisibility(View.VISIBLE);
                mountain1.setVisibility(View.INVISIBLE);
                mountain3.setVisibility(View.INVISIBLE);
                mountain2.setSelected(true);
                return true;
            case R.id.mountain3:
                mountain3.setVisibility(View.VISIBLE);
                mountain1.setVisibility(View.INVISIBLE);
                mountain2.setVisibility(View.INVISIBLE);
                mountain3.setSelected(true);
                return true;

            case R.id.rotate:
                String e;
                int result;
                e=edit.getText().toString();
                result=Integer.parseInt(e);
                if(e!=null) {
                    frame.setRotation(result);
                    return true;
                }
                else{
                    frame.setRotation(45);
                    return true;
                }

            case R.id.button1:
                frame.setRotation(45);
                return true;
            case R.id.button2:
                frame.setScaleX(2);
                return true;
        }

        return false;
    }
}
