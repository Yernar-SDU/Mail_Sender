package com.example.thethirdassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    LinearLayout msg_list;
    EditText login,recipient,text_message;
    TextView recipient_sent, text_message_sent;
    ArrayList<Message> message_array;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        message_array = new ArrayList<Message>();
        findViewByIds();
    }
    public void sent_message(View view){
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
        String[] text_message_array = new String[message_array.size()];
        String[] recipient_array = new String[message_array.size()];

        for(int i = 0; i < message_array.size(); i++){
            text_message_array[i] = message_array.get(i).getText_message();
            recipient_array[i] = message_array.get(i).getRecipient();
        }

        intent.putExtra("text_message_array",text_message_array);
        intent.putExtra("recipient_array",recipient_array);

        message_array.clear();

        startActivity(intent);

    }

    public void send(View view){
        login = (EditText) findViewById(R.id.login);
        recipient = (EditText) findViewById(R.id.recipient);
        text_message = (EditText) findViewById(R.id.text_message);

        if(recipient.getText().toString().equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),"Please write recipient name",Toast.LENGTH_SHORT);
            toast.show();
        }
        else{
            Message message = new Message(recipient.getText().toString(),text_message.getText().toString());
            message_array.add(message);
            Toast toast = Toast.makeText(getApplicationContext(),"Sent",Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void findViewByIds(){

        text_message_sent = (TextView) findViewById(R.id.text_message_sent);
        recipient_sent = (TextView) findViewById(R.id.recipient_sent);

    }

}
