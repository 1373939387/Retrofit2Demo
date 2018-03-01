package com.haoruigang.retrofit.retrofit2;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by 13739 on 2018/1/9.
 */

public interface API {

    @GET("api/openapi/BaikeLemmaCardApi?scope=103&format=json&appid=379020&bk_key=银魂&bk_length=600")
    Call<ResponseBody> getTextUser();

    @GET("api/openapi/BaikeLemmaCardApi")
    Call<Result> getUserInfoQuery(@Query("scope") int scope, @Query("format") String format, @Query("appid") int appid, @Query("bk_key") String bk_key, @Query("bk_length") int bk_length);

    @GET("api/{openapi}/{BaikeLemmaCardApi}")
    Call<Result> getUserInfoPath(@Path("openapi") String openapi, @Path("BaikeLemmaCardApi") String BaikeLemmaCardApi, @Query("scope") int scope, @Query("format") String format, @Query("appid") int appid, @Query("bk_key") String bk_key, @Query("bk_length") int bk_length);

    @GET("api/{openapi}/{BaikeLemmaCardApi}")
    Call<Result> getUserInfoQueryMap(@Path("openapi") String openapi, @Path("BaikeLemmaCardApi") String BaikeLemmaCardApi, @QueryMap Map<String, String> params);

    @POST("api/openapi/BaikeLemmaCardApi")
    Call<Result> savaUser(@Body Info info);

    @Headers({
            "Accept: application/vnd.github.v3.full+json",
            "Result-Agent: Retrofit-Sample-App"
    })
    @FormUrlEncoded
    @POST("api/openapi/BaikeLemmaCardApi")
    Call<Result> editUser(@Field("scope") int scope, @Field("format") String format, @Field("appid") int appid, @Field("bk_key") String bk_key, @Field("bk_length") int bk_length);

    @POST("api/openapi/BaikeLemmaCardApi")
    Observable<Result> loginWithRx(@Body Info info);

}
