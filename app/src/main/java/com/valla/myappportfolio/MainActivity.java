package com.valla.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when user touches the button
     *
     * @param view - view that fired the touch event
     */
    public void openApp(View view) {
        switch (view.getId()) {
            case R.id.button1:
                displayToast("");
                break;
            case R.id.button2:
                displayToast("");
                break;
            case R.id.button3:
                displayToast("");
                break;
            case R.id.button4:
                displayToast("");
                break;
            case R.id.button5:
                displayToast("");
                break;
            case R.id.button6:
                displayToast("");
                break;
            default:
        }
    }

    public void displayToast(String toastMessage){

    }
}
