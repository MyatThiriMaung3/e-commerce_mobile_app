package com.selfstudy.mobiledev.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

    }

    public void finishCurrentActivity(View view) {
        finish();
    }

    public void switchToForgotPassword(View view) {
        Intent intentForgotPassword = new Intent(this, ForgotPasswordActivity.class);
        startActivity(intentForgotPassword);
    }
}