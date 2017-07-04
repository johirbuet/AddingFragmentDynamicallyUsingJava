package com.johir.useraction.addingfragmentbyjava;

import android.support.annotation.StringDef;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "simple_fragment";
    public  boolean mUseFragment = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addFragment(View v){

        SimpleFragment fragment = SimpleFragment.newInstance("Passed to factory method");
        getSupportFragmentManager().beginTransaction()
                .addToBackStack(null)
                .add(R.id.fragment_simple,fragment,TAG)
                .commit();
    }

    public void removeFragment(View v){
        Fragment fragment = getSupportFragmentManager().findFragmentByTag(TAG);
        if(fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }

    public void displayMetric(View v){
        ScreenUtility utility = new ScreenUtility(this);
        String s = String.format("Width = %s, Height = %s",utility.getDpWidth(),utility.getDpHeight());
        Fragment fragment = SimpleFragment.newInstance(s);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_simple,fragment,TAG)
                .commit();

        if(utility.getDpWidth()>= 500){
            mUseFragment = true;
        }
        else
        {
            mUseFragment = false;
        }
    }
}
