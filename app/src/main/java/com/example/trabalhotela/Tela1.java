package com.example.trabalhotela;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Activity principal que gerencia o formulário de entrada de dados.
 * Implementa métodos do ciclo de vida para monitoramento via log.
 */
public class Tela1 extends AppCompatActivity {

    private static final String TAG = "CICLO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        Log.d(TAG, "Tela 1: executou onCreate");

        EditText etNome = findViewById(R.id.et_nome);
        EditText etIdade = findViewById(R.id.et_idade);
        EditText etEndereco = findViewById(R.id.et_endereco);
        Button btnSalvar = findViewById(R.id.btn_salvar);
        ImageButton btnSobre = findViewById(R.id.btn_sobre_info);

        btnSalvar.setOnClickListener(v -> {
            String nome = etNome.getText().toString();
            String idade = etIdade.getText().toString();
            String endereco = etEndereco.getText().toString();

            Intent intent = new Intent(this, Tela2.class);
            intent.putExtra("NOME", nome);
            intent.putExtra("IDADE", idade);
            intent.putExtra("ENDERECO", endereco);
            startActivity(intent);
        });

        btnSobre.setOnClickListener(v -> {
            Intent intent = new Intent(this, Tela3.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Tela 1: executou onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Tela 1: executou onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Tela 1: executou onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Tela 1: executou onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Tela 1: executou onDestroy");
    }
}