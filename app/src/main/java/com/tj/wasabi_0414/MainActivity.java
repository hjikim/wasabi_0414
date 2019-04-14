package com.tj.wasabi_0414;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText contentEditTextUserID;
    EditText contentEditTextPassword;
    Button LoginBtn;
    Button signBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentEditTextUserID = findViewById(R.id.contentEditTextUserID);
        contentEditTextPassword = findViewById(R.id.contentEditTextPassword);
        LoginBtn = findViewById(R.id.LoginBtn);
        signBtn = findViewById(R.id.signBtn);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = contentEditTextUserID.getText().toString();
                String userPw = contentEditTextPassword.getText().toString();

                Toast.makeText(MainActivity.this, userId, Toast.LENGTH_SHORT).show();

                contentEditTextPassword.setText(String.format("ID : %s, PW : %s", userId, userPw ));
            }
        });


    }
}
