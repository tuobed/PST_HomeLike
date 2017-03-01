package com.example.guill.pst4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Guill on 20/11/2016.
 */

public class Jeu extends SurfaceView implements SurfaceHolder.Callback {

    private AffichageVideo affichageVideo;
    private Balle balle;

    public Jeu(Context context) {
        super(context);
        getHolder().addCallback(this);
        affichageVideo = new AffichageVideo(this);
        balle = new Balle(this.getContext());
    }

    public void doDraw(Canvas canvas) {
        if(canvas==null) {return;}

        // on efface l'écran, en blanc
        canvas.drawColor(Color.WHITE);

        // on dessine la balle
        balle.draw(canvas);
    }

    /*public void deplacerLaBalle() {
        balle.detecterLesCollisions();
    }*/

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        if(affichageVideo.getState()==Thread.State.TERMINATED) {
            affichageVideo=new AffichageVideo(this);
        }
        affichageVideo.setRunning(true);
        affichageVideo.start();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        boolean retry = true;
        affichageVideo.setRunning(false);
        while (retry) {
            try {
                affichageVideo.join();
                retry = false;
            }
            catch (InterruptedException e) {}
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int currentX = (int)event.getX();
        int currentY = (int)event.getY();

        switch (event.getAction()) {

            // code exécuté lorsque le doigt touche l'écran.
            case MotionEvent.ACTION_DOWN:
                // si le doigt touche la balle :
                if(currentX >= balle.getPositionX() &&
                        currentX <= balle.getPositionX()+balle.getBalleLargeur() &&
                        currentY >= balle.getPositionY() && currentY <= balle.getPositionY()+balle.getBalleHauteur() ) {
                    // on arrête de déplacer la balle
                    balle.setMove(false);
                }
                break;

            // code exécuté lorsque le doight glisse sur l'écran.
            case MotionEvent.ACTION_MOVE:
                // on déplace la balle sous le doigt du joueur
                // si elle est déjà sous son doigt (oui si on a setMove à false)
                if(!balle.isMoving()) {
                    balle.setPositionX(currentX);
                    balle.setPositionY(currentY);
                }
                break;

            // lorsque le doigt quitte l'écran
            case MotionEvent.ACTION_UP:
                // on reprend le déplacement de la balle
                balle.setMove(true);
        }

        return true;  // On retourne "true" pour indiquer qu'on a géré l'évènement
    }


    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int w, int h) {
        balle.resize(w,h); // on définit la taille de la balle selon la taille de l'écran
    }
}
