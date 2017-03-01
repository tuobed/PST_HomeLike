package com.example.guill.pst4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class Image extends AppCompatActivity {

    final Random rnd = new Random();
    int i=0;
    int flag;
    //Intent registerIntent = getIntent();
    //final String name = registerIntent.getStringExtra("name");
    //final String username = registerIntent.getStringExtra("username");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);


        final Button buttonImage = (Button) findViewById(R.id.buttonImage);
        final ImageView img = (ImageView) findViewById(R.id.imgRandom);
        final EditText editImage = (EditText) findViewById(R.id.nameImage);
        final ImageButton previousButton = (ImageButton) findViewById(R.id.previousButton);
        final ImageButton nextButton = (ImageButton) findViewById(R.id.nextButton);
        final TextView compteur = (TextView) findViewById(R.id.compteur);
        final ImageButton quitButton = (ImageButton) findViewById(R.id.quitButton);
        final TextView goodbadAnsewer = (TextView) findViewById(R.id.goodbadAnswer);

        // I have 3 images named img_0 to img_2, so...
        //final String str = "img_" + rnd.nextInt(2);


            //fonction(0,img);
            final String Array[] = {"back","buttocks","chest", "elbow","finger","foot","hair","hand","head","arm","knee","leg","neck","shoulder","stomach","toes"};
            final int Array2[] = new int[16];
            /* final String back = "back";
            final String buttocks = "buttocks";
            final String chest = "chest";
            final String elbow = "elbow";
            final String finger = "finger";
            final String foot = "foot";
            final String hair = "hair";
            final String hand = "hand";
            final String head = "head";
            final String arm = "arm";
            final String knee = "knee";
            final String leg = "leg";
            final String neck = "neck";
            final String shoulder = "shoulder";
            final String stomach = "stomach";
            final String toes = "toes";*/


            compteur.setText(i+1+"/16");
            goodbadAnsewer.setText("false");
            fonction(0,img);

            quitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent menuIntent = new Intent(Image.this, UserActivity.class);
                    Intent intent = getIntent();
                    String username = intent.getStringExtra("username");
                    String name = intent.getStringExtra("name");
                    menuIntent.putExtra("name", name);
                    menuIntent.putExtra("username", username);
                    Image.this.startActivity(menuIntent);

                }
            });

            previousButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i>0) {
                        i--;
                        fonction(i,img);
                        compteur.setText(i+1+"/16");
                        if(Array2[i] == 1) {
                            goodbadAnsewer.setText("Done");
                        }
                        else {
                            goodbadAnsewer.setText("false");
                        }
                    }
                }
            });

            nextButton.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i<15) {
                        i++;
                        fonction(i,img);
                        compteur.setText(i+1+"/16");
                        if(Array2[i] == 1) {
                            goodbadAnsewer.setText("Done");
                        }
                        else {
                            goodbadAnsewer.setText("false");
                        }
                    }
                }
            }));

            buttonImage.setOnClickListener(new View.OnClickListener() {

                @Override

                public void onClick(View v) {


                    if (i<=15) {
                        flag=Jeu(Array[i], editImage, v);
                        if(i==15 && flag==1) {
                            Array2[i]=1;
                        }
                        if(flag==1 && i<15) {
                            Array2[i] = 1;
                            i++;
                            compteur.setText(i+1+"/16");
                        }

                        if(flag==0) {
                            Array2[i] = 0;
                        }

                        /*if(i==16) {
                            compteur.setText(i+"/16");
                        }*/
                    }
                    /*else {
                        if(i>15)
                        i=1;
                        compteur.setText(i+"/16");
                    }*/

                    /*for(i=1; i<=15; i++) {
                        Jeu(Array[i-1], editImage, v);
                    }*/

                    switch(i) {
                        case 0: fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 1:
                            //Jeu(Array[i-1], editImage, v);
                            fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 2:
                            //Jeu(Array[i-1], editImage, v);
                            fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 3:
                            //Jeu(Array[i-1], editImage, v);
                            fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 4: //Jeu(Array[i-1], editImage, v);
                                fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 5: //Jeu(Array[i-1], editImage, v);
                                fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 6: //Jeu(Array[i-1], editImage, v);
                                fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 7: //Jeu(Array[i-1], editImage, v);
                                fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 8: //Jeu(Array[i-1], editImage, v);
                                fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 9: //Jeu(Array[i-1], editImage, v);
                                fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 10: //Jeu(Array[i-1], editImage, v);
                                 fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 11: //Jeu(Array[i-1], editImage, v);
                                 fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 12: //Jeu(Array[i-1], editImage, v);
                                 fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 13: //Jeu(Array[i-1], editImage, v);
                                 fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 14: //Jeu(Array[i-1], editImage, v);
                                 fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        case 15: //Jeu(Array[i-1], editImage, v);
                                 fonction(i,img);
                            if(Array2[i] == 1) {
                                goodbadAnsewer.setText("Done");
                            }
                            else {
                                goodbadAnsewer.setText("false");
                            }
                            break;

                        /*case 16: //Jeu(Array[i-1], editImage, v);
                                 fonction(0, img);
                            break;*/

                        /*case 17: Jeu(toes, editImage, v);
                                 fonction(0,img);
                                 i=1;
                                 break;*/
                    }

                }

            });
    }

    public void fonction(int i, ImageView img) {

        final String str = "img_" + i;
        img.setImageDrawable(getResources().getDrawable(getResourceID(str, "drawable", getApplicationContext())));
    }

    public int Jeu (final String ImageAnswer, EditText editTextImage, View v)
    {
        int flag;
        String nameImage = editTextImage.getText().toString();


        nameImage = nameImage.toLowerCase();
        int result = nameImage.compareTo(ImageAnswer);
        if (result == 0) {
            toast(v);
            flag=1;

        } else {
            toast2(v);
            flag=0;

        }

        return flag;
    }

    public void toast (View v) {
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        String message = username + " good job";
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }
    public void toast2 (View v) {
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        String message = username + " There is at least a mistake, check again =)";
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }

    protected final static int getResourceID (final String resName, final String resType, final Context ctx)
    {
        final int ResourceID = ctx.getResources().getIdentifier(resName, resType, ctx.getApplicationInfo().packageName);
        if (ResourceID == 0)
        {
            throw new IllegalArgumentException("No resource string found with name " + resName);
        }
        else
        {
            return ResourceID;
        }
    }
}
