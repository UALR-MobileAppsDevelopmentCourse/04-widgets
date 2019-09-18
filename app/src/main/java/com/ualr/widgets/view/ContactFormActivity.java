package com.ualr.widgets.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
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
        mBinding.contactTypeToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                if (isChecked) {
                    //TODO 11: Get the id of the current checked button
                    Log.d(TAG, String.format("The new checked element index is: %d", checkedId));
                    // TODO 12: Get information about the corresponding checked button
                    MaterialButton checkedButton = findViewById(checkedId);
                    Log.d(TAG, String.format("The new checked element is: %s", checkedButton.getText().toString()));
                }
            }
        });
    }
}
