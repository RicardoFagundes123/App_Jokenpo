package com.example.user.jokenpo;

import android.support.v7.app.AppCompatActivity;
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
    public void selecionarPedra(View view){
        this.opcaoSelecionada("pedra");
    }
    public void selecionarPapel(View view){
        this.opcaoSelecionada("papel");
    }
    public void selecionarTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }
    public void opcaoSelecionada(String escolha) {
        int n = new Random().nextInt(3);
        ImageView img = findViewById(R.id.imageView5);
        TextView txt = findViewById(R.id.textView7);
        switch (n) {
            case 0:
                img.setImageResource(R.drawable.pedra);
                break;
            case 1:
                img.setImageResource(R.drawable.papel);
                break;
            case 2:
                img.setImageResource(R.drawable.tesoura);
                break;
        }
        switch (escolha) {
            case "pedra":
                   if(n==0) txt.setText("Empate!");
                   else if(n==1) txt.setText("Voce perdeu!");
                   else txt.setText("Voce ganhou!");
                break;
            case "papel":
                    if(n==1) txt.setText("Empate!");
                    else if(n==2) txt.setText("Voce perdeu!");
                    else txt.setText("Voce ganhou!");
                break;
            case "tesoura":
                    if(n==2) txt.setText("Empate!");
                    else if(n==0) txt.setText("Voce perdeu!");
                    else txt.setText("Voce ganhou!");
                break;
        }

    }
}
