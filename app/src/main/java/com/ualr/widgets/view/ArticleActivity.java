package com.ualr.widgets.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.EditText;

import com.ualr.widgets.R;
import com.ualr.widgets.databinding.ActivityContactFormBinding;
import com.ualr.widgets.viewmodel.ContactViewModel;


public class ContactFormActivity extends AppCompatActivity {

    public static final String PARCELABLE_NAME = "ContactInfo";
    private ContactViewModel contactViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contactViewModel = new ContactViewModel();
        ActivityContactFormBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_contact_form);
        binding.setViewModel(contactViewModel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.save_action) {
            showContactInfo();
        }
        return super.onOptionsItemSelected(item);
    }

    private void showContactInfo() {
        Intent intent = new Intent(this, ContactInfoActivity.class);
        // TODO 20. UNCOMMENT THIS LINE
        intent.putExtra(PARCELABLE_NAME, contactViewModel.getContactInfo());
        startActivity(intent);
    }

    // TODO 14. CheckTextView. We have to handle the click event from java code and change the state programmatically -->
    // onCheckStateToggled function must be defined -->
    public void onCheckStateToggled (View view) {
        CheckedTextView petTextView = (CheckedTextView) view;
        petTextView.setChecked(!petTextView.isChecked());
        // TODO 18. EditText. Disable when CheckedTextView is not checked.
        contactViewModel.petEnabled.set(petTextView.isChecked());
    }

}
