package com.gmail.yamen.parssingdatausingintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yamen on 2/21/2017.
 */

public class DBhandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION =1;
    private static final String DATABASE_NAME = "users";
    private static final String DATABASE_TABLE ="user_info";
    private static final String _ID = "id";
    private static final String NAME ="name";
    private static final String PASSWORD = "password";

    public DBhandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable ="(create table "+DATABASE_TABLE+ "("
                +_ID+" integer primary key ,"
                +NAME+" text, "
                +PASSWORD+" text"+")";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        int version = oldVersion;
        if(version ==1){
            version=2;
        }
        if(version!=DATABASE_VERSION){
            db.execSQL("drop table if exists "+DATABASE_TABLE);
            onCreate(db);
        }
    }
    public void deleteDatabase(Context context){
        context.deleteDatabase(DATABASE_NAME);
    }

}
