package com.example.lifecycleslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MyActivity";
    TextView textView;
    String state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "----------------- onCreate level message -----------------");
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            state = savedInstanceState.getString("STATE_KEY");
        }

        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text1);

    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        textView.setText(savedInstanceState.getString("TEXT_VIEW_KEY"));
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("TEXT_VIEW_KEY", textView.getText().toString());
        outState.putString("STATE_KEY", state);

        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }
    @Override
    public void onStart() {
        Log.v(TAG, "----------------- onStart level message -----------------");
        super.onStart();
    }
    @Override
    public void onResume(){
        Log.v(TAG, "----------------- onResume level message -----------------");
        super.onResume();
    }
    @Override
    public void onPause(){
        Log.v(TAG, "----------------- onPause level message -----------------");
        super.onPause();
    }
    @Override
    public void onStop(){
        Log.v(TAG, "----------------- onStop level message -----------------");
        super.onStop();
    }
    @Override
    public void onDestroy(){
        Log.v(TAG, "----------------- onDestroy level message -----------------");
        super.onDestroy();
    }
}