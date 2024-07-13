package com.example.unitconverter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button  button;
    EditText editText;
    TextView textView;

    public double unitConversion(double kilos){
        return kilos * 2.20462;


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
         editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView2);

        editText.setOnClickListener(v -> {

            String a=editText.getText().toString();
            double kilos=Double.parseDouble(a);
            double pound=unitConversion(kilos);
            textView.setText(""+pound);
        });

        }

    }
