package com.anthzh.androidviewhelper;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.anthzh.tool.viewhelper.AndroidViewHelper;
import com.anthzh.tool.viewhelper.helper.ButtonHelper;
import com.anthzh.tool.viewhelper.helper.EditTextHelper;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditTextHelper editTextHelper = AndroidViewHelper.editText(this, R.id.main_input_et);

        editTextHelper
                .setTextColor(Color.BLUE)
                .setHintTextColor(Color.GRAY)
                .addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                })
                .setText("Hello AndroidViewHelper!");

        ButtonHelper buttonHelper = AndroidViewHelper.button(this, R.id.main_change_btn);
        buttonHelper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText =
                        editTextHelper
                                .setText("Hello AndroidViewHelper!")
                                .selectAll()
                                .getView();
                String inputText = editText.getText().toString();
                Log.d(TAG, "onClick: " + inputText);
            }
        });
    }
}
