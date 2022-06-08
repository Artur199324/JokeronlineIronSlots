package com.jokerua.iron.fragJOS;

import static com.jokerua.iron.actJOS.MainActivity.navController;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jokerua.iron.R;
import com.jokerua.iron.actJOS.MainActivity;


public class StartFragmentJOS extends Fragment {

    Button buttonslot,buttonwhell,buttonex;
    public static MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_start_j_o_s, container, false);
        buttonslot = view.findViewById(R.id.buttonslot);
        buttonwhell = view.findViewById(R.id.buttonwhell);
        buttonex = view.findViewById(R.id.buttonex);

        buttonslot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.slotFragmentJOS);
            }
        });

        buttonwhell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.whellFragmentJOS);
            }
        });

        buttonex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.finish();
            }
        });

        return view;
    }
}