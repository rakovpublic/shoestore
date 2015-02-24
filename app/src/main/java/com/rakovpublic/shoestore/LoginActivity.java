package com.rakovpublic.shoestore;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginBut=(Button)findViewById(R.id.button_login);
        Button registerBut=(Button)findViewById(R.id.button_registration);
        Button forgotpassBut=(Button)findViewById(R.id.button_forgotpassword);
        registerBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
