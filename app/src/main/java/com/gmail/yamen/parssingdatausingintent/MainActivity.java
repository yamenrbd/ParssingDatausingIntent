package com.gmail.yamen.parssingdatausingintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText user ;
    public EditText pass;
    public Button btn;
    public Button btn1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.input_user);
        pass = (EditText) findViewById(R.id.input_pass);
        btn = (Button) findViewById(R.id.sign_in);
        btn1 = (Button) findViewById(R.id.register);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = user.getText().toString();
                Intent intent = new Intent(getApplicationContext(),secondActivit.class);
                intent.putExtra("userName",user.getText().toString());
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }
}
