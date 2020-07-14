package com.dulu.oauth.api;

import com.dulu.oauth.model.ResponseLogin;
import com.dulu.oauth.model.Signin;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface RetrofitInterface {
    @FormUrlEncoded
    @POST("signin")
    Call<ResponseLogin> login(@Field("usernameOrEmail") String usernameOrEmail, @Field("password") String password);
//    Observable<Response> login();
    @POST("auth/signin")
    Call<ResponseLogin> signin(@Body Signin signin);
}
