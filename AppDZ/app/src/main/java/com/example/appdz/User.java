package com.example.appdz;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import io.reactivex.Completable;
import io.reactivex.Scheduler;

@Entity(tableName = "table_users")
public class User {

    @PrimaryKey(autoGenerate = true)
    private int  id;
    private String userName;
    private String userSurname;
    private int age;



    public User(String userName, String userSurname, int age) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.age = age;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + id +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", age=" + age +
                '}';
    }


}
