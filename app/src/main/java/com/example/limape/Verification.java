package com.example.limape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Verification extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);


//            submit.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    {
//                                String welcome = "Successfully Registered";
//                                // TODO : initiate successful registration experience
//                                Toast.makeText(getApplicationContext(), welcome, Toast.LENGTH_LONG).show();
//
//                            }


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        findViewById(R.id.button2);
        // textView.setText(message);
    }

    public void Welcome(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        Button button = (Button) findViewById(R.id.button3);
        // String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}