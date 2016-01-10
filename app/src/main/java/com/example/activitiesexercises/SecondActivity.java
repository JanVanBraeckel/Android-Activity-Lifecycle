package com.example.activitiesexercises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private int countCreate = 0, countStart = 0, countResume = 0, countRestart = 0;
    private TextView txvCreateCount, txvStartCount, txvResumeCount, txvRestartCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txvCreateCount = (TextView) findViewById(R.id.txvCreateCount);
        txvStartCount = (TextView) findViewById(R.id.txvStartCount);
        txvRestartCount = (TextView) findViewById(R.id.txvRestartCount);
        txvResumeCount = (TextView) findViewById(R.id.txvResumeCount);

        findViewById(R.id.closeSecond).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity.this.finish();
            }
        });

        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("countRestart"))
                countRestart = savedInstanceState.getInt("countRestart");
            if (savedInstanceState.containsKey("countResume"))
                countResume = savedInstanceState.getInt("countResume");
            if (savedInstanceState.containsKey("countStart"))
                countStart = savedInstanceState.getInt("countStart");
            if (savedInstanceState.containsKey("countCreate"))
                countCreate = savedInstanceState.getInt("countCreate");
        }

        ++countCreate;

        txvCreateCount.setText(Integer.toString(countCreate));
        txvRestartCount.setText(Integer.toString(countRestart));
        Log.i("activity", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        ++countStart;

        txvStartCount.setText(Integer.toString(countStart));
        Log.i("activity", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        ++countResume;

        txvResumeCount.setText(Integer.toString(countResume));
        Log.i("activity", "onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        ++countRestart;

        txvRestartCount.setText(Integer.toString(countRestart));
        Log.i("activity", "onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("activity", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("activity", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("activity", "onDestroy()");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("countCreate", countCreate);
        outState.putInt("countStart", countStart);
        outState.putInt("countResume", countResume);
        outState.putInt("countRestart", countRestart);
    }
}
