package com.example.rijiben;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;
//创建数据库
public class sqlite extends SQLiteOpenHelper {

    public static  final  String CREATE_DIARY="create table diary(" +
            "id integer primary key autoincrement," +
            "name TEXT NOT NULL," +
            "title TEXT NOT NULL," +
            "content TEXT NOT NULL," +
            "time TEXT NOT NULL," +
            "photo TEXT)";
    private  Context mcontext;

    public sqlite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mcontext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DIARY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}