package com.example.linter_work.Room;


import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface DAO {

    @Insert
    public void Api_tableInsert(Api_table Api);

}
