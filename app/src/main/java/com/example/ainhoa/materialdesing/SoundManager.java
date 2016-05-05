package com.example.ainhoa.materialdesing;

/**
 * Created by Ainhoa on 05/05/2016.
 */

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;


public class SoundManager {

    private Context context;
    private SoundPool soundpool;
    private float leftVolumen = 1.0f;
    private float rightVolumen = 1.0f;

    //constructor
    public SoundManager(Context context) {
        this.context = context;
        soundpool = new SoundPool(16, AudioManager.STREAM_MUSIC, 100);
    }

    //devolvemos el sonido
    public int load(int idsound) {

        return soundpool.load(context, idsound, 1);
    }

}
