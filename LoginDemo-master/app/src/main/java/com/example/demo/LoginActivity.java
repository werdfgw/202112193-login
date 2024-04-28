package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    
    private EditText edit_2;
    
    private Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edit_2 = findViewById(R.id.edit_2);
        btn_submit = findViewById(R.id.btn_submit);
        edit_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("密码是",charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        btn_submit.setOnClickListener(view -> {
            Toast.makeText(LoginActivity.this, "登录按钮被点击了", Toast.LENGTH_SHORT).show();
        });
    }
}