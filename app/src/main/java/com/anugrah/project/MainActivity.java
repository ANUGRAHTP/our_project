package com.anugrah.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void adminLogin(View v)
    {
        Intent intent=new Intent(this,adminLogin.class);
        startActivity(intent);
    }
    public void userLogin(View v)
    {
        Intent intent=new Intent(this,userLogin.class);
        startActivity(intent);
    }
    public void workerLogin(View v)
    {
        Intent intent=new Intent(this,workerLogin.class);
        startActivity(intent);
    }
}
