package com.jokerua.iron.fragJOS;

import static com.jokerua.iron.actJOS.MainActivity.*;
import static com.jokerua.iron.actJOS.MainActivity.scoreJOI;
import static com.jokerua.iron.actJOS.MainActivity.viewModJOS;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.jokerua.iron.R;
import com.jokerua.iron.actJOS.MainActivity;


public class SlotFragmentJOS extends Fragment {

    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    public static ImageView imageViewbbbit;
    public static TextView textViewbbbit;
    public static TextView textViewWin, textViewLosJOI,textViewSup;
    public static  Button buttonmin, buttonplu, buttonmax, buttonbec, buttonpla,buttonNO,buttonYes;
    public static TextView textViewbet, textViewlllo;
    public static int betJOS = 0;
    public static Button buttoninm, buttoninp;
    public static MainActivity mainActivity;
    boolean ooo = false;
    int counterJOS = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slot_j_o_s, container, false);

        textViewSup = view.findViewById(R.id.textViewSup);
        buttonNO = view.findViewById(R.id.buttonNO);
        buttonYes = view.findViewById(R.id.buttonYes);
        buttonNO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewbbbit.setVisibility(View.INVISIBLE);
                textViewSup.setVisibility(View.INVISIBLE);
                buttonNO.setVisibility(View.INVISIBLE);
                buttonYes.setVisibility(View.INVISIBLE);
                buttonpla.setClickable(true);
            }
        });

        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonpla.setClickable(true);
                navController.navigate(R.id.whellSupperFragment);
            }
        });

        textViewlllo = view.findViewById(R.id.textViewlllo);
        buttoninm = view.findViewById(R.id.buttoninm);
        buttoninp = view.findViewById(R.id.buttoninp);
        imageViewbbbit = view.findViewById(R.id.imageViewbbbit);
        textViewbbbit = view.findViewById(R.id.textViewbbbit);
        imageView2 = view.findViewById(R.id.imageView2);
        imageView3 = view.findViewById(R.id.imageView3);
        imageView4 = view.findViewById(R.id.imageView4);
        imageView5 = view.findViewById(R.id.imageView5);
        imageView6 = view.findViewById(R.id.imageView6);
        imageView7 = view.findViewById(R.id.imageView7);
        imageView8 = view.findViewById(R.id.imageView8);
        imageView9 = view.findViewById(R.id.imageView9);
        imageView10 = view.findViewById(R.id.imageView10);
        textViewWin = view.findViewById(R.id.textViewWin);
        buttonmin = view.findViewById(R.id.buttonmin);
        buttonplu = view.findViewById(R.id.buttonplu);
        buttonmax = view.findViewById(R.id.buttonmax);
        buttonbec = view.findViewById(R.id.buttonbec);
        buttonpla = view.findViewById(R.id.buttonpla);
        textViewbet = view.findViewById(R.id.textViewbet);
        textViewLosJOI = view.findViewById(R.id.textViewLosJOI);
        buttoninm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.startFragmentJOS);
            }
        });

        buttoninp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.whellFragmentJOS);
            }
        });

        if (scoreJOI == 0) {
            imageViewbbbit.setVisibility(View.VISIBLE);
            textViewlllo.setVisibility(View.VISIBLE);
            buttoninm.setVisibility(View.VISIBLE);
            buttoninp.setVisibility(View.VISIBLE);
        }
        betJOS = mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).getInt("yyy", 0);
        textViewbet.setText("Bet : " + betJOS);
        buttonmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scoreJOI != 0) {
                    ooo = true;
                    betJOS += 100;
                    scoreJOI -= 100;
                    textViewbet.setText("Bet : " + betJOS);
                    textViewScor.setText("Score: " + scoreJOI);
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("yyy", betJOS).apply();
                } else {
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("ttt", 0).apply();
                }
            }
        });

        buttonplu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (betJOS != 0) {
                    betJOS -= 100;
                    scoreJOI += 100;
                    textViewbet.setText("Bet : " + betJOS);
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("yyy", betJOS).apply();
                    ooo = true;
                    textViewScor.setText("Score: " + scoreJOI);
                } else {
                    mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("yyy", 0).apply();
                }

            }
        });

        buttonmax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scoreJOI !=0){
                betJOS = mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).getInt("ttt", 2000);
                scoreJOI = 0;
                mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("ttt", scoreJOI).apply();
                mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("yyy", betJOS).apply();
                textViewScor.setText("Score: " + scoreJOI);
                textViewbet.setText("Bet : " + betJOS);
                ooo = true;}
            }
        });

        buttonpla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (betJOS == 0) {
                    Handler handler = new Handler();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            imageViewbbbit.setVisibility(View.VISIBLE);
                            textViewbbbit.setVisibility(View.VISIBLE);
                            counterJOS++;
                            if (counterJOS != 30) {
                                handler.postDelayed(this::run, 50);
                            } else {
                                counterJOS = 0;
                                imageViewbbbit.setVisibility(View.INVISIBLE);
                                textViewbbbit.setVisibility(View.INVISIBLE);
                            }
                        }
                    });

                } else {
                    if (!ooo) {
                        scoreJOI -= betJOS;
                        textViewScor.setText("Score: " + scoreJOI);
                    }
                    ooo = false;
                    buttonpla.setClickable(false);
                    viewModJOS.slotMovJSO(imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10);
                }

            }
        });

        buttonbec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.startFragmentJOS);
            }
        });
        return view;
    }
}