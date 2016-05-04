package com.example.ainhoa.materialdesing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton euro2, euro1, euro050, euro020, euro010, monedero;
    private TextView datoeuro2, datoeuro1, datoeuro050, datoeuro020, datoeuro010, datomonedero;
    private int contadoreuro2, contadoreuro1, contadoreuro050, contadoreuro020, contadoreuro010;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reset contadores
        //resetcontadores();

        //referencia a los objetos
        euro2 = (ImageButton) findViewById(R.id.euro2);
        datoeuro2 = (TextView) findViewById(R.id.eurodato2);
        euro1 = (ImageButton) findViewById(R.id.euro1);
        datoeuro1 = (TextView) findViewById(R.id.eurodato1);
        euro050 = (ImageButton) findViewById(R.id.euro050);
        datoeuro050 = (TextView) findViewById(R.id.eurodato050);
        euro020 = (ImageButton) findViewById(R.id.euro020);
        datoeuro020 = (TextView) findViewById(R.id.eurodato020);
        euro010 = (ImageButton) findViewById(R.id.euro010);
        datoeuro010 = (TextView) findViewById(R.id.eurodato010);

        monedero = (ImageButton) findViewById(R.id.monedero);
        datomonedero = (TextView) findViewById(R.id.datomonederolayout);


        //eventos 2€
        euro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro2++;
                datoeuro2.setText(String.valueOf(contadoreuro2));


            }
        });

        euro2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro2.setText("");
                contadoreuro2 = 0;

                Toast.makeText(getApplicationContext(), "reset 2€", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        //eventos 1€
        euro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro1++;
                datoeuro1.setText(String.valueOf(contadoreuro1));

            }
        });

        euro1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro1.setText("");
                contadoreuro1 = 0;

                Toast.makeText(getApplicationContext(), "reset 1€", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        //eventos 050€
        euro050.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro050++;
                datoeuro050.setText(String.valueOf(contadoreuro050));

            }
        });

        euro050.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro050.setText("");
                contadoreuro050 = 0;

                Toast.makeText(getApplicationContext(), "reset 050€", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        //eventos 020€
        euro020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro020++;

                datoeuro020.setText(String.valueOf(contadoreuro020));
            }
        });

        euro020.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro020.setText("");
                contadoreuro020 = 0;

                Toast.makeText(getApplicationContext(), "reset 0.20€", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        //eventos 010€
        euro010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro010++;

                datoeuro010.setText(String.valueOf(contadoreuro010));
            }
        });

        euro010.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro010.setText("");
                contadoreuro010 = 0;

                Toast.makeText(getApplicationContext(), "reset 010€", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        monedero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void resetcontadores() {
        contadoreuro2 = 0;
        contadoreuro1 = 0;
        contadoreuro050 = 0;
        contadoreuro020 = 0;
        contadoreuro010 = 0;
    }

    public double calculomonedero() {
        double monedero = (contadoreuro2 * 2) + (contadoreuro1 * 1) + (contadoreuro050 * 0.5) + (contadoreuro020 * 0.20) + (contadoreuro010 * 0.10);
        return monedero;

    }


}
