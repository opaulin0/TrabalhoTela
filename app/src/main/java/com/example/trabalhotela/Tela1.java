package com.example.trabalhotela;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;

public class Tela1 extends AppCompatActivity {
    private EditText editTextInput1;
    private EditText editTextInput2;
    private EditText editTextInput3;
    private Button buttonAcao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela1);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tv_titulo), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText etNome = findViewById(R.id.et_nome);
        EditText etIdade = findViewById(R.id.et_idade);
        EditText etEndereco = findViewById(R.id.et_endereco);
        Button btnSalvar = findViewById(R.id.btn_salvar);

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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_sobre) {
            Intent intent = new Intent(this, Tela3.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}