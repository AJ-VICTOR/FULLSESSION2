package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txtView;
    EditText txtEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        txtView = findViewById(R.id.textViewId);
        txtEdit = findViewById(R.id.editTextId);

        btn.setOnClickListener(new View.OnClickListener() {
            String displayOutput = "";
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "The Button has been clicked",
                        Toast.LENGTH_SHORT).show();
                displayOutput = txtEdit.getText().toString();
                txtView.setText(displayOutput);
            }
        });

    }
}