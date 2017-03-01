package com.example.guill.pst4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;

import java.util.Random;

public class UserActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        //Initialisation de nos variables
        final TextView Username = (TextView) findViewById(R.id.Username);
        final TextView welcomeMessage = (TextView) findViewById(R.id.welcomeMessage);
        final Button buttonPlay = (Button) findViewById(R.id.buttonPlay);



        //Cette partie permets d'afficher les messages de bienvenue de l'activity
        // Cette partie est a améliorer
        Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        final String username = intent.getStringExtra("username");

        String message = name + ", welcome to your user area";
        welcomeMessage.setText(message);
        Username.setText(username);

        //Si on click sur ce boutton, on accèdera au premier jeu
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent registerIntent = new Intent(UserActivity.this, Image.class);
                Intent registerIntent = new Intent(UserActivity.this, GameActivity.class);
                registerIntent.putExtra("name", name);
                registerIntent.putExtra("username", username);
                UserActivity.this.startActivity(registerIntent);
            }
        });


    }


}


