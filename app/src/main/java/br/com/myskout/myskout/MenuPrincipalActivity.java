package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class
MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {
    //Declarando variaveis globais
    CardView cardVagas, cardCandidatos, cardTalento, cardParceiros, cardPerfil, cardRecrutamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        //apresentando as variaveis xml para o java
        cardPerfil = findViewById(R.id.cardPerfil);
        cardRecrutamento = findViewById(R.id.cardRecrutamento);
        cardCandidatos = findViewById(R.id.cardCandidatos);
        cardTalento = findViewById(R.id.cardTalento);
        cardVagas = findViewById(R.id.cardVagas);
        cardParceiros = findViewById(R.id.cardParceiros);

        //Componentes, recebendo o evento e ação de click (fazer o click no butão)
        cardPerfil.setOnClickListener(this);
        cardRecrutamento.setOnClickListener(this);
        cardCandidatos.setOnClickListener(this);
        cardTalento.setOnClickListener(this);
        cardVagas.setOnClickListener(this);
        cardParceiros.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        // colocando e implementando a função do click do botão com CASE! (tem que fazer isso depois que fizer o de cima)


        switch (view.getId()) {
            case R.id.cardPerfil:
                startActivity(new Intent(
                        getApplicationContext(),
                        PerfilActivity.class
                ));
                finish();
                break;


            case R.id.cardRecrutamento:
                startActivity(new Intent(
                        getApplicationContext(),
                        RecrutadoresActivity.class
                ));
                finish();
                break;

            case R.id.cardCandidatos:
                startActivity(new Intent(
                        getApplicationContext(),
                        CanditadosActivity.class
                ));
                finish();
                break;

            case R.id.cardTalento:
                startActivity(new Intent(
                        getApplicationContext(),
                        TalentosActivity.class
                ));
                finish();
                break;

            case R.id.cardVagas:
                startActivity(new Intent(
                        getApplicationContext(),
                        VagasActivity.class
                ));
                finish();
                break;
            case R.id.cardParceiros:
                startActivity(new Intent(
                        getApplicationContext(),
                        ParceiriasActivity.class
                ));
                finish();
                break;
        }
    }
}