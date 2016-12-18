package com.bignerdranch.android.zxing_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.zxing.client.android.CaptureActivity;

public class MainActivity extends AppCompatActivity {
    private static final String SCANNER="com.google.zxing.client.android.SCAN";
    private static final String PACKAGE="com.bignerdranch.android.zxing_demo";
    private Button mScanBarcodeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScanBarcodeButton =(Button)findViewById(R.id.button_start_barcode_scan);
        mScanBarcodeButton.setOnClickListener(v->{
            Intent intent=new Intent(MainActivity.this,CaptureActivity.class);
            startActivity(intent);
        });
    }
}
