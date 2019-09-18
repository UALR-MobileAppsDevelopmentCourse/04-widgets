package com.ualr.widgets.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.widgets.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        // TODO 13. Chips. Get current checked chip
    }

    // TODO 09. Chips. Handle click events

}
