package com.uso.parcial1ejer1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText etMonto, etPorcentaje;
    TextView tvDescuento, tvTotal;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        etMonto = findViewById(R.id.etMonto);
        etPorcentaje = findViewById(R.id.etPorcentaje);
        tvDescuento = findViewById(R.id.tvDescuento);
        tvTotal = findViewById(R.id.tvTotal);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float monto = Float.parseFloat(etMonto.getText().toString());
                    float porcentaje = Float.parseFloat(etPorcentaje.getText().toString());
                    float descuento = monto * (porcentaje/100);
                    float total =  monto - descuento;

                    tvTotal.setText("Total: " + total);
                    tvDescuento.setText("Descuento: " + descuento);
                }catch(Exception ex){

                }

            }
        });
    }
}