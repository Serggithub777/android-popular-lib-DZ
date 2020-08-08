package com.example.appdz;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.Single;

@Dao
interface UserDao {
    @Query("SELECT * FROM table_users WHERE id = :id")
    Single<List<User>> getUserById(int id);

    @Insert
    Single<Long> insert(User user);

    @Insert
    Single<List<Long>> insertList(List<User> users);

    @Delete
    Single<Integer> deleteUser(User user);

    @Update
    Single<Integer> updateUser(User user);

}
