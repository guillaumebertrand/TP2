package com.example.guillaume.tppasserdonnees;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FenetreClass1 extends Activity {
    Activity lecontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenetre_class1);
        lecontext = this;
        final EditText textchampsaisie = (EditText) findViewById(R.id.text);
        Button btaction = (Button) findViewById(R.id.btecrire);

        btaction.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent defineIntent = new Intent(lecontext, FenetreClass2.class);
                Bundle objetbunble = new Bundle();

                objetbunble.putString("passInfo", textchampsaisie.getText().toString());
                defineIntent.putExtras(objetbunble);
                //lecontext.startActivity(defineIntent);
                lecontext.startActivityForResult(defineIntent,1);
            }
        });
    }
    protected void onActivityResult(int requestCode,int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == 200) {
                ((EditText) findViewById(R.id.text)).setText("Vous êtes revenu en arrière");
            }
        }
    }
}
