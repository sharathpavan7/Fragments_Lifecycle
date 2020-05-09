package com.sharath.fragmentslifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frag_container);
        loadFragment();
    }

    private void loadFragment() {
        FragmentA fa = new FragmentA();
        getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, fa).addToBackStack(null).commit();

    }

    public void onClick(View view) {
        FragmentB fb = new FragmentB();
        getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, fb).addToBackStack(null).commit();
    }
}
