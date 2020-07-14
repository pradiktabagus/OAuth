package com.dulu.oauth.api;

import android.util.Base64;

import com.dulu.oauth.Constanta;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.schedulers.Schedulers;

public class NetworkUtil {

    private static  Retrofit retrofit = null;
    private NetworkUtil(){}
    public static Retrofit getRetrofit(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(Constanta.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

//    public static RetrofitInterface getRetrofit(){
//        RxJavaCallAdapterFactory rxAdapter = RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io());
//        return new Retrofit.Builder()
//                .baseUrl(Constanta.BASE_URL)
//                .addCallAdapterFactory(rxAdapter)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//                .create(RetrofitInterface.class);
//    }
//    public static RetrofitInterface getRetrofit(String email, String password) {
//
//        String credentials = email + ":" + password;
//        String basic = "Basic " + Base64.encodeToString(credentials.getBytes(),Base64.NO_WRAP);
//        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//
//        httpClient.addInterceptor(chain -> {
//
//            Request original = chain.request();
//            Request.Builder builder = original.newBuilder()
//                    .addHeader("Authorization", basic)
//                    .method(original.method(),original.body());
//            return  chain.proceed(builder.build());
//
//        });
//
//
//        RxJavaCallAdapterFactory rxAdapter = RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io());
//
//        return new Retrofit.Builder()
//                .baseUrl(Constanta.BASE_URL)
//                .client(httpClient.build())
//                .addCallAdapterFactory(rxAdapter)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build().create(RetrofitInterface.class);
//    }

    public class RetrofitFactory{
        private RetrofitFactory(){}
    }
}
