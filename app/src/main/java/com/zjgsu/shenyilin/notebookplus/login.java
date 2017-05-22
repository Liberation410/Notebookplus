package com.zjgsu.shenyilin.notebookplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button_exit = (Button) findViewById(R.id.button_exit);
        button_exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        Button button_login= (Button) findViewById(R.id.button_login);
        button_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText username = (EditText) findViewById(R.id.text_username);
                EditText key = (EditText) findViewById(R.id.text_key);
                if (username.getText().toString().equals("1512180623") &&key.getText().toString().equals("303821")) {
                    String data = "1512180623";
                    String password = "303821";
                    Intent intent = new Intent(login.this, notebook.class);
                    intent.putExtra("extra_data", data);
                    intent.putExtra("extra_password", password);
                    startActivity(intent);
                } else {
                    Toast.makeText(login.this,"用户名与密码不匹配，请重新输入",Toast.LENGTH_SHORT).show();
                    key.setText("");
                }
            }
        });
    }
}
