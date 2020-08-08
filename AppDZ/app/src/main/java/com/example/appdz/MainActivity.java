package com.example.appdz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonSayHello;
    private TextView textViewHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewHello = findViewById(R.id.textVievHello);
        buttonSayHello = findViewById(R.id.buttonSayHello);
        sayHello();

    }

    private void sayHello() {
        buttonSayHello.setOnClickListener(new View.OnClickListener() {
            String text = "Hello!";
            @Override
            public void onClick(View v) {
                textViewHello.setText(text);
            }
        });
    }


}
