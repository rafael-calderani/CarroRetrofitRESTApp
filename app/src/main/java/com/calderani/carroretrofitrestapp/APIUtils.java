package com.calderani.carroretrofitrestapp;

/**
 * Created by logonrm on 19/06/2017.
 */

public class APIUtils {
    private APIUtils() {}

    public static final String BASE_URL = "http://10.3.1.20:3000"; //TODO: pegar ip no runtime

    public static CarroAPI getCarroAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(CarroAPI.class);
    }
}
