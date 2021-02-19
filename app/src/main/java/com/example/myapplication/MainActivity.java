package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    ImageView image;
    TextView text1;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        image = (ImageView) findViewById(R.id.Image);
        text1 = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView2);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                text1.setText("Банан");
                text2.setText("Этот фрукт богат протеином");
                image.setImageResource(R.drawable.banana);
                break;
            case R.id.button2:
                text1.setText("Киви");
                text2.setText("В нем больше всего в нем витамина с и калия");
                image.setImageResource(R.drawable.kiwi);
                break;
            case R.id.button3:
                text1.setText("Клубника");
                text2.setText("Богат витамин а b₁ b₂ b₅ b₆ b₉ с е");
                image.setImageResource(R.drawable.strawberry);
                break;
        }
    }
}