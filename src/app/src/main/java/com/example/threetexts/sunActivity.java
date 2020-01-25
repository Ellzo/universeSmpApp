package com.example.threetexts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class sunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun);
    }
    public void showToast(View view){
        Toast toast= Toast.makeText(this,R.string.sunMessage,Toast.LENGTH_LONG);
        toast.show();
    }
}
