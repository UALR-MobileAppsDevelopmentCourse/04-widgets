package com.ualr.widgets.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ualr.widgets.R;
import com.ualr.widgets.databinding.ActivityContactFormBinding;

public class ContactFormActivity extends AppCompatActivity {

    private static final int PASSWORD_CHARS = 8;
    private ActivityContactFormBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityContactFormBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mBinding.sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPassword();
            }
        });
    }

    // TODO 08: Let's validate password in order to see how errors look like in TextInputLayout
    private boolean checkPassword() {
        boolean result = true;
        TextInputLayout passwordInput = findViewById(R.id.passwordTextInput);
        TextInputEditText passwordEditText = findViewById(R.id.passwordEditText);
        String password = passwordEditText.getText().toString();
        if (password.length() != PASSWORD_CHARS) {
            passwordInput.setError(getResources().getString(R.string.password_error_msg));
            result = false;
        }
        return result;
    }

}
