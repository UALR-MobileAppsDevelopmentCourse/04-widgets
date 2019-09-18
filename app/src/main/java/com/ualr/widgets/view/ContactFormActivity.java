package com.ualr.widgets.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ualr.widgets.R;

public class ContactFormActivity extends AppCompatActivity {

    private static final int PASSWORD_CHARS = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_form);
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
