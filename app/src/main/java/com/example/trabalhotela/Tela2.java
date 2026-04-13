package com.example.trabalhotela;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela2 extends AppCompatActivity {
    private TextView tvNome, tvIdade, tvEndereco;
    private Button btnSim, btnNao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela2);

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
        String nome = extras.getString("NOME");
        String idade = extras.getString("IDADE");
        String endereco = extras.getString("ENDERECO");

            tvNome.setText("Nome: " + nome);
            tvIdade.setText("Idade: " + idade);
            tvEndereco.setText("Endereço: " + endereco);

        btnSim.setOnClickListener(v -> {
            Intent intent = new Intent(Tela2.this, Tela3.class);
            startActivity(intent);
        });

        btnNao.setOnClickListener(v -> {
            finish();
        });
    }
}
