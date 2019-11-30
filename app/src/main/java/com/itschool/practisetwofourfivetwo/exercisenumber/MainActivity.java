package com.itschool.practisetwofourfivetwo.exercisenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextInput;
    Button buttonGame;
    TextView editTextSmall;
    Integer count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        editTextInput = findViewById(R.id.et_input);
        buttonGame = findViewById(R.id.bt_game);
        editTextSmall = findViewById(R.id.text_small);

        buttonGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameStart();
            }
        });
    }

    private void gameStart() {
        int number =(int) (1+ Math.random()*4);
        int inpNumber = Integer.parseInt(editTextInput.getText().toString());
        if (number == inpNumber) {
            count++;
            Intent intent = new Intent(MainActivity.this, /*имя активности здесь */ );
            startActivity(intent);
        }
        else {
            // допишите что делать, если число не угадано
        }
    }


}
