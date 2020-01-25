package com.example.threetexts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class earthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth);
    }

    public void showToast(View view){
        Toast toast= Toast.makeText(this,R.string.earthMessage,Toast.LENGTH_LONG);
        toast.show();
    }
}
