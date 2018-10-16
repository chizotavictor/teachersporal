package com.ikolilu.teachersportal;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.ikolilu.teachersportal.ui.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private TextView slogantext;
    private Button mSignIn;
    private Button mForgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slogantext = (TextView) findViewById(R.id.slogan);
        mSignIn    = (Button) findViewById(R.id.btnSignInx);
        mForgotPassword = (Button) findViewById(R.id.forgotPassword);


        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/NABILA.TTF");
        slogantext.setTypeface(typeface);

        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        mForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
