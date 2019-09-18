package com.ualr.widgets.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.ualr.widgets.R;
import com.ualr.widgets.databinding.ActivityContactFormBinding;

public class ContactFormActivity extends AppCompatActivity {

    private static final String TAG = ContactFormActivity.class.getSimpleName();
    private static final int PASSWORD_CHARS = 8;
    private ActivityContactFormBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityContactFormBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mBinding.contactTypeToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                if (isChecked) {
                    Log.d(TAG, String.format("The new checked element index is: %d", checkedId));
                    MaterialButton checkedButton = findViewById(checkedId);
                    Log.d(TAG, String.format("The new checked element is: %s", checkedButton.getText().toString()));
                }
            }
        });
        // TODO 03. MaterialCheckbox. Detect state change
        mBinding.confirmationCbx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Log.d(TAG, "Conditions have been confirmed!");
                }
            }
        });

        // TODO 07. RadioGroup. Get the currently checked button
        mBinding.carsRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                MaterialRadioButton checkedButton = (MaterialRadioButton) radioGroup.findViewById(i);
                Log.d(TAG, String.format("Option %s has been selected.", checkedButton.getText().toString()));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void goToActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings_action:
                // if (checkPassword()) goToSettings();
                goToActivity(FakeSettingsActivity.class);
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }

}
