package com.example.acitivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        Button FragmentA = (Button) findViewById(R.id.FragmentA);
        Button FragmentB = (Button) findViewById(R.id.FragmentB);

        FragmentA.setOnClickListener(new View.OnClicklistener());
        @Override
        public void onClick(View){

            loadFragment(new FragmentA());

        FragmentB.setOnClickListener(new View.OnClicklistener());
        @Override
        public void onClick(View){

                loadFragment(new Fragmentb());
        }
    }

    private void loadFragment(FragmentA fragmentA) {

    }
}