package com.calderani.carroretrofitrestapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;

/**
 * Created by logonrm on 19/06/2017.
 */
public class Carro {

    @SerializedName("marca")
    private String marca;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @SerializedName("modelo")
    private String modelo;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @SerializedName("cor")
    private String cor;
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}
