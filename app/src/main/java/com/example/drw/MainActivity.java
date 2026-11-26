package com.example.drw;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);

        EditText edtName = findViewById(R.id.edtName);
        TextView txtResult = findViewById(R.id.txtResult);
        Button btnhello = findViewById(R.id.btnHello);
        Button btnClear = findViewById(R.id.btnClear);

        btnhello.setOnClickListener(v ->{
            String name = edtName.getText().toString().trim();

            if (name.isEmpty()) {
                Toast.makeText(this, "Enter your name" , Toast.LENGTH_SHORT).show();
            }else {
                txtResult.setText("Hello, " + name  + "!");
            }
        });

        btnClear.setOnClickListener(v->{
            Toast.makeText(this, "Cleared" , Toast.LENGTH_SHORT).show();
            txtResult.setText("It will display your name here");
            edtName.setText("");


        });
    }
}