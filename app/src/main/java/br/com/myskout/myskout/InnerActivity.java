package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InnerActivity extends AppCompatActivity {
    // Declarar váriaveis que irão receber o xml
    EditText edtUsuario, edtSenha;
    Button btnEntrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Abrir o Layout
        setContentView(R.layout.inner_layout);

        // Declarar as váriaveis do java para receber as do xml, fazer uma ponte.
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        btnEntrar = findViewById(R.id.btnEntrar);

        //Criando a ação do btnEntrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario,senha;

                usuario = edtUsuario.getText().toString();
                senha = edtSenha.getText().toString();

                //Estrutura de decição else e if else para validar a entrada do usuário
                if(edtUsuario.equals("Senac")&& edtSenha.equals("Senac")) {
                    //Abrindo outro janela
                    //Duas formas de abrir uma janela

                   //1. startActivity(new Intent(getApplicationContext(), MenuPrincipalActivity.class));
                    //
                }else {
                    Toast.makeText(InnerActivity.this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();

                   //modos para dar foco, caso o usuário erre o login e senha
                   // edtUsuario.setText("");
                    //edtSenha.setText("");
                    //edtUsuario.requestFocus();
                    limparJanela();
                }

            }
        });

    }
    public void limparJanela(){
        edtUsuario.setText("");
        edtSenha.setText("");
        edtUsuario.requestFocus();
    }
    // Vai sair do Sistema
    public void sairSistema(View view) {
        finish();
    }
}