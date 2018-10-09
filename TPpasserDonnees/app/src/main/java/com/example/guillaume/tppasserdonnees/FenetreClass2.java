package com.example.guillaume.tppasserdonnees;

import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;

public class FenetreClass2 extends Activity {
    Activity lecontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenetre_class2);

        lecontext = this;
        lecontext.setTitle("fenetre 2");

        final EditText textchampsaisie = (EditText) findViewById(R.id.editText2);
        Bundle objetbunble = this.getIntent().getExtras();
        String InfoPasse = objetbunble.getString("passInfo" );
        textchampsaisie.setText(InfoPasse);

    }

}
