package com.calderani.carroretrofitrestapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by logonrm on 19/06/2017.
 */

public class RetrofitClient {
    private static Retrofit retro = null;
    public static Retrofit getClient(String baseUrl) {
        if (retro == null) {
            retro = new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        }

        return retro;
    }
}
