package com.example.covertx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText rupeeAmt = findViewById(R.id.inputId);
        String amount = rupeeAmt.getText().toString();
        double dollarAmt = Double.parseDouble(amount) / 70;
        String toastText = String.valueOf(dollarAmt);
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
