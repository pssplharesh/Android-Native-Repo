package com.psspl.cicd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.testfairy.TestFairy;

public class MainActivity extends AppCompatActivity {
    private EditText eteditbxo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestFairy.begin(this, "6681215ff9cea86f7d600c77108bb413c8022890");
        AppCenter.start(getApplication(), "ecf5bd41-08a7-41e1-b4e1-6d97f4e8ffe5",
                Analytics.class, Crashes.class);
        eteditbxo=(EditText) findViewById(R.id.eteditbxo);
        // This is second version
        //this build update again

    }
}
