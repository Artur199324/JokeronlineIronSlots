package com.jokerua.iron.modJOI;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class SlotAnim {
    public void animSlot(ImageView imageView){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setVisibility(View.INVISIBLE);
            }
        },100);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setVisibility(View.VISIBLE);
            }
        },500);

    }
}
