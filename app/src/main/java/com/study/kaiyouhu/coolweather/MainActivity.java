package com.study.kaiyouhu.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.study.kaiyouhu.coolweather.gson.Weather;
import com.study.kaiyouhu.coolweather.util.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtil.d("MainActivity:","Layout ready passed");
        setContentView(R.layout.activity_main);
        LogUtil.d("MainActivity:","Layout passed");
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        LogUtil.d("MainActivity:","fore set");
        if (prefs.getString("weather",null) != null){
            Intent intent = new Intent(this, WeatherActivity.class);
            LogUtil.d("MainActivity:","fore set after");
            startActivity(intent);

            finish();
        }
    }
}
