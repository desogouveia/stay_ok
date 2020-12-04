package com.lamarka.project.stayok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class daily_user extends AppCompatActivity {

    RadioGroup rdGroup;
    RadioButton rbButton;
    EditText userText;
    FloatingActionButton addDaily;
    TextView txMood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_user);

        rdGroup = findViewById(R.id.radioGroup);
        txMood = findViewById(R.id.textMood);
        userText = findViewById(R.id.user_text_daily);

    }
    public void checkButton(View view){
        int radioId = rdGroup.getCheckedRadioButtonId();
        rbButton = findViewById(radioId);
        txMood.setText(rbButton.getText());
    }
}