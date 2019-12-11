package com.amy.database;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends SQLiteOpenHelper {

    public static String DATABASENAME = "Student1.sb";
    public static int DATABASEVERSION =  1;

    public MainActivity( Context context) {
        super(context, DATABASENAME, null, DATABASEVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE student1 (id INTEGER PRIMARY KEY AUTOINCREMENT , name TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }

    public  void onOpen (SQLiteDatabase db){
        super.onOpen(db);
    }

    //StudentDatabeseHelper dbHelper = new StudentDatabaseHelper (this.getActivity());
    //SQLiteDatabase db = dbHelper.getWritableDatabase();

}
