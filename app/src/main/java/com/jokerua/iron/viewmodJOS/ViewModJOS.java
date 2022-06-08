package com.jokerua.iron.viewmodJOS;

import android.app.Application;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.jokerua.iron.actJOS.MainActivity;
import com.jokerua.iron.modJOI.SlotMovJOS;

public class ViewModJOS extends AndroidViewModel {

    MainActivity mainActivity;
    public ViewModJOS(@NonNull Application application) {
        super(application);
    }

    public void setMainActivity(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    public void slotMovJSO(ImageView imageView2,ImageView imageView3,ImageView imageView4,ImageView imageView5,ImageView imageView6,ImageView imageView7,ImageView imageView8,ImageView imageView9,ImageView imageView10){
        SlotMovJOS slotMovJOS = new SlotMovJOS(imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10);
        slotMovJOS.moveJOS(mainActivity);
    }
}
