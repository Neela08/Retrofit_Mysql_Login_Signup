package com.bitwisey.retrofit_mysql_login_signup.Networking;

import com.bitwisey.retrofit_mysql_login_signup.Model.RetroInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("register.php")
    Call<ResponseBody> register(
            @Field("name")String name,
            @Field("user_name")String user_name,
            @Field("password") String password,
            @Field("phone")String phone

    );


    @FormUrlEncoded
    @POST("login.php")
    Call<RetroInfo> logininfo(@Field("user_name")String user_name,
                              @Field("password") String password );

}
