package com.johir.useraction.addingfragmentbyjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleFragment fragment = new SimpleFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_simple,fragment)
                .commit();
    }
}
