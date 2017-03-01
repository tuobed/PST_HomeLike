package com.example.guill.pst4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/**
 * Created by Guill on 20/11/2016.
 */

public class Balle {
    private BitmapDrawable img=null; // image de la balle
    private int x,y; // coordonnées x,y de la balle en pixel
    private int balleLargeur, balleHauteur; // largeur et hauteur de la balle en pixels
    private int ecranLargeur,ecranHauteur; // largeur et hauteur de l'écran en pixels
    private boolean move = true; // 'true' si la balle doit se déplacer automatiquement, 'false' sinon

    // pour déplacer la balle on ajoutera INCREMENT à ses coordonnées x et y
    private static final int INCREMENT = 5;
    private int vitesseX=INCREMENT, vitesseY=INCREMENT;

    // contexte de l'application Android
    // il servira à accéder aux ressources, dont l'image de la balle
    private final Context context;

    public Balle(final Context c ) {

        x=0;
        y=0;
        context = c;
    }

    // on attribue à l'objet "Balle" l'image passée en paramètre
    // w et h sont sa largeur et hauteur définis en pixels
    public BitmapDrawable setImage(final Context c, final int ressource, final int w, final int h)
    {
        Drawable dr = c.getResources().getDrawable(ressource);
        Bitmap bitmap = ((BitmapDrawable) dr).getBitmap();
        return new BitmapDrawable(c.getResources(), Bitmap.createScaledBitmap(bitmap, w, h, true));
    }

    public boolean isMoving() {
        return move;
    }

    // définit si oui ou non la balle doit se déplacer automatiquement
    // car on la bloque sous le doigt du joueur lorsqu'il la déplace
    public void setMove(boolean move) {
        this.move = move;
    }

    public void setPositionX(int x) {
        this.x=x;
    }
    public void setPositionY(int y) {
        this.y=y;
    }
    public int getPositionX() {
        return x;
    }
    public int getPositionY() {
        return y;
    }
    public int getBalleLargeur() {
        return balleLargeur;
    }
    public int getBalleHauteur() {
        return balleHauteur;
    }

    public void resize(int largeurEcran, int hauteurEcran) {
        // wScreen et hScreen sont la largeur et la hauteur de l'écran en pixel
        // on sauve ces informations en variable globale, car elles serviront
        // à détecter les collisions sur les bords de l'écran
        ecranHauteur=hauteurEcran;
        ecranLargeur=largeurEcran;

        // on définit (au choix) la taille de la balle à 1/5ème de la largeur de l'écran
        balleLargeur=largeurEcran/5;
        balleHauteur=largeurEcran/5;
        img = setImage(context,R.mipmap.balle,balleLargeur,balleHauteur);
    }

    /*public void detecterLesCollisions() {
        if(move==false) {
            return;
        }
        else {
            x=x+vitesseX;
            y=y+vitesseY;

            if((x+balleLargeur) >= ecranLargeur) {
                vitesseX=-INCREMENT;
            }
            if((y+balleHauteur)> ecranHauteur) {
                vitesseY=-INCREMENT;
            }
            if(x<= 0) {
                vitesseX=INCREMENT;
            }
            if(y<= 0) {
                vitesseY=INCREMENT;
            }
            if(y+balleHauteur == ecranHauteur) {
                return;
            }
        }
    }  */
    public void draw(Canvas canvas)
    {
        if(img==null) {return;}
        canvas.drawBitmap(img.getBitmap(), x, y, null);
    }

}
