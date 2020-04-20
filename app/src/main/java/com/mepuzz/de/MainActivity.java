package com.mepuzz.de;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mepuzz.mobilesdk.MePuzzService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MePuzzService.init("BXQ9JLy4nE", this);
        MePuzzService.sendEventToServer("Test Event from Android SDK 123", this);
    }
}
