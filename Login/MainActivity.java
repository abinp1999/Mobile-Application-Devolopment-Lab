package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView username=(TextView)findViewById(R.id.username);
        final TextView password=(TextView)findViewById(R.id.password);
        Button Loginbtn=(Button)findViewById(R.id.btn);

        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Objects.equals(username.getText().toString(), "admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "login successfull", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "login failed", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
