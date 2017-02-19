package com.gmail.yamen.parssingdatausingintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by yamen on 2/20/2017.
 */

public class secondActivit extends ActionBarActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        TextView show =(TextView) findViewById(R.id.userShow);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("userName");
        show.setText(name);

    }
}
