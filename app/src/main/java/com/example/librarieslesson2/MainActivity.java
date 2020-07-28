package com.example.librarieslesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        TextWatcher tw = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                textView1.setText(editable.toString());

            }
        };
        editText1.addTextChangedListener(tw);
        //for git
    }

    private void initView() {
        textView1 = findViewById(R.id.text_view_1);
        editText1 = findViewById(R.id.editText_1);
    }
}