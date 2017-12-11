package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Zhine on 2017/12/4.
 */

public class HttpUtil {

    /*
    * 进行访问*/
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        //配置地址
        Request request = new Request.Builder().url(address).build();
        //异步的
        client.newCall(request).enqueue(callback);
    }

}
