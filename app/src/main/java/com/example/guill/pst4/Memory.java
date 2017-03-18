package com.example.guill.pst4;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;



public class Memory extends AppCompatActivity {

    ImageView imageView11, imageView12, imageView13, imageView14, imageView21, imageView22, imageView23, imageView24, imageView31, imageView32, imageView33, imageView34;
    TextView tvScore, tvCount;
    Integer [] imageTab = {11, 12, 13, 14, 15, 16, 21, 22, 23, 24, 25, 26};
    int image11, image12, image13, image14, image15, image16, image21, image22, image23, image24, image25, image26;

    MediaPlayer mPlayer = null;
    SoundPool soundPool = null;
    int frontCard;
    int backCard;

    int firstCard, secondCard;
    int firstClick, secondClick;

    int cardNumber = 1;
    int score = 0;
    int countLeft = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
        tvScore = (TextView) findViewById(R.id.tvScore);
        tvCount = (TextView) findViewById(R.id.tvCount);

        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView31 = (ImageView) findViewById(R.id.imageView31);
        imageView32 = (ImageView) findViewById(R.id.imageView32);
        imageView33 = (ImageView) findViewById(R.id.imageView33);
        imageView34 = (ImageView) findViewById(R.id.imageView34);

        imageView11.setTag("0");
        imageView12.setTag("1");
        imageView13.setTag("2");
        imageView14.setTag("3");
        imageView21.setTag("4");
        imageView22.setTag("5");
        imageView23.setTag("6");
        imageView24.setTag("7");
        imageView31.setTag("8");
        imageView32.setTag("9");
        imageView33.setTag("10");
        imageView34.setTag("11");

        //charger les images
        loadFrontCard();

