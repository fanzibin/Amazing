package com.demo.example.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.demo.example.R;

/**
 * Created by hzsunyj on 2017/9/26.
 */

public class ScanActivity extends Activity {

    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, ScanActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
    }
}
