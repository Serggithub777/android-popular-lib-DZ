package com.example.appdz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Single;

import static java.lang.Integer.parseInt;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private UserPresenter userPresenter;
    @BindView(R.id.editText_Name)
    EditText edit_text_name;
    @BindView(R.id.editText_Surname)
    EditText edit_text_surname;
    @BindView(R.id.editTextId)
    EditText edit_text_id;
    @BindView(R.id.editTextAge)
    EditText edit_text_age;
    @BindView(R.id.editText_NumberAddSeveral)
    EditText edit_text_number_several;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        userPresenter = new UserPresenter();
        edit_text_name.setText("Current name");
        edit_text_surname.setText("Current surname");
        edit_text_id.setText("Current id");
        edit_text_age.setText("0");
    }

    @OnClick(R.id.button_Add_User)
    public void addUserActivity(View view) {
        String userName = edit_text_name.getText().toString();
        String userSurname = edit_text_surname.getText().toString();
        int age = parseInt(edit_text_age.getText().toString());
        userPresenter.addUser(userName,userSurname, age);
    }

    @OnClick(R.id.button_get_user)
    public void getUserByIdActivity(View view){
        int id = parseInt(edit_text_id.getText().toString());
        userPresenter.getUserById(id);

    }

    @OnClick(R.id.button_remove)
    public void deleteUserActivity(View view) {
        int id = parseInt(edit_text_id.getText().toString());
        User user = new User("", "", 1);
        user.setId(id);
        userPresenter.deleteUser(user);
    }

    @OnClick(R.id.button_upgrade)
    public void updateUserActivity(View view) {
        String userName = edit_text_name.getText().toString();
        String userSurname = edit_text_surname.getText().toString();
        int age = parseInt(edit_text_age.getText().toString());
        User user = new User(userName, userSurname, age);
        userPresenter.updateUser(user);
    }

    @OnClick(R.id.button_AddSeveral)
    public void addListUsersActivity(View view){
        int numberAddUsersList = parseInt(edit_text_number_several.getText().toString());
        userPresenter.insertList(numberAddUsersList);
    }



    @OnClick(R.id.button_clean)
    public void cleanAll() {
        cleanField(edit_text_id, "id");
        cleanField(edit_text_name, "name");
        cleanField(edit_text_surname, "surname");
        cleanField(edit_text_age, "age");
    }

    private void cleanField(EditText field, String hint) {
        field.setText("");
        field.setHint(hint);
    }
}
