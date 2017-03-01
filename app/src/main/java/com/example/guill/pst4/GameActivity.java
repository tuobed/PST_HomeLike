package com.example.guill.pst4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

public class GameActivity extends AppCompatActivity {

    private Jeu jeu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On cré un objet "GameView" qui est le code principal du jeu
        jeu=new Jeu(this);

        // et on l'affiche.
        setContentView(jeu);
    }

}

