package com.example.contexto_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_splash );

        TextView mTextView = (TextView) findViewById ( R.id.text );
        Handler esperar = new Handler (  );

        esperar.postDelayed ( new Runnable ( ) {
            @Override
            public void run() {
                try {

                    Intent intent = new Intent ( getApplicationContext (), MainActivity.class );
                    startActivity ( intent );


                } catch (Exception e) {
                    e.printStackTrace ( );
                } {

                }

            }
        }, 5000 );
    }
}