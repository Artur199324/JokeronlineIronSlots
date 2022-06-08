package com.jokerua.iron.actJOS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.jokerua.iron.R;
import com.jokerua.iron.fragJOS.SlotFragmentJOS;
import com.jokerua.iron.fragJOS.StartFragmentJOS;
import com.jokerua.iron.viewmodJOS.ViewModJOS;

public class MainActivity extends AppCompatActivity {

    public static NavController navController;
    public static ViewModJOS viewModJOS;
    public static TextView textViewScor;
    public static int scoreJOI;
    public static int countWin = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SlotFragmentJOS.mainActivity = this;
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        StartFragmentJOS.mainActivity = this;
        navController = Navigation.findNavController(this, R.id.nav_host_fragmentaJOS);
        viewModJOS = new ViewModelProvider.AndroidViewModelFactory(getApplication()).create(ViewModJOS.class);
        viewModJOS.setMainActivity(this);
        textViewScor = findViewById(R.id.textViewScor);
        scoreJOI = getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("ttt", 2000);
        textViewScor.setText("Score: " + scoreJOI);
    }

    @Override
    public void onBackPressed() {

    }
}