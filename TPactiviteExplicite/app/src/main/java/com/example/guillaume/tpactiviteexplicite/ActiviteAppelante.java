package com.example.guillaume.tpactiviteexplicite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActiviteAppelante extends Activity implements View.OnClickListener {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v == mButton) {
            Intent intention = new Intent(this,ActiviteSuivante.class);
            startActivity(intention);

        }
    }
}
