package com.jokerua.iron.modJOI;

import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import com.jokerua.iron.R;
import com.jokerua.iron.actJOS.MainActivity;

import java.util.Random;

public class SlotMovJOS {
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    int countJOS = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    public SlotMovJOS(ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10) {
        this.imageView2 = imageView2;
        this.imageView3 = imageView3;
        this.imageView4 = imageView4;
        this.imageView5 = imageView5;
        this.imageView6 = imageView6;
        this.imageView7 = imageView7;
        this.imageView8 = imageView8;
        this.imageView9 = imageView9;
        this.imageView10 = imageView10;
    }

    public void moveJOS(MainActivity mainActivity){
        Handler handler = new Handler();
        Random random = new Random();
        handler.post(new Runnable() {
            @Override
            public void run() {

                switch (random.nextInt(4)){
                    case 0:
                        imageView2.setImageResource(R.drawable.qqq1);
                        break;
                    case 1:
                        imageView2.setImageResource(R.drawable.qqq2);
                        break;
                    case 2:
                        imageView2.setImageResource(R.drawable.qqq3);
                        break;
                    case 3:
                        imageView2.setImageResource(R.drawable.qqq4);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        imageView3.setImageResource(R.drawable.qqq1);
                        break;
                    case 1:
                        imageView3.setImageResource(R.drawable.qqq2);
                        break;
                    case 2:
                        imageView3.setImageResource(R.drawable.qqq3);
                        break;
                    case 3:
                        imageView3.setImageResource(R.drawable.qqq4);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        imageView4.setImageResource(R.drawable.qqq1);
                        break;
                    case 1:
                        imageView4.setImageResource(R.drawable.qqq2);
                        break;
                    case 2:
                        imageView4.setImageResource(R.drawable.qqq3);
                        break;
                    case 3:
                        imageView4.setImageResource(R.drawable.qqq4);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        imageView5.setImageResource(R.drawable.qqq1);
                        break;
                    case 1:
                        imageView5.setImageResource(R.drawable.qqq2);
                        break;
                    case 2:
                        imageView5.setImageResource(R.drawable.qqq3);
                        break;
                    case 3:
                        imageView5.setImageResource(R.drawable.qqq4);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        imageView6.setImageResource(R.drawable.qqq1);
                        break;
                    case 1:
                        imageView6.setImageResource(R.drawable.qqq2);
                        break;
                    case 2:
                        imageView6.setImageResource(R.drawable.qqq3);
                        break;
                    case 3:
                        imageView6.setImageResource(R.drawable.qqq4);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        imageView7.setImageResource(R.drawable.qqq1);
                        break;
                    case 1:
                        imageView7.setImageResource(R.drawable.qqq2);
                        break;
                    case 2:
                        imageView7.setImageResource(R.drawable.qqq3);
                        break;
                    case 3:
                        imageView7.setImageResource(R.drawable.qqq4);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        imageView8.setImageResource(R.drawable.qqq1);
                        break;
                    case 1:
                        imageView8.setImageResource(R.drawable.qqq2);
                        break;
                    case 2:
                        imageView8.setImageResource(R.drawable.qqq3);
                        break;
                    case 3:
                        imageView8.setImageResource(R.drawable.qqq4);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        imageView9.setImageResource(R.drawable.qqq1);
                        break;
                    case 1:
                        imageView9.setImageResource(R.drawable.qqq2);
                        break;
                    case 2:
                        imageView9.setImageResource(R.drawable.qqq3);
                        break;
                    case 3:
                        imageView9.setImageResource(R.drawable.qqq4);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        imageView10.setImageResource(R.drawable.qqq1);
                        break;
                    case 1:
                        imageView10.setImageResource(R.drawable.qqq2);
                        break;
                    case 2:
                        imageView10.setImageResource(R.drawable.qqq3);
                        break;
                    case 3:
                        imageView10.setImageResource(R.drawable.qqq4);
                        break;
                }


                countJOS++;
                if (countJOS !=40){
                handler.postDelayed(this::run,10);
                }else {
                    countJOS = 0;
                    switch (random.nextInt(4)){
                        case 0:
                            imageView2.setImageResource(R.drawable.qqq1);
                            imageView2.setTag(1);
                            a++;
                            break;
                        case 1:
                            imageView2.setImageResource(R.drawable.qqq2);
                            imageView2.setTag(2);
                            b++;
                            break;
                        case 2:
                            imageView2.setImageResource(R.drawable.qqq3);
                            imageView2.setTag(3);
                            c++;
                            break;
                        case 3:
                            imageView2.setImageResource(R.drawable.qqq4);
                            imageView2.setTag(4);
                            d++;
                            break;
                    }

                    switch (random.nextInt(4)){
                        case 0:
                            imageView3.setImageResource(R.drawable.qqq1);
                            imageView3.setTag(1);
                            a++;
                            break;
                        case 1:
                            imageView3.setImageResource(R.drawable.qqq2);
                            imageView3.setTag(2);
                            b++;
                            break;
                        case 2:
                            imageView3.setImageResource(R.drawable.qqq3);
                            imageView3.setTag(3);
                            c++;
                            break;
                        case 3:
                            imageView3.setImageResource(R.drawable.qqq4);
                            imageView3.setTag(4);
                            d++;
                            break;
                    }

                    switch (random.nextInt(4)){
                        case 0:
                            imageView4.setImageResource(R.drawable.qqq1);
                            imageView4.setTag(1);
                            a++;
                            break;
                        case 1:
                            imageView4.setImageResource(R.drawable.qqq2);
                            imageView4.setTag(2);
                            b++;
                            break;
                        case 2:
                            imageView4.setImageResource(R.drawable.qqq3);
                            imageView4.setTag(3);
                            c++;
                            break;
                        case 3:
                            imageView4.setImageResource(R.drawable.qqq4);
                            imageView4.setTag(4);
                            d++;
                            break;
                    }

                    switch (random.nextInt(4)){
                        case 0:
                            imageView5.setImageResource(R.drawable.qqq1);
                            imageView5.setTag(1);
                            a++;
                            break;
                        case 1:
                            imageView5.setImageResource(R.drawable.qqq2);
                            imageView5.setTag(2);
                            b++;
                            break;
                        case 2:
                            imageView5.setImageResource(R.drawable.qqq3);
                            imageView5.setTag(3);
                            c++;
                            break;
                        case 3:
                            imageView5.setImageResource(R.drawable.qqq4);
                            imageView5.setTag(4);
                            d++;
                            break;
                    }

                    switch (random.nextInt(4)){
                        case 0:
                            imageView6.setImageResource(R.drawable.qqq1);
                            imageView6.setTag(1);
                            a++;
                            break;
                        case 1:
                            imageView6.setImageResource(R.drawable.qqq2);
                            imageView6.setTag(2);
                            b++;
                            break;
                        case 2:
                            imageView6.setImageResource(R.drawable.qqq3);
                            imageView6.setTag(3);
                            c++;
                            break;
                        case 3:
                            imageView6.setImageResource(R.drawable.qqq4);
                            imageView6.setTag(4);
                            d++;
                            break;
                    }

                    switch (random.nextInt(4)){
                        case 0:
                            imageView7.setImageResource(R.drawable.qqq1);
                            imageView7.setTag(1);
                            a++;
                            break;
                        case 1:
                            imageView7.setImageResource(R.drawable.qqq2);
                            imageView7.setTag(2);
                            b++;
                            break;
                        case 2:
                            imageView7.setImageResource(R.drawable.qqq3);
                            imageView7.setTag(3);
                            c++;
                            break;
                        case 3:
                            imageView7.setImageResource(R.drawable.qqq4);
                            imageView7.setTag(4);
                            d++;
                            break;
                    }

                    switch (random.nextInt(4)){
                        case 0:
                            imageView8.setImageResource(R.drawable.qqq1);
                            imageView8.setTag(1);
                            a++;
                            break;
                        case 1:
                            imageView8.setImageResource(R.drawable.qqq2);
                            imageView8.setTag(2);
                            b++;
                            break;
                        case 2:
                            imageView8.setImageResource(R.drawable.qqq3);
                            imageView8.setTag(3);
                            c++;
                            break;
                        case 3:
                            imageView8.setImageResource(R.drawable.qqq4);
                            imageView8.setTag(4);
                            d++;
                            break;
                    }

                    switch (random.nextInt(4)){
                        case 0:
                            imageView9.setImageResource(R.drawable.qqq1);
                            imageView9.setTag(1);
                            a++;
                            break;
                        case 1:
                            imageView9.setImageResource(R.drawable.qqq2);
                            imageView9.setTag(2);
                            b++;
                            break;
                        case 2:
                            imageView9.setImageResource(R.drawable.qqq3);
                            imageView9.setTag(3);
                            c++;
                            break;
                        case 3:
                            imageView9.setImageResource(R.drawable.qqq4);
                            imageView9.setTag(4);
                            d++;
                            break;
                    }

                    switch (random.nextInt(4)){
                        case 0:
                            imageView10.setImageResource(R.drawable.qqq1);
                            imageView10.setTag(1);
                            a++;
                            break;
                        case 1:
                            imageView10.setImageResource(R.drawable.qqq2);
                            imageView10.setTag(2);
                            b++;
                            break;
                        case 2:
                            imageView10.setImageResource(R.drawable.qqq3);
                            imageView10.setTag(3);
                            c++;
                            break;
                        case 3:
                            imageView10.setImageResource(R.drawable.qqq4);
                            imageView10.setTag(4);
                            d++;
                            break;
                    }


                    SlotFInJOS slotFInJOS = new SlotFInJOS();
                    slotFInJOS.finJSO(imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10,a,b,c,d,mainActivity);

                }
            }
        });
    }
}
