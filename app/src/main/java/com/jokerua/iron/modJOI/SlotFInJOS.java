package com.jokerua.iron.modJOI;

import static com.jokerua.iron.actJOS.MainActivity.countWin;
import static com.jokerua.iron.actJOS.MainActivity.scoreJOI;
import static com.jokerua.iron.actJOS.MainActivity.textViewScor;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.betJOS;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.buttonNO;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.buttonYes;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.buttoninm;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.buttoninp;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.buttonpla;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.imageViewbbbit;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.mainActivity;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.textViewLosJOI;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.textViewSup;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.textViewWin;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.textViewbet;
import static com.jokerua.iron.fragJOS.SlotFragmentJOS.textViewlllo;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.jokerua.iron.R;
import com.jokerua.iron.actJOS.MainActivity;

import java.util.ArrayList;

public class SlotFInJOS {
    SlotAnim slotAnim;
    public static int winn = 0;
    boolean ooo = true;

    public void finJSO(ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6,
                       ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, int a, int b, int c, int d, MainActivity mainActivity) {

        ArrayList<ImageView> arrayList = new ArrayList<>();
        arrayList.add(imageView2);
        arrayList.add(imageView3);
        arrayList.add(imageView4);
        arrayList.add(imageView5);
        arrayList.add(imageView6);
        arrayList.add(imageView7);
        arrayList.add(imageView8);
        arrayList.add(imageView9);
        arrayList.add(imageView10);
        slotAnim = new SlotAnim();



        if (a > b && a > c && a > d) {
            ooo = false;

            for (int i = 0; i < arrayList.size(); i++) {
                if ((int) arrayList.get(i).getTag() == 1) {
                    slotAnim.animSlot(arrayList.get(i));
                }

            }
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    kll();
                }
            },1500);

        }

        if (b > a && b > c && b > d) {
            ooo = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if ((int) arrayList.get(i).getTag() == 2) {

                    slotAnim.animSlot(arrayList.get(i));
                }
            }
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    kll();
                }
            },1500);

        }

        if (c > a && c > b && c > d) {
            ooo = false;

            for (int i = 0; i < arrayList.size(); i++) {
                if ((int) arrayList.get(i).getTag() == 3) {

                    slotAnim.animSlot(arrayList.get(i));
                }
            }
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    kll();
                }
            },1500);
        }

        if (d > a && d > b && d > c) {
            ooo = false;

            for (int i = 0; i < arrayList.size(); i++) {
                if ((int) arrayList.get(i).getTag() == 4) {

                    slotAnim.animSlot(arrayList.get(i));
                }
            }

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    kll();
                }
            },1000);
        }

        if (ooo){
            countWin = 0;
            mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("ttt", scoreJOI).apply();
            textViewLosJOI.setVisibility(View.VISIBLE);
            imageViewbbbit.setVisibility(View.VISIBLE);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    imageViewbbbit.setVisibility(View.INVISIBLE);
                    textViewLosJOI.setVisibility(View.INVISIBLE);
                    buttonpla.setClickable(true);
                    if (scoreJOI == 0){
                        betJOS = 0;
                        mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("yyy", betJOS).apply();
                        textViewbet.setText("Bet : "+betJOS);
                        ll();
                    }
                }
            },2000);
        }else {
            ooo = true;
        }
    }

    private void kll(){
        winn = betJOS*2;
        scoreJOI +=winn;
        countWin++;
        mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("ttt", scoreJOI).apply();
        textViewScor.setText("Score: " + scoreJOI);
        textViewWin.setText("Win : " + winn);
        imageViewbbbit.setVisibility(View.VISIBLE);
        textViewWin.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageViewbbbit.setVisibility(View.INVISIBLE);
                textViewWin.setVisibility(View.INVISIBLE);
                buttonpla.setClickable(true);
                if (countWin == 3){
                    countWin =0;
                    buttonpla.setClickable(false);
                    imageViewbbbit.setVisibility(View.VISIBLE);
                    textViewSup.setVisibility(View.VISIBLE);
                    buttonNO.setVisibility(View.VISIBLE);
                    buttonYes.setVisibility(View.VISIBLE);

                }
            }
        },2000);
    }

    private void ll(){
        imageViewbbbit.setVisibility(View.VISIBLE);
        textViewlllo.setVisibility(View.VISIBLE);
        buttoninm.setVisibility(View.VISIBLE);
        buttoninp.setVisibility(View.VISIBLE);
        buttonpla.setClickable(true);
    }
}
