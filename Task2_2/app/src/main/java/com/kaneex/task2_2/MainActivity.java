package com.kaneex.task2_2;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText textView;
    Button button, button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (EditText) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Typeface type;
        switch (v.getId()) {
            case R.id.button:
                type = Typeface.createFromAsset(getAssets(), "font/Montserrat-Thin.otf");
                textView.setTypeface(type);
                break;
            case R.id.button2:
                type = Typeface.createFromAsset(getAssets(), "font/MontserratAlternates-SemiBold.otf");
                textView.setTypeface(type);
                break;
            case R.id.button3:
                type = Typeface.createFromAsset(getAssets(), "font/Chantelli_Antiqua.ttf");
                textView.setTypeface(type);
                break;
            case R.id.button4:
                type = Typeface.createFromAsset(getAssets(), "font/MontserratAlternates-ExtraBold.otf");
                textView.setTypeface(type);
                break;
            case R.id.button5:
                type = Typeface.createFromAsset(getAssets(), "font/GreatVibes-Regular.otf");
                textView.setTypeface(type);
                break;
            case R.id.button6:
                type = Typeface.createFromAsset(getAssets(), "font/SEASRN__.ttf");
                textView.setTypeface(type);
                break;
            default:
                break;
        }
    }
}
