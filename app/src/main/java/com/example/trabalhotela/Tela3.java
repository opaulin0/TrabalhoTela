package com.example.trabalhotela;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Activity para exibição de informações do projeto e dados acadêmicos.
 * Implementa métodos do ciclo de vida para monitoramento via log.
 */
public class Tela3 extends AppCompatActivity {

    private static final String TAG = "CICLO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        Log.d(TAG, "Tela 3: executou onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Tela 3: executou onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Tela 3: executou onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Tela 3: executou onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Tela 3: executou onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Tela 3: executou onDestroy");
    }
}