package com.example.administrator.tabactionbartest;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Administrator on 2017-01-03.
 */

public class SectionsFragment3 extends Fragment {
    Context context;

    public SectionsFragment3(Context context) {
        this.context=context;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_page3, null);
        TextView textView = (TextView)view.findViewById(R.id.section_label3);
        textView.setText("세번째페이지는 따로 만들었다!!!!!!!!");

        return view;
    }

}