package com.johir.useraction.addingfragmentbyjava;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addFragment(View v){
        SimpleFragment fragment = new SimpleFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_simple,fragment)
                .commit();
    }

    public void removeFragment(View v){
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_simple);
        if(fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }
}
