package com.fapp.project.japanesedictionary.Database;

/**
 * Created by An on 12/02/2016.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DictDataHelper extends SQLiteAssetHelper{
    private static final String DATABASE_NAME = "JVD.db";
    private static final int DATABASE_VERSION = 1;

    public DictDataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}

