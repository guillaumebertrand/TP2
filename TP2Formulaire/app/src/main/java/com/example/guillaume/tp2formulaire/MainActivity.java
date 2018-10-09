package com.example.guillaume.tp2formulaire;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btaction = (Button) findViewById(R.id.submit);
        btaction.setOnClickListener(this);

    }

    public void onClick{


    }

}
