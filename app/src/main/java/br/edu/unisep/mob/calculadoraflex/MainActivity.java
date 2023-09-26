package br.edu.unisep.mob.calculadoraflex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etGasolina;
    private EditText etEtanol;
    private Button btnCalcular;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etGasolina = findViewById(R.id.etGasolina);
        etEtanol = findViewById(R.id.etEtanol);
        tvResultado = findViewById(R.id.etResultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double vlrGasolina = Double.parseDouble(etGasolina.getText().toString());
                Double vlrEtanol = Double.parseDouble(etEtanol.getText().toString());

                double resultado = (vlrEtanol*100)/vlrGasolina;

                if (resultado<70){
                    tvResultado.setText("Abasteça Com Etanol!");
                }else{
                    tvResultado.setText("Abasteça Com Gasolina!");
                }
            }
        });

    }
}