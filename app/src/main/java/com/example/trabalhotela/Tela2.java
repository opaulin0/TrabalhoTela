package com.example.trabalhotela;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * Tela 2: Responsável por exibir os dados cadastrados na Tela 1.
 * Permite a confirmação dos dados ou o retorno para edição.
 */
public class Tela2 extends AppCompatActivity {
    private static final String TAG = "CICLO";
    private TextView tvNome, tvIdade, tvEndereco;
    private Button btnSim, btnNao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela2);
        Log.d(TAG, "Tela 2: executou onCreate");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ll_dados), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvNome = findViewById(R.id.tv_resultado_nome);
        tvIdade = findViewById(R.id.tv_resultado_idade);
        tvEndereco = findViewById(R.id.tv_resultado_endereco);
        btnSim = findViewById(R.id.btn_sim);
        btnNao = findViewById(R.id.btn_nao);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nome = extras.getString("NOME");
            String idade = extras.getString("IDADE");
            String endereco = extras.getString("ENDERECO");

            tvNome.setText("Nome: " + nome);
            tvIdade.setText("Idade: " + idade);
            tvEndereco.setText("Endereço: " + endereco);
        }

        btnSim.setOnClickListener(v -> {
            Toast.makeText(this, "Cadastro salvo com sucesso", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Tela2.this, Tela1.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnNao.setOnClickListener(v -> {
            finish();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Tela 2: executou onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Tela 2: executou onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Tela 2: executou onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Tela 2: executou onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Tela 2: executou onDestroy");
    }
}