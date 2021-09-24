package com.example.beatsslayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

import com.tomer.fadingtextview.FadingTextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton resim_butonu;
    Animation animasyon;
    FadingTextView fadingtextview;
    MediaPlayer welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fadingtextview=findViewById(R.id.fade);
        resim_butonu=(ImageButton)findViewById(R.id.resim_butonu);
        resim_butonu.setOnClickListener(this);
        animasyon = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim1);
        welcome=MediaPlayer.create(getApplicationContext(),R.raw.welcome);

    }

    @Override
    public void onClick(View v) {

        //Intent i=new Intent(MainActivity.this,oyunsayfasi.class);
        resim_butonu.startAnimation(animasyon);
        welcome.start();
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(MainActivity.this, oyunsayfasi.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();

    }

}
