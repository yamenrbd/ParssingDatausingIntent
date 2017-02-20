package com.gmail.yamen.parssingdatausingintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by yamen on 2/20/2017.
 */

public class secondActivit extends ActionBarActivity{


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        TextView show =(TextView) findViewById(R.id.userShow);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("userName");
        Toast.makeText(secondActivit.this,name,Toast.LENGTH_LONG).show();
        show.setText(name);

    }
}
