package com.example.danielgarciavargas.TestWeb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextURL;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextURL = (EditText) findViewById(R.id.editTextURL);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
    }

    public void connect(View view){
        String url = editTextURL.getText().toString();

    }
}
