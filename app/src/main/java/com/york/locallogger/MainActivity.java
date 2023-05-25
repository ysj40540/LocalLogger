package com.york.locallogger;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.york.library.ClientConfiguration;
import com.york.library.LogToFileUtils;
import com.york.library.YLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setMaxLogSize(10 * 1024 * 1024);
        //init log
        LogToFileUtils.init(getApplicationContext(), clientConfiguration);
        LogToFileUtils.getInstance().setUseSdCard(false);
        //enable log
        YLog.enableLog();
        //send a log
//        YLog.logInfo("MainActivity开始写日志啦", true);

        findViewById(R.id.tv_add).setOnClickListener(v -> YLog.logInfo("MainActivity开始写日志啦"+System.currentTimeMillis(), true));
    }
}