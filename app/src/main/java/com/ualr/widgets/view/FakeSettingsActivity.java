package com.ualr.widgets.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ualr.widgets.databinding.ActivityFakeSettingsBinding;

public class FakeSettingsActivity extends AppCompatActivity {

    private static final String TAG = FakeSettingsActivity.class.getSimpleName();
    private ActivityFakeSettingsBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityFakeSettingsBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        //TODO 09. SwitchMaterial. We can handle state changes as we did with checkboxes
        mBinding.syncSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Log.d(TAG, "Switch checked");
                }
            }
        });
    }
}
