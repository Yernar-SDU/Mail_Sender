package com.example.thethirdassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void compose(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }



    protected void findByIds(){
        btn1 = (Button) findViewById(R.id.compose);
    }
}
