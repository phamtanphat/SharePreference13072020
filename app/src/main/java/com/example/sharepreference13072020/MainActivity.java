package com.example.sharepreference13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEdtUserName,mEdtPassWord;
    CheckBox mCbSave;
    Button mBtnLogin;
    SharedPreferences mSharedPreferences;
    SharedPreferences.Editor mEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtPassWord = findViewById(R.id.edittextPassword);
        mEdtUserName = findViewById(R.id.edittextUsername);
        mCbSave = findViewById(R.id.checkboxSave);
        mBtnLogin = findViewById(R.id.buttonLogin);

        mSharedPreferences = getSharedPreferences("AppSharePreference",MODE_PRIVATE);


        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mEdtUserName.getText().toString();
                String password = mEdtPassWord.getText().toString();

                if (username.isEmpty() || password.isEmpty()){
                    Toast.makeText(MainActivity.this, "Chua nhap du thong tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (username.equals("phat") && password.equals("123")){
                    Toast.makeText(MainActivity.this, "Dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                    if (mCbSave.isChecked()){

                    }
                }
            }
        });

    }
}