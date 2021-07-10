package com.example.tuitionfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button loginButton,registrationButton;
private RadioButton studentRButton,tutorRButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton=findViewById(R.id.signin);
        registrationButton=findViewById(R.id.registration);
        studentRButton=findViewById(R.id.student);
        tutorRButton=findViewById(R.id.tutor);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActivity();
            }
        });
        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!studentRButton.isChecked() && !tutorRButton.isChecked()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Please select one option above",
                            Toast.LENGTH_SHORT);

                    toast.show();

                }
                else {
                    openRegistrationActivity();
                }
            }
        });
    }
    public void openLoginActivity(){
        Intent intent1=new Intent(this, login.class);
        startActivity(intent1);
    }

    public void openRegistrationActivity(){
        Intent intent2=new Intent(this, registration.class);
        startActivity(intent2);
    }

}
