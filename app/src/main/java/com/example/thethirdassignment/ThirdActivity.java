package com.example.thethirdassignment;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    LinearLayout linearLayout,list_message;
    TextView recipient_history;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        findViewByIds();

        Intent intent = getIntent();

        String[] text_message_array =  intent.getStringArrayExtra("text_message_array");
        String[] recipient_array = intent.getStringArrayExtra("recipient_array");

        for(int i = 0; i < text_message_array.length;i++){
            View inflatedView = getLayoutInflater().inflate(R.layout.msg_element,null,false);

            TextView textView = (TextView) inflatedView.findViewById(R.id.recipient_sent);
            TextView textView1 = (TextView) inflatedView.findViewById(R.id.text_message_sent);
            textView.setText(recipient_array[i]);
            textView1.setText(text_message_array[i]);
            list_message.addView(inflatedView);
        }

    }

    public void findViewByIds(){
        list_message = findViewById(R.id.list_message);
    }
}
