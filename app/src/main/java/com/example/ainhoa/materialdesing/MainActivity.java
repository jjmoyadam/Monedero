package com.example.ainhoa.materialdesing;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.speech.tts.TextToSpeech;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener{

    private ImageButton euro2, euro1, euro050, euro020, euro010,euro005,euro002,euro001,monedero;
    private TextView datoeuro2, datoeuro1, datoeuro050, datoeuro020, datoeuro010,datoeuro005,datoeuro002,datoeuro001,datomonedero;
    private int contadoreuro2, contadoreuro1, contadoreuro050, contadoreuro020, contadoreuro010,contadoreuro005, contadoreuro002, contadoreuro001,monedassonido;
    private SoundManager sound;
    private SoundPool soundpool;
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //manager del sonido
        sound=new SoundManager(getApplicationContext());
        soundpool=new SoundPool(8,AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);

        //monedassonido=soundpool.load(getApplicationContext(),1,1);

        //objeto textToSpeech
        textToSpeech = new TextToSpeech( this, this );

        //

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

        euro005 = (ImageButton) findViewById(R.id.euro005);
        datoeuro005 = (TextView) findViewById(R.id.eurodato005);
        euro002 = (ImageButton) findViewById(R.id.euro002);
        datoeuro002 = (TextView) findViewById(R.id.eurodato002);
        euro001 = (ImageButton) findViewById(R.id.euro001);
        datoeuro001 = (TextView) findViewById(R.id.eurodato001);

        datomonedero = (TextView) findViewById(R.id.textView);
        monedero=(ImageButton) findViewById(R.id.monedero);


        //eventos 2€
        euro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro2++;
                datoeuro2.setText(String.valueOf(contadoreuro2));


                calculomonedero();

            }
        });

        euro2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro2.setText("");
                contadoreuro2 = 0;

                Toast.makeText(getApplicationContext(), "reset 2€", Toast.LENGTH_SHORT).show();
                calculomonedero();
                return false;
            }
        });
        //eventos 1€
        euro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro1++;
                datoeuro1.setText(String.valueOf(contadoreuro1));
                calculomonedero();

            }
        });

        euro1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro1.setText("");
                contadoreuro1 = 0;

                Toast.makeText(getApplicationContext(), "reset 1€", Toast.LENGTH_SHORT).show();
                calculomonedero();
                return false;
            }
        });
        //eventos 050€
        euro050.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro050++;
                datoeuro050.setText(String.valueOf(contadoreuro050));
                calculomonedero();

            }
        });

        euro050.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro050.setText("");
                contadoreuro050 = 0;

                Toast.makeText(getApplicationContext(), "reset 050€", Toast.LENGTH_SHORT).show();
                calculomonedero();
                return false;
            }
        });
        //eventos 020€
        euro020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro020++;

                datoeuro020.setText(String.valueOf(contadoreuro020));
                calculomonedero();
            }
        });

        euro020.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro020.setText("");
                contadoreuro020 = 0;

                Toast.makeText(getApplicationContext(), "reset 0.20€", Toast.LENGTH_SHORT).show();
                calculomonedero();
                return false;
            }
        });
        //eventos 010€
        euro010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro010++;
                datoeuro010.setText(String.valueOf(contadoreuro010));
                calculomonedero();
            }
        });

        euro010.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro010.setText("");
                contadoreuro010 = 0;
                Toast.makeText(getApplicationContext(), "reset 010€", Toast.LENGTH_SHORT).show();
                calculomonedero();
                return false;
            }
        });
        //eventos 005€
        euro005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadoreuro005++;
                datoeuro005.setText(String.valueOf(contadoreuro005));
                calculomonedero();
            }
        });

        euro005.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro005.setText("");
                contadoreuro005 = 0;
                Toast.makeText(getApplicationContext(), "reset 010€", Toast.LENGTH_SHORT).show();
                calculomonedero();
                return false;
            }
        });
        //eventos 002€
        euro002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro002++;
                datoeuro002.setText(String.valueOf(contadoreuro002));
                calculomonedero();
            }
        });

        euro002.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro002.setText("");
                contadoreuro002 = 0;
                Toast.makeText(getApplicationContext(), "reset 010€", Toast.LENGTH_SHORT).show();
                calculomonedero();
                return false;
            }
        });
        //eventos 001€
        euro001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadoreuro001++;
                datoeuro001.setText(String.valueOf(contadoreuro001));
                calculomonedero();
            }
        });

        euro001.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                datoeuro001.setText("");
                contadoreuro001 = 0;
                Toast.makeText(getApplicationContext(), "reset 010€", Toast.LENGTH_SHORT).show();
                calculomonedero();
                return false;
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

    public void calculomonedero() {
        double monedero = (contadoreuro2 * 2) + (contadoreuro1 * 1) + (contadoreuro050 * 0.5) + (contadoreuro020 * 0.20) + (contadoreuro010 * 0.10)+ (contadoreuro005 * 0.05)+ (contadoreuro002 * 0.02)+ (contadoreuro001 * 0.01);
        DecimalFormat df=new DecimalFormat("#.##");
        datomonedero.setText(String.valueOf(df.format(monedero)));

        textToSpeech.setLanguage(new Locale("spa", "ESP"));
        speak(datomonedero.getText().toString()+"euros");


    }
    @Override
    public void onInit( int status )
    {
        if ( status == TextToSpeech.LANG_MISSING_DATA | status == TextToSpeech.LANG_NOT_SUPPORTED )
        {
            Toast.makeText( this, "ERROR LANG_MISSING_DATA | LANG_NOT_SUPPORTED", Toast.LENGTH_SHORT ).show();
        }
    }


    private void speak(String str) {
        textToSpeech.speak(str, TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.0f);
        textToSpeech.setPitch(0.0f);
    }

    @Override
    protected void onDestroy() {
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
    }


}
