package com.hnkjxy.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public Comform comfm;
    @SerializedName("cw")
    public CarWash carwash;
    public Sport sport;
    public class Comform{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public  String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }


}
