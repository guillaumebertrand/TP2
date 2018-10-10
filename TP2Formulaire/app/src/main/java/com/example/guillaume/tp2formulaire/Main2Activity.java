package com.example.guillaume.tp2formulaire;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Personne d = this.getIntent().getParcelableExtra("personne");
        TextView textPrenom = (TextView) findViewById(R.id.nomA);
        TextView textNom = (TextView)findViewById(R.id.prenomA);
        textPrenom.setText("Prénom : "+d.getPrenom());
        textNom.setText("Nom : "+d.getNom());
    }
}
