package com.br.dados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void jogar(View view){
        ImageView imagemResultado = findViewById(R.id.imgResApp);
        ImageView imagemResultadoUs = findViewById(R.id.imgResUs);
        TextView resultado = findViewById(R.id.textoResultado);

        //dado App
        int numero = new Random().nextInt(6);

        switch(numero){
            case 0:
                imagemResultado.setImageResource(R.drawable.um);
                break;
            case 1:
                imagemResultado.setImageResource(R.drawable.dois);
                break;
            case 2:
                imagemResultado.setImageResource(R.drawable.tres);
                break;
            case 3:
                imagemResultado.setImageResource(R.drawable.quatro);
                break;
            case 4:
                imagemResultado.setImageResource(R.drawable.cinco);
                break;
            case 5:
                imagemResultado.setImageResource(R.drawable.seis);
                break;
        }

        // dado Usuário
        int numeroUs = new Random().nextInt(6);

        switch(numeroUs){
            case 0:
                imagemResultadoUs.setImageResource(R.drawable.um);
                break;
            case 1:
                imagemResultadoUs.setImageResource(R.drawable.dois);
                break;
            case 2:
                imagemResultadoUs.setImageResource(R.drawable.tres);
                break;
            case 3:
                imagemResultadoUs.setImageResource(R.drawable.quatro);
                break;
            case 4:
                imagemResultadoUs.setImageResource(R.drawable.cinco);
                break;
            case 5:
                imagemResultadoUs.setImageResource(R.drawable.seis);
                break;
        }

        if( numero > numeroUs) {//Aplicativo ganhou
            resultado.setText("App Ganhou!");

        }else if(numeroUs > numero) {//Usuario ganhou) {
            resultado.setText("Você Ganhou!");
        }else {
            resultado.setText("Empatamos!");
        }


    }
}