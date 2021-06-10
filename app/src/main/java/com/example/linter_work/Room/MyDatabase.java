package com.example.linter_work.Room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities =  {Api_table.class} , version = 1 , exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {
    public abstract DAO dao();
}