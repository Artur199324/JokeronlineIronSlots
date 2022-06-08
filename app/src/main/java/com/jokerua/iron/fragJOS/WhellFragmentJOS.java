package com.jokerua.iron.fragJOS;

import static com.jokerua.iron.actJOS.MainActivity.navController;
import static com.jokerua.iron.actJOS.MainActivity.scoreJOI;
import static com.jokerua.iron.actJOS.MainActivity.textViewScor;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.mainActivity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.jokerua.iron.R;

import java.util.Random;

public class WhellFragmentJOS extends Fragment {

    Button buttonpl,buttonbac;
    ImageView imageViewWel,imageViewwww;
    Random random;
    TextView textViewwww;
    int od, d = 0;
    final float rrr = 22.5f;
    int ddd[] = {200, 1000, 10000, 50000, 4000, 2000, 400, 0};
    int x ;
    int y ;
    int jjj;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        random = new Random();
        View view = inflater.inflate(R.layout.fragment_whell_j_o_s, container, false);
        buttonpl = view.findViewById(R.id.buttonpl);
        buttonbac = view.findViewById(R.id.buttonbac);
        imageViewWel = view.findViewById(R.id.imageViewWel);
        imageViewwww = view.findViewById(R.id.imageViewwww);
        textViewwww = view.findViewById(R.id.textViewwww);
        buttonbac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.startFragmentJOS);
            }
        });

        buttonpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                od = d % 360;
                d = random.nextInt(3600)+720;

                RotateAnimation rotateAnimation = new RotateAnimation(od,d,
                        RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotateAnimation.setDuration(3600);
                rotateAnimation.setFillAfter(true);
                rotateAnimation.setInterpolator(new DecelerateInterpolator());
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        jjj = 360 - (d % 360);
                         x = 1;
                         y = 3;
                        for (int i = 0; i <8;i++){
                            if (jjj >= (rrr * x) && jjj < (rrr * y)){
                                Log.d("weq",ddd[i]+"");
                                imageViewwww.setVisibility(View.VISIBLE);
                                textViewwww.setText("Win : " + ddd[i]);
                                textViewwww.setVisibility(View.VISIBLE);
                                scoreJOI += ddd[i];
                                textViewScor.setText("Score: " + scoreJOI);
                                mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("ttt", scoreJOI).apply();
                            }

                            y += 2;
                            x += 2;
                        }

                        if (jjj >= (rrr * 73) && jjj < 360 || jjj >= 0 && jjj < (rrr * 1)){
                            Log.d("weq",ddd[ddd.length-1]+"");
                            imageViewwww.setVisibility(View.VISIBLE);
                            textViewwww.setText("Win : " + ddd[ddd.length-1]);
                            textViewwww.setVisibility(View.VISIBLE);

                        }

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                imageViewwww.setVisibility(View.INVISIBLE);
                                textViewwww.setVisibility(View.INVISIBLE);
                            }
                        },1000);

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                imageViewWel.startAnimation(rotateAnimation);

            }
        });


        return view;
    }
}