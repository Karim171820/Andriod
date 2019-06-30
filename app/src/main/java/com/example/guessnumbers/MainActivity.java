package com.example.guessnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int num;
public void guessClick(View view){
    Log.i( "Random Number" ,Integer.toString(num));
    Log.i("Info", "Button pressed !");
    EditText et = (EditText)findViewById(R.id.editText);
    String sTextFromET = et.getText().toString();
    int number = new Integer(sTextFromET).intValue();

    if (number > num) {
        Toast.makeText(this, "Lower !", Toast.LENGTH_SHORT).show();
    }
    else if (number < num){
        Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
    }
    else if (number == num){
        Toast.makeText(this, "you win", Toast.LENGTH_SHORT).show();
    }
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        num = rand.nextInt(50);
    }
}
