package com.example.damep_orenarones;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_send = findViewById(R.id.boton_enviar);
        btn_send.setOnClickListener(View -> Toast.makeText(this,"Se envio sus datos", Toast.LENGTH_SHORT).show());





    }
}