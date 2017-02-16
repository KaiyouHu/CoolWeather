package com.study.kaiyouhu.coolweather.gson;

/**
 * Created by ASUS on 2017/2/16.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String api;
        public  String pm25;
    }
}
