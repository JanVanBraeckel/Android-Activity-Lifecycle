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

        ++countCreate;

        txvCreateCount.setText(Integer.toString(countCreate));
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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void endTwo(View view){
        this.finish();
    }
}
