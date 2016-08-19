package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.*;
import android.database.sqlite.SQLiteOpenHelper;

/**
 *  Created by 琼 on 2016/8/19.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper{

    /**
     * Province表建表语句
     */
    public static final String CREAT_PROVINCE = "creat table Province (" +
            "id integer primary key autoincrement, " +
            "province_name text, " +
            "province_code text,)";

    /**
     *  City表建表语句
     */
    public static final String CREAT_CITY = "creat table City (" +
            "id integer primary key autoincrement, " +
            "city_name text, " +
            "city_code text, " +
            "province_id integer)";

    /**
     *  Country表建表语句
     */
    public static final String CREAT_COUNTY = "creat table County (" +
            "id integer primary key autocrement, " +
            "couny_name text, " +
            "county_code text, " +
            "city_id integer)";

    public CoolWeatherOpenHelper (Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate (SQLiteDatabase db) {
        db.execSQL(CREAT_PROVINCE); // 创建Province表
        db.execSQL(CREAT_CITY); // 创建City表
        db.execSQL(CREAT_COUNTY); // 创建County表
    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVertion, int newVertion) {

    }


}
