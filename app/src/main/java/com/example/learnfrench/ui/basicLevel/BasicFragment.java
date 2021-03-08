package com.example.learnfrench.ui.basicLevel;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.learnfrench.R;
import com.example.learnfrench.basic_alphabets;
import com.example.learnfrench.basic_numbers;
import com.example.learnfrench.days_of_week;
import com.example.learnfrench.months_name;

public class BasicFragment extends Fragment {

    ImageView imgAlphabets,imgNumbers,imgDaysofweek,imgMonthsName;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root= inflater.inflate(R.layout.fragment_basic, container, false);
        imgAlphabets=root.findViewById(R.id.imgAlphabets);
        imgNumbers=root.findViewById(R.id.imgNumbers);
        imgDaysofweek=root.findViewById(R.id.imgDaysofweek);
        imgMonthsName=root.findViewById(R.id.imgMonthsName);


        imgAlphabets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getActivity(), basic_alphabets.class);
                startActivity(i);
            }
        });

        imgNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getActivity(), basic_numbers.class);
                startActivity(i);
            }
        });
        imgDaysofweek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getActivity(), days_of_week.class);
                startActivity(i);
            }
        });
        imgMonthsName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getActivity(), months_name.class);
                startActivity(i);
            }
        });
        return root;
    }


}