        Collections.shuffle(Arrays.asList(imageTab));


        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView11, laCarte);
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView12, laCarte);
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView13, laCarte);
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView14, laCarte);
            }
        });
        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView21, laCarte);
            }
        });
        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView22, laCarte);
            }
        });
        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView23, laCarte);
            }
        });
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView24, laCarte);
            }
        });
        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView31, laCarte);
            }
        });
        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView32, laCarte);
            }
        });
        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView33, laCarte);
            }
        });
        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int laCarte = Integer.parseInt((String) v.getTag());
                traiter(imageView34, laCarte);
            }
        });


    }

    private void traiter(ImageView carte, int laCarte) {
        if (imageTab[laCarte] == 11) {
            playSound(R.raw.audio_img11);
            carte.setImageResource(image11);
        } else if (imageTab[laCarte] == 12) {
            playSound(R.raw.audio_img12);
            carte.setImageResource(image12);
        } else if (imageTab[laCarte] == 13) {
            playSound(R.raw.audio_img13);
            carte.setImageResource(image13);
        } else if (imageTab[laCarte] == 14) {
            playSound(R.raw.audio_img14);
            carte.setImageResource(image14);
        } else if (imageTab[laCarte] == 15) {
            playSound(R.raw.audio_img15);
            carte.setImageResource(image15);
        } else if (imageTab[laCarte] == 16) {
            playSound(R.raw.audio_img16);
            carte.setImageResource(image16);
        } else if (imageTab[laCarte] == 21) {
            playSound(R.raw.audio_img11);
            carte.setImageResource(image21);
        } else if (imageTab[laCarte] == 22) {
            playSound(R.raw.audio_img12);
            carte.setImageResource(image22);
        } else if (imageTab[laCarte] == 23) {
            playSound(R.raw.audio_img13);
            carte.setImageResource(image23);
        } else if (imageTab[laCarte] == 24) {
            playSound(R.raw.audio_img14);
            carte.setImageResource(image24);
        } else if (imageTab[laCarte] == 25) {
            playSound(R.raw.audio_img15);
            carte.setImageResource(image25);
        } else if (imageTab[laCarte] == 26) {
            playSound(R.raw.audio_img16);
            carte.setImageResource(image26);
        }

        //regarder quel image est selectionner et et l'enregistrer dans une variable temporaire

        if (cardNumber == 1) {
            firstCard = imageTab[laCarte];
            if (firstCard > 20) {
                firstCard = firstCard - 10;
            }
            cardNumber = 2;
            firstClick = laCarte;
            carte.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = imageTab[laCarte];
            if (secondCard > 20) {
                secondCard = secondCard - 10;
            }
            cardNumber = 1;
            secondClick = laCarte;
            imageView11.setEnabled(false);
            imageView12.setEnabled(false);
            imageView13.setEnabled(false);
            imageView14.setEnabled(false);
            imageView21.setEnabled(false);
            imageView22.setEnabled(false);
            imageView23.setEnabled(false);
            imageView24.setEnabled(false);
            imageView31.setEnabled(false);
            imageView32.setEnabled(false);
            imageView33.setEnabled(false);
            imageView34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //regarder si les 2 images sont les mêmes
                    calculate();
                }
            }, 1000);

        }
    }

    private void calculate() {

        //si les images sont les mêmes, on les enlève
        if (firstCard == secondCard) {
            if (firstClick == 0) {
                imageView11.setVisibility(View.INVISIBLE);
            } else if (firstClick == 1) {
                imageView12.setVisibility(View.INVISIBLE);
            } else if (firstClick == 2) {
                imageView13.setVisibility(View.INVISIBLE);
            } else if (firstClick == 3) {
                imageView14.setVisibility(View.INVISIBLE);
            } else if (firstClick == 4) {
                imageView21.setVisibility(View.INVISIBLE);
            } else if (firstClick == 5) {
                imageView22.setVisibility(View.INVISIBLE);
            } else if (firstClick == 6) {
                imageView23.setVisibility(View.INVISIBLE);
            } else if (firstClick == 7) {
                imageView24.setVisibility(View.INVISIBLE);
            } else if (firstClick == 8) {
                imageView31.setVisibility(View.INVISIBLE);
            } else if (firstClick == 9) {
                imageView32.setVisibility(View.INVISIBLE);
            } else if (firstClick == 10) {
                imageView33.setVisibility(View.INVISIBLE);
            } else if (firstClick == 11) {
                imageView34.setVisibility(View.INVISIBLE);
            }


            if (secondClick == 0) {
                imageView11.setVisibility(View.INVISIBLE);
            } else if (secondClick == 1) {
                imageView12.setVisibility(View.INVISIBLE);
            } else if (secondClick == 2) {
                imageView13.setVisibility(View.INVISIBLE);
            } else if (secondClick == 3) {
                imageView14.setVisibility(View.INVISIBLE);
            } else if (secondClick == 4) {
                imageView21.setVisibility(View.INVISIBLE);
            } else if (secondClick == 5) {
                imageView22.setVisibility(View.INVISIBLE);
            } else if (secondClick == 6) {
                imageView23.setVisibility(View.INVISIBLE);
            } else if (secondClick == 7) {
                imageView24.setVisibility(View.INVISIBLE);
            } else if (secondClick == 8) {
                imageView31.setVisibility(View.INVISIBLE);
            } else if (secondClick == 9) {
                imageView32.setVisibility(View.INVISIBLE);
            } else if (secondClick == 10) {
                imageView33.setVisibility(View.INVISIBLE);
            } else if (secondClick == 11) {
                imageView34.setVisibility(View.INVISIBLE);
            }

            score++;

            tvScore.setText("Score : " + score);

        }else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    imageView11.setImageResource(R.drawable.ic_back);
                    imageView12.setImageResource(R.drawable.ic_back);
                    imageView13.setImageResource(R.drawable.ic_back);
                    imageView14.setImageResource(R.drawable.ic_back);
                    imageView21.setImageResource(R.drawable.ic_back);
                    imageView22.setImageResource(R.drawable.ic_back);
                    imageView23.setImageResource(R.drawable.ic_back);
                    imageView24.setImageResource(R.drawable.ic_back);
                    imageView31.setImageResource(R.drawable.ic_back);
                    imageView32.setImageResource(R.drawable.ic_back);
                    imageView33.setImageResource(R.drawable.ic_back);
                    imageView34.setImageResource(R.drawable.ic_back);
                }
            }, 2000);


        }

        imageView11.setEnabled(true);
        imageView12.setEnabled(true);
        imageView13.setEnabled(true);
        imageView14.setEnabled(true);
        imageView21.setEnabled(true);
        imageView22.setEnabled(true);
        imageView23.setEnabled(true);
        imageView24.setEnabled(true);
        imageView31.setEnabled(true);
        imageView32.setEnabled(true);
        imageView33.setEnabled(true);
        imageView34.setEnabled(true);


        countLeft--;
        tvCount.setText("Hit(s) left: " + countLeft);
        verifierSiFin();


    }

    private void verifierSiFin() {

        if(imageView11.getVisibility()==View.INVISIBLE &&
                imageView12.getVisibility()==View.INVISIBLE &&
                imageView13.getVisibility()==View.INVISIBLE &&
                imageView14.getVisibility()==View.INVISIBLE &&
                imageView21.getVisibility()==View.INVISIBLE &&
                imageView22.getVisibility()==View.INVISIBLE &&
                imageView23.getVisibility()==View.INVISIBLE &&
                imageView24.getVisibility()==View.INVISIBLE &&
                imageView31.getVisibility()==View.INVISIBLE &&
                imageView32.getVisibility()==View.INVISIBLE &&
                imageView33.getVisibility()==View.INVISIBLE &&
                imageView34.getVisibility()==View.INVISIBLE && countLeft!=0) {

            playSound(R.raw.yougotit);
            AlertDialog.Builder alerteDialog = new AlertDialog.Builder(Memory.this);
            alerteDialog.setMessage("YOU WIN!")
                        .setCancelable(false)
                        .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getApplicationContext(), Memory.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });

            AlertDialog alertDialog2 = alerteDialog.create();
            alertDialog2.show();

        }
        if(countLeft==0) {
            playSound(R.raw.tryagain);
            AlertDialog.Builder alerteDialog = new AlertDialog.Builder(Memory.this);
            alerteDialog.setMessage("GAME OVER")
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), Memory.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });

            AlertDialog alertDialog2 = alerteDialog.create();
            alertDialog2.show();
        }
    }

    private void loadFrontCard() {
        image11 = R.drawable.ic_image11;
        image12 = R.drawable.ic_image12;
        image13 = R.drawable.ic_image13;
        image14 = R.drawable.ic_image14;
        image15 = R.drawable.ic_image15;
        image16 = R.drawable.ic_image16;
        image21 = R.drawable.ic_image21;
        image22 = R.drawable.ic_image22;
        image23 = R.drawable.ic_image23;
        image24 = R.drawable.ic_image24;
        image25 = R.drawable.ic_image25;
        image26 = R.drawable.ic_image26;

    }

    private void playSound(int resId) {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
        mPlayer = MediaPlayer.create(this, resId);
        mPlayer.start();
    }



}
