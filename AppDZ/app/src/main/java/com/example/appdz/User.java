package com.example.appdz;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_users")
public class User {

    @PrimaryKey(autoGenerate = true)
    private int  id;
    private String userName;
    private String userSurname;

    public int getUserId() {
        return id;
    }

    public void setUserId(int id) {
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

    private int age;

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
