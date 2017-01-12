package com.acadgild.singlescreenfrgmnt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et = (EditText) findViewById(R.id.et);

        final Button submitBtn = (Button) findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!et.getText().toString().equals("")) {
                    SimpleAddition simpleAddition = (SimpleAddition) getFragmentManager().findFragmentById(R.id.fragment_place);
                    simpleAddition.setResultText(et.getText().toString());
                } else
                    Toast.makeText(MainActivity.this, getString(R.string.no_input_toast), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
