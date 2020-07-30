package com.example.appdz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.editText_Name)
    EditText edit_text_name;
    @BindView(R.id.editText_Surname)
    EditText edit_text_surname;
    @BindView(R.id.editTextId)
    EditText edit_text_id;
    @BindView(R.id.editTextAge)
    EditText edit_text_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        edit_text_name.setText("Current name");
        edit_text_surname.setText("Current surname");
        edit_text_id.setText("Current id");
        edit_text_age.setText("Current age");
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
