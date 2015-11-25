package com.valla.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when user touches the button
     * @param view which fires the touch event
     */
    public void openApp(View view) {
        switch (view.getId()) {
            case R.id.buttonSpotify:
                displayToast("Spotify Streamer");
                break;
            case R.id.buttonScores:
                displayToast("Scores");
                break;
            case R.id.buttonLibrary:
                displayToast("Library");
                break;
            case R.id.buttonBuild:
                displayToast("Build it Bigger");
                break;
            case R.id.buttonReader:
                displayToast("XYZ Reader");
                break;
            case R.id.buttonCapstone:
                displayToast("Capstone");
                break;
            default:
        }
    }

    /**
     * Display Toast with App's Name
     * @param appName Application's Name
     */
    public void displayToast(String appName) {
        String toastMessage = "This button will launch my " + appName + " App";
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }
}
