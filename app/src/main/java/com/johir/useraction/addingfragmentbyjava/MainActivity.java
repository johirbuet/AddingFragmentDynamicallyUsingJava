package com.johir.useraction.addingfragmentbyjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    SimpleFragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = new SimpleFragment();

    }

    public void addFragment(View v){
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_simple,fragment)
                .commit();
    }

    public void removeFragment(View v){
        if(fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }
}
