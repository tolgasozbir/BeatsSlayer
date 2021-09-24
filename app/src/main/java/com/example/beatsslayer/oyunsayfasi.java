package com.example.beatsslayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class oyunsayfasi extends AppCompatActivity implements View.OnClickListener {

//button
    Button btnmelody1,btnmelody2,btnmelody3,btnmelody4;
    Button btnkick1,btnkick2,btnkick3,btnclap2;
    Button btnoneshot1,btnoneshot2,btnoneshot3,btnoneshot4;
    Button btndrum1,btndrum2,btndrum3,btnclap1;
    Button btnstratch1,btnstratch2,btnstratch3,btnstratch4;
    Button btnloop1,btnloop2,btnloop3,btnloop4;
    Button btnseskapat;

    //mediaplayer
    MediaPlayer loop1,loop2,loop3,loop4;
    MediaPlayer Oneshot1,Oneshot2,Oneshot3,Oneshot4;
    MediaPlayer Scratch1,Scratch2,Scratch3,Scratch4;
    MediaPlayer Drum1,Drum2,Drum3,Clap;
    MediaPlayer Kick1,Kick2,Kick3,Clap2;
    MediaPlayer melody1,melody2,melody3,melody4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyunsayfasi);

        //button tanımlaması

        btnseskapat=(Button)findViewById(R.id.btnseskapat);

        btnmelody1=(Button)findViewById(R.id.btnMelody1);
        btnmelody2=(Button)findViewById(R.id.btnMelody2);
        btnmelody3=(Button)findViewById(R.id.btnMelody3);
        btnmelody4=(Button)findViewById(R.id.btnMelody4);

        btnkick1 = (Button)findViewById(R.id.btnKick1);
        btnkick2 = (Button)findViewById(R.id.btnKick2);
        btnkick3 = (Button)findViewById(R.id.btnKick3);
        btnclap2 = (Button)findViewById(R.id.btnClap2);

        btndrum1 = (Button)findViewById(R.id.btnDrum1);
        btndrum2 = (Button)findViewById(R.id.btnDrum2);
        btndrum3 = (Button)findViewById(R.id.btnDrum3);
        btnclap1=(Button)findViewById(R.id.btnClap1);

        btnoneshot1 = (Button)findViewById(R.id.btnOneshot1);
        btnoneshot2 = (Button)findViewById(R.id.btnOneshot2);
        btnoneshot3 = (Button)findViewById(R.id.btnOneshot3);
        btnoneshot4 = (Button)findViewById(R.id.btnOneshot4);

        btnstratch1 = (Button)findViewById(R.id.btnsSratch1);
        btnstratch2 = (Button)findViewById(R.id.btnsSratch2);
        btnstratch3 = (Button)findViewById(R.id.btnsSratch3);
        btnstratch4 = (Button)findViewById(R.id.btnsSratch4);

        btnloop1 = (Button)findViewById(R.id.btnLoop1);
        btnloop2 = (Button)findViewById(R.id.btnLoop2);
        btnloop3 = (Button)findViewById(R.id.btnLoop3);
        btnloop4 = (Button)findViewById(R.id.btnLoop4);

        //mediaplayer tanımlaması
        loop1 = MediaPlayer.create(getApplicationContext(), R.raw.loop1);
        loop2  = MediaPlayer.create(getApplicationContext(),R.raw.loop2);
        loop3  = MediaPlayer.create(getApplicationContext(),R.raw.loop3);
        loop4  = MediaPlayer.create(getApplicationContext(),R.raw.loop4);

        Oneshot1 = MediaPlayer.create(getApplicationContext(),R.raw.oneshot1);
        Oneshot2 = MediaPlayer.create(getApplicationContext(),R.raw.oneshot2);
        Oneshot3 = MediaPlayer.create(getApplicationContext(),R.raw.oneshot3);
        Oneshot4 = MediaPlayer.create(getApplicationContext(),R.raw.oneshot4);

        Scratch1=MediaPlayer.create(getApplicationContext(),R.raw.scratch1);
        Scratch2=MediaPlayer.create(getApplicationContext(),R.raw.scratch2);
        Scratch3=MediaPlayer.create(getApplicationContext(),R.raw.scratch3);
        Scratch4=MediaPlayer.create(getApplicationContext(),R.raw.scratch4);

        Drum1=MediaPlayer.create(getApplicationContext(),R.raw.drum1);
        Drum2=MediaPlayer.create(getApplicationContext(),R.raw.drum2);
        Drum3=MediaPlayer.create(getApplicationContext(),R.raw.drum3);
        Clap=MediaPlayer.create(getApplicationContext(),R.raw.clap);

        Kick1=MediaPlayer.create(getApplicationContext(),R.raw.kick1);
        Kick2=MediaPlayer.create(getApplicationContext(),R.raw.kick2);
        Kick3=MediaPlayer.create(getApplicationContext(),R.raw.kick3);
        Clap2=MediaPlayer.create(getApplicationContext(),R.raw.clap2);

        melody1=MediaPlayer.create(getApplicationContext(),R.raw.melody1);
        melody2=MediaPlayer.create(getApplicationContext(),R.raw.melody2);
        melody3=MediaPlayer.create(getApplicationContext(),R.raw.melody3);
        melody4=MediaPlayer.create(getApplicationContext(),R.raw.melody4);

        //tıklama eventi

        //sesleri kapat btn

        btnseskapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(loop1.isLooping()) {
                    loop1.pause();
                    loop1.seekTo(0);
                    loop1.setLooping(false);
                    btnloop1.setTextColor(getResources().getColor(R.color.btntextloop));
                    btnloop1.setBackgroundResource(R.drawable.button_shape26);
                }

                if(loop2.isLooping()) {
                    loop2.pause();
                    loop2.seekTo(0);
                    loop2.setLooping(false);
                    btnloop2.setTextColor(getResources().getColor(R.color.btntextloop));
                    btnloop2.setBackgroundResource(R.drawable.button_shape27);
                }

                if(loop3.isLooping()) {
                    loop3.pause();
                    loop3.seekTo(0);
                    loop3.setLooping(false);
                    btnloop3.setTextColor(getResources().getColor(R.color.btntextloop));
                    btnloop3.setBackgroundResource(R.drawable.button_shape28);
                }

                if(loop4.isLooping()) {
                    loop4.pause();
                    loop4.seekTo(0);
                    loop4.setLooping(false);
                    btnloop4.setTextColor(getResources().getColor(R.color.btntextloop));
                    btnloop4.setBackgroundResource(R.drawable.button_shape29);
                }

                if(Scratch1.isPlaying()) {
                    Scratch1.pause();
                    Scratch1.seekTo(0);
                }

                if(Scratch2.isPlaying()) {
                    Scratch2.pause();
                    Scratch2.seekTo(0);
                }

                if(Scratch3.isPlaying()) {
                    Scratch3.pause();
                    Scratch3.seekTo(0);
                }

                if(Scratch4.isPlaying()) {
                    Scratch4.pause();
                    Scratch4.seekTo(0);
                }

                if(Oneshot1.isPlaying()) {
                    Oneshot1.pause();
                    Oneshot1.seekTo(0);
                }

                if(Oneshot2.isPlaying()) {
                    Oneshot2.pause();
                    Oneshot2.seekTo(0);
                }

                if(Oneshot3.isPlaying()) {
                    Oneshot3.pause();
                    Oneshot3.seekTo(0);
                }

                if(Oneshot4.isPlaying()) {
                    Oneshot4.pause();
                    Oneshot4.seekTo(0);
                }

                if(Drum1.isLooping()) {
                    Drum1.pause();
                    Drum1.seekTo(0);
                    Drum1.setLooping(false);
                    btndrum1.setTextColor(getResources().getColor(R.color.btndrum2));
                    btndrum1.setBackgroundResource(R.drawable.button_shape12);
                }
                if(Drum2.isLooping()) {
                    Drum2.pause();
                    Drum2.seekTo(0);
                    Drum2.setLooping(false);
                    btndrum2.setTextColor(getResources().getColor(R.color.btndrum3));
                    btndrum2.setBackgroundResource(R.drawable.button_shape13);
                }

                if(Drum3.isLooping()) {
                    Drum3.pause();
                    Drum3.seekTo(0);
                    Drum3.setLooping(false);
                    btndrum3.setTextColor(getResources().getColor(R.color.btndrum4));
                    btndrum3.setBackgroundResource(R.drawable.button_shape14);
                }

                if(Clap.isLooping()) {
                    Clap.pause();
                    Clap.seekTo(0);
                    Clap.setLooping(false);
                    btnclap1.setTextColor(getResources().getColor(R.color.btnclap1));
                    btnclap1.setBackgroundResource(R.drawable.button_shape15);
                }

                if(Kick1.isLooping()) {
                    Kick1.pause();
                    Kick1.seekTo(0);
                    Kick1.setLooping(false);
                    btnkick1.setTextColor(getResources().getColor(R.color.btnkick2));
                    btnkick1.setBackgroundResource(R.drawable.button_shape7);
                }

                if(Kick2.isLooping()) {
                    Kick2.pause();
                    Kick2.seekTo(0);
                    Kick2.setLooping(false);
                    btnkick2.setTextColor(getResources().getColor(R.color.btnkick3));
                    btnkick2.setBackgroundResource(R.drawable.button_shape8);
                }

                if(Kick3.isLooping()) {
                    Kick3.pause();
                    Kick3.seekTo(0);
                    Kick3.setLooping(false);
                    btnkick3.setTextColor(getResources().getColor(R.color.btnkick3));
                    btnkick3.setBackgroundResource(R.drawable.button_shape9);
                }

                if(Clap2.isLooping()) {
                    Clap2.pause();
                    Clap2.seekTo(0);
                    Clap2.setLooping(false);
                    btnclap2.setTextColor(getResources().getColor(R.color.btnclap2));
                    btnclap2.setBackgroundResource(R.drawable.button_shape10);
                }

                if(melody1.isLooping()) {
                    melody1.pause();
                    melody1.seekTo(0);
                    melody1.setLooping(false);
                    btnmelody1.setTextColor(getResources().getColor(R.color.btnmelody2));
                    btnmelody1.setBackgroundResource(R.drawable.button_shape2);
                }

                if(melody2.isLooping()) {
                    melody2.pause();
                    melody2.seekTo(0);
                    melody2.setLooping(false);
                    btnmelody2.setTextColor(getResources().getColor(R.color.btnmelody3));
                    btnmelody2.setBackgroundResource(R.drawable.button_shape3);
                }

                if(melody3.isLooping()) {
                    melody3.pause();
                    melody3.seekTo(0);
                    melody3.setLooping(false);
                    btnmelody3.setTextColor(getResources().getColor(R.color.btnmelody4));
                    btnmelody3.setBackgroundResource(R.drawable.button_shape4);
                }

                if(melody4.isLooping()) {
                    melody4.pause();
                    melody4.seekTo(0);
                    melody4.setLooping(false);
                    btnmelody4.setTextColor(getResources().getColor(R.color.btnmelody5));
                    btnmelody4.setBackgroundResource(R.drawable.button_shape5);
                }
            }
        });

        ////////////////////////////

        //loop1-4

        btnloop1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (loop1.isLooping())
                {
                    btnloop1.setTextColor(getResources().getColor(R.color.btntextloop));
                    btnloop1.setBackgroundResource(R.drawable.button_shape26);
                    loop1.pause();
                    loop1.seekTo(0);
                    loop1.setLooping(false);
                }
                else
                {
                    btnloop1.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnloop1.setBackgroundResource(R.color.btnloops);
                    loop1.start();
                    loop1.setLooping(true);
                }
            }
        });

        btnloop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loop2.isLooping())
                {
                    btnloop2.setTextColor(getResources().getColor(R.color.btntextloop));
                    btnloop2.setBackgroundResource(R.drawable.button_shape27);
                    loop2.pause();
                    loop2.seekTo(0);
                    loop2.setLooping(false);
                }
                else
                {
                    btnloop2.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnloop2.setBackgroundResource(R.color.btnloops);
                    loop2.start();
                    loop2.setLooping(true);
                }
            }
        });

        btnloop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loop3.isLooping())
                {
                    btnloop3.setTextColor(getResources().getColor(R.color.btntextloop));
                    btnloop3.setBackgroundResource(R.drawable.button_shape28);
                    loop3.pause();
                    loop3.seekTo(0);
                    loop3.setLooping(false);
                }
                else
                {
                    btnloop3.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnloop3.setBackgroundResource(R.color.btnloops);
                    loop3.start();
                    loop3.setLooping(true);
                }
            }
        });

        btnloop4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loop4.isLooping())
                {
                    btnloop4.setTextColor(getResources().getColor(R.color.btntextloop));
                    btnloop4.setBackgroundResource(R.drawable.button_shape29);
                    loop4.pause();
                    loop4.seekTo(0);
                    loop4.setLooping(false);
                }
                else
                {
                    btnloop4.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnloop4.setBackgroundResource(R.color.btnloops);
                    loop4.start();
                    loop4.setLooping(true);
                }
            }
        });



        //stratch1-4

        btnstratch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Scratch1.isPlaying())
                {
                    Scratch1.seekTo(0);
                    Scratch1.start();
                }
                else{
                    Scratch1.start();
                }

            }
        });

        btnstratch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Scratch2.isPlaying())
                {
                    Scratch2.seekTo(0);
                    Scratch2.start();
                }
                else{
                    Scratch2.start();
                }

            }
        });

        btnstratch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Scratch3.isPlaying())
                {
                    Scratch3.seekTo(0);
                    Scratch3.start();
                }
                else{
                    Scratch3.start();
                }

            }
        });

        btnstratch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Scratch4.isPlaying())
                {
                    Scratch4.seekTo(0);
                    Scratch4.start();
                }
                else{
                    Scratch4.start();
                }

            }
        });

        //oneshot1-4

        btnoneshot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Oneshot1.isPlaying())
                {
                    Oneshot1.seekTo(0);
                    Oneshot1.start();
                }
                else
                {
                    Oneshot1.start();
                }
            }
        });


        btnoneshot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Oneshot2.isPlaying())
                {
                    Oneshot2.seekTo(0);
                    Oneshot2.start();
                }
                else
                {
                    Oneshot2.start();
                }
            }
        });

        btnoneshot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Oneshot3.isPlaying())
                {
                    Oneshot3.seekTo(0);
                    Oneshot3.start();
                }
                else
                {
                    Oneshot3.start();
                }
            }
        });

        btnoneshot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Oneshot4.isPlaying())
                {
                    Oneshot4.seekTo(0);
                    Oneshot4.start();
                }
                else
                {
                    Oneshot4.start();
                }
            }
        });


        //Drums1-3 + 1 clap

        btndrum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Drum1.isLooping())
                {
                    btndrum1.setTextColor(getResources().getColor(R.color.btndrum2));
                    btndrum1.setBackgroundResource(R.drawable.button_shape12);
                    Drum1.pause();
                    Drum1.seekTo(0);
                    Drum1.setLooping(false);
                }
                else
                {
                    btndrum1.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btndrum1.setBackgroundResource(R.color.btndrum2);
                    Drum1.start();
                    Drum1.setLooping(true);
                }
            }
        });

        btndrum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Drum2.isLooping())
                {
                    btndrum2.setTextColor(getResources().getColor(R.color.btndrum3));
                    btndrum2.setBackgroundResource(R.drawable.button_shape13);
                    Drum2.pause();
                    Drum2.seekTo(0);
                    Drum2.setLooping(false);
                }
                else
                {
                    btndrum2.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btndrum2.setBackgroundResource(R.color.btndrum3);
                    Drum2.start();
                    Drum2.setLooping(true);
                }
            }
        });

        btndrum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Drum3.isLooping())
                {
                    btndrum3.setTextColor(getResources().getColor(R.color.btndrum4));
                    btndrum3.setBackgroundResource(R.drawable.button_shape14);
                    Drum3.pause();
                    Drum3.seekTo(0);
                    Drum3.setLooping(false);
                }
                else
                {
                    btndrum3.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btndrum3.setBackgroundResource(R.color.btndrum4);
                    Drum3.start();
                    Drum3.setLooping(true);
                }
            }
        });

        btnclap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Clap.isLooping())
                {
                    btnclap1.setTextColor(getResources().getColor(R.color.btnclap1));
                    btnclap1.setBackgroundResource(R.drawable.button_shape15);
                    Clap.pause();
                    Clap.seekTo(0);
                    Clap.setLooping(false);
                }
                else
                {
                    btnclap1.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnclap1.setBackgroundResource(R.color.btnclap1);
                    Clap.start();
                    Clap.setLooping(true);
                }
            }
        });


        //Kick1-4 +1Clap

        btnkick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Kick1.isLooping())
                {
                    btnkick1.setTextColor(getResources().getColor(R.color.btnkick2));
                    btnkick1.setBackgroundResource(R.drawable.button_shape7);
                    Kick1.pause();
                    Kick1.seekTo(0);
                    Kick1.setLooping(false);
                }
                else
                {
                    btnkick1.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnkick1.setBackgroundResource(R.color.btnkick2);
                    Kick1.start();
                    Kick1.setLooping(true);
                }
            }
        });

        btnkick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Kick2.isLooping())
                {
                    btnkick2.setTextColor(getResources().getColor(R.color.btnkick3));
                    btnkick2.setBackgroundResource(R.drawable.button_shape8);
                    Kick2.pause();
                    Kick2.seekTo(0);
                    Kick2.setLooping(false);
                }
                else
                {
                    btnkick2.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnkick2.setBackgroundResource(R.color.btnkick3);
                    Kick2.start();
                    Kick2.setLooping(true);
                }
            }
        });

        btnkick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Kick3.isLooping())
                {
                    btnkick3.setTextColor(getResources().getColor(R.color.btnkick4));
                    btnkick3.setBackgroundResource(R.drawable.button_shape9);
                    Kick3.pause();
                    Kick3.seekTo(0);
                    Kick3.setLooping(false);
                }
                else
                {
                    btnkick3.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnkick3.setBackgroundResource(R.color.btnkick4);
                    Kick3.start();
                    Kick3.setLooping(true);
                }
            }
        });


        btnclap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Clap2.isLooping())
                {
                    btnclap2.setTextColor(getResources().getColor(R.color.btnclap2));
                    btnclap2.setBackgroundResource(R.drawable.button_shape10);
                    Clap2.pause();
                    Clap2.seekTo(0);
                    Clap2.setLooping(false);
                }
                else
                {
                    btnclap2.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnclap2.setBackgroundResource(R.color.btnclap2);
                    Clap2.start();
                    Clap2.setLooping(true);
                }
            }
        });

        //melody1-5

        btnmelody1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (melody1.isLooping())
                {
                    btnmelody1.setTextColor(getResources().getColor(R.color.btnmelody2));
                    btnmelody1.setBackgroundResource(R.drawable.button_shape2);
                    melody1.pause();
                    melody1.seekTo(0);
                    melody1.setLooping(false);
                }
                else
                {
                    btnmelody1.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnmelody1.setBackgroundResource(R.color.btnmelody2);
                    melody1.start();
                    melody1.setLooping(true);
                }
            }
        });

        btnmelody2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (melody2.isLooping())
                {
                    btnmelody2.setTextColor(getResources().getColor(R.color.btnmelody3));
                    btnmelody2.setBackgroundResource(R.drawable.button_shape3);
                    melody2.pause();
                    melody2.seekTo(0);
                    melody2.setLooping(false);
                }
                else
                {
                    btnmelody2.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnmelody2.setBackgroundResource(R.color.btnmelody3);
                    melody2.start();
                    melody2.setLooping(true);
                }
            }
        });

        btnmelody3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (melody3.isLooping())
                {
                    btnmelody3.setTextColor(getResources().getColor(R.color.btnmelody4));
                    btnmelody3.setBackgroundResource(R.drawable.button_shape4);
                    melody3.pause();
                    melody3.seekTo(0);
                    melody3.setLooping(false);
                }
                else
                {
                    btnmelody3.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnmelody3.setBackgroundResource(R.color.btnmelody4);
                    melody3.start();
                    melody3.setLooping(true);
                }
            }
        });

        btnmelody4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (melody4.isLooping())
                {
                    btnmelody4.setTextColor(getResources().getColor(R.color.btnmelody5));
                    btnmelody4.setBackgroundResource(R.drawable.button_shape5);
                    melody4.pause();
                    melody4.seekTo(0);
                    melody4.setLooping(false);
                }
                else
                {
                    btnmelody4.setTextColor(getResources().getColor(R.color.btntextcolorsiyah));
                    btnmelody4.setBackgroundResource(R.color.btnmelody5);
                    melody4.start();
                    melody4.setLooping(true);
                }
            }
        });




    }

    @Override
    public void onClick(View v) {

    }
}
