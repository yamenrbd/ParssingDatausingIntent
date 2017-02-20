package com.gmail.yamen.parssingdatausingintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText user ;
    public EditText pass;
    public Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.input_user);
        pass = (EditText) findViewById(R.id.input_pass);
        btn = (Button) findViewById(R.id.sign_in);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = user.getText().toString();
                Intent intent = new Intent(getApplicationContext(),secondActivit.class);
                intent.putExtra("userName",user.getText().toString());
                startActivity(intent);

             //  Toast.makeText(MainActivity.this,"hello mr "+name,Toast.LENGTH_LONG).show();
            }
        });



    }
}
