package com.hnkjxy.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    public String cityName;
    @SerializedName("id")
    public String weather;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
