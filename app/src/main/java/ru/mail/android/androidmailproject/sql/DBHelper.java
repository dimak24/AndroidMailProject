package ru.mail.android.androidmailproject.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by dmitrykamaldinov on 11/10/17.
 */

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "Database", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table currencies_names ("
                + "name text, state integer);");
        db.execSQL(
                "CREATE TABLE currencies_rates (" +
                "base text, date text, toCompare text, rate float);");
        db.execSQL("CREATE TABLE picture (name text);");
        db.execSQL("CREATE TABLE whichCurrencies (only integer);");
        db.execSQL("CREATE TABLE frequency (frequency text);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
