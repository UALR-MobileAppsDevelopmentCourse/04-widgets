package com.ualr.widgets.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.ualr.widgets.databinding.ActivityContactFormBinding;

public class ContactFormActivity extends AppCompatActivity {

    private static final int PASSWORD_CHARS = 8;
    private ActivityContactFormBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityContactFormBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
    }

    // TODO 08: Let's validate password in order to see how errors look like in TextInputLayout

}
