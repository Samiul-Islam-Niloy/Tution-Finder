package com.example.tuitionfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registration extends AppCompatActivity {
 private Button registrationBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        registrationBtn=findViewById(R.id.registerButtonId);

        registrationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomepageActivity();
            }
        });
    }
    public void openHomepageActivity(){
        Intent intent1=new Intent(this, homePage.class);
        startActivity(intent1);
    }
}
