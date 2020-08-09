package com.example.myapplication;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/Docs/Show")
    @FormUrlEncoded
    Call<ResponseBody> live(@Field("ClientId") String cid,@Field("ClientSecret") String csecret);
}
