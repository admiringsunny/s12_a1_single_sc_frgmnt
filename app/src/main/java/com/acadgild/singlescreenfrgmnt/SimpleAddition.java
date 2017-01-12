package com.acadgild.singlescreenfrgmnt;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sunny on 1/12/17.
 */
public class SimpleAddition extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.simple_addition, container, false);

        return root;
    }

    public void setResultText(String result) {
        TextView resultText = (TextView) getView().findViewById(R.id.result);
        resultText.setText(result);
    }
}
