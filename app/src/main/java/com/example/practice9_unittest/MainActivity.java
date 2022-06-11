package com.example.practice9_unittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email_input;
    EditText password_input;
    EditText confirmPassword_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.registerBtn);
        btn.setOnClickListener(v -> onRegisterButtonClick());

        email_input = findViewById(R.id.input_email);
        password_input = findViewById(R.id.input_password);
        confirmPassword_input = findViewById(R.id.input_password_confirmation);
    }

    public void onRegisterButtonClick() {
        validation validation_ex = new validation();

        String email = email_input.getText().toString();
        String password = password_input.getText().toString();
        String passwordConfirm = confirmPassword_input.getText().toString();

        user registering = new user(email, password, passwordConfirm);

        if (validation_ex.validate_user(registering)) Toast.makeText(getApplicationContext(),
                "Успешная регистрация!", Toast.LENGTH_SHORT).show();
        else Toast.makeText(getApplicationContext(),
                "Ошибка регистрации!", Toast.LENGTH_SHORT).show();
    }
}