package com.ualr.widgets.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.ualr.widgets.databinding.ActivityContactFormBinding;

public class ContactFormActivity extends AppCompatActivity {

    private static final String TAG = ContactFormActivity.class.getSimpleName();
    private ActivityContactFormBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityContactFormBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        //TODO 10: We want to know which is the checked option at any time
        //TODO 11: Get the id of the current checked button
        //TODO 12: Get information about the corresponding checked button
    }
}
