package com.example.decar.todos;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class TodoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        Intent intent = getIntent();
        String content = intent.getStringExtra("Content");
        EditText ediToDo = (EditText) findViewById(R.id.editTodo);
        ediToDo.setText(content);
    }
}
