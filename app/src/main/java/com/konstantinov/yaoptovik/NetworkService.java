package com.konstantinov.yaoptovik;

import android.app.Application;
import android.os.Message;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {//код для настройки библиотеки Retrofit.
    private static NetworkService mInstance; //singleton
    private static final String BASE_URL = "https://suggestions.dadata.ru/suggestions/api/4_1/rs/findById/";
    private Retrofit mRetrofit;

    private NetworkService() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder()//все данные запроса, включая URL, заголовки, тело, выведены в лог
                .addInterceptor(interceptor);

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client.build())
                .build();
    }

    public static NetworkService getInstance() {//singleton
        if (mInstance == null) {
            mInstance = new NetworkService();
        }
        return mInstance;
    }

    public DadataApi getJSONApi() {
        return mRetrofit.create(DadataApi.class); //Retrofit предоставляет реализацию интерфейса
    }
}
