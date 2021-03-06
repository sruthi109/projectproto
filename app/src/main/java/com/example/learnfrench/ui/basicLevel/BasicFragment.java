package com.example.learnfrench.ui.basicLevel;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.learnfrench.R;

public class BasicFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root= inflater.inflate(R.layout.fragment_basic, container, false);
        return root;
    }


}
