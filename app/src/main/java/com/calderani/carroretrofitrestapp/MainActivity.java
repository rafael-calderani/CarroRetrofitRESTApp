package com.calderani.carroretrofitrestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = (TextView) findViewById(R.id.tv);

        CarroAPI carroAPI = APIUtils.getCarroAPIService();
        carroAPI.listar().enqueue(new Callback<List<Carro>>() {
            @Override
            public void onResponse(Call<List<Carro>> call, Response<List<Carro>> response) {
                // Sucesso
                for (Carro carro : response.body()) {
                    //Log.i("Carro:", carro.getMarca());
                    String conteudo = tv.getText().toString();
                    tv.setText(conteudo + "\nModelo: " + carro.getModelo());
                    tv.setText(conteudo + " Marca: " + carro.getMarca());
                    tv.setText(conteudo + " Cor: " + carro.getCor());
                }
            }

            @Override
            public void onFailure(Call<List<Carro>> call, Throwable t) {
                // Deu ruim
            }
        });
    }
}
