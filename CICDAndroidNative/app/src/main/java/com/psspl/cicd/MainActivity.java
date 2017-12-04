package com.psspl.cicd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.testfairy.TestFairy;

public class MainActivity extends AppCompatActivity {
    private EditText eteditbxo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestFairy.begin(this, "e052acbf9c9ed810d85a9bdb6e28c54d8f3e211c");
        eteditbxo=(EditText) findViewById(R.id.eteditbxo);



    }
}
