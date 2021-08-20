package uk.ac.tees.aad.W9462875;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class IntroductionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_screen);

        final Runnable loginRunnable = new Runnable() {
            public void run() {
                redirect_to_login();
            }
        };
        Handler handler = new Handler();
        handler.postDelayed(loginRunnable,2000);

    }

    private void redirect_to_login() {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
        super.onBackPressed();
    }
}
