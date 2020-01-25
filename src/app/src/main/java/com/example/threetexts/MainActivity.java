package com.example.threetexts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void callSun(View view) {
        Intent intent=new Intent(this, sunActivity.class);
        startActivity(intent);
    }
    public void callEarth(View view) {
        Intent intent=new Intent(this, earthActivity.class);
        startActivity(intent);
    }
    public void callMoon(View view) {
        Intent intent=new Intent(this, moonActivity.class);
        startActivity(intent);
    }
}
