package com.example.appdz;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class UserPresenter {
           public static final String TAG = "UserPresenter";
           private UserDao userDao;

           public UserPresenter() {
               userDao = App.getAppDatabase().userDao();
           }

           public void addUser(String userName, String userSurname,int age) {
               User user = new User(userName, userSurname, age);
               Disposable disposable = userDao.insert(user).subscribeOn(Schedulers.io())
                       .subscribe(id->{
                           Log.d(TAG, "addUser: " + id);
                       }, throwable -> {
                           Log.d(TAG, "addUser: " + throwable);
                       });
           }
           public void getUserById (int id) {
               Disposable disposable = userDao.getUserById(id).subscribeOn(Schedulers.io())
                       .subscribe(users->{
                           Log.d(TAG, "getUserById: " + users.get(0).toString());
                       }, throwable -> {
                           Log.d(TAG, "getUserById: " + throwable);
                      });
           }

    public void deleteUser(User user) {
               Disposable disposable = userDao.deleteUser(user).subscribeOn(Schedulers.io())
                       .subscribe(users->{
                           Log.d(TAG,"deleteUser: " + user.toString());
                       }, throwable -> {
                           Log.d(TAG, "deleteUser: " + throwable);
                       });
    }
    void updateUser (User user) {
               Disposable disposable = userDao.updateUser(user).subscribeOn(Schedulers.io())
                       .subscribe(users->{
                           Log.d(TAG, "updateUser: " + user.toString());
                       }, throwable -> {
                           Log.d(TAG, "updateUser: " + throwable);
                       });
    }
    void insertList (int numberAddUsersList){
         User user = new User("Fedor","Dostoevsky", 50);
        List<User> users = new ArrayList<>();
        for (int i = 0; i < numberAddUsersList; i++) {
            users.add(user);
        }
                Disposable disposable = userDao.insertList(users).subscribeOn(Schedulers.io())
                       .subscribe(usersList->{
                           Log.d(TAG, "updateUser: " + usersList.toString());
                       }, throwable -> {
                           Log.d(TAG, "updateUser: " + throwable);
                       });
    }

}
