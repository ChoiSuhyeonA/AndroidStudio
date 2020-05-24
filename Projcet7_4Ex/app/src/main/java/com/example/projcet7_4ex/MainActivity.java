package com.example.projcet7_4ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView Image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Image = findViewById(R.id.dog);

    }
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.op1:
                Image.setImageResource(R.drawable.dog);
                break;
            case R.id.op2:
                Image.setImageResource(R.drawable.cat);
                break;
            case R.id.op3:
                Image.setImageResource(R.drawable.rabbit);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
