package com.haoruigang.retrofit.retrofit2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;
    @BindView(R.id.textView)
    TextView textView;
    API api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Retrofit retrofit2 = new Retrofit.Builder()
                .baseUrl("http://baike.baidu.com/")
                .addConverterFactory(GsonConverterFactory.create())//自动转换JSON需引入依赖 com.squareup.retrofit2:converter-gson
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//与RxJava2结合
                .build();
        api = retrofit2.create(API.class);

    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        /**
         * GET测试
         */
        Call<ResponseBody> call = api.getTextUser();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String result = response.body().string();
                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });

        /**
         * GET获取用户信息  @Query
         */
        api.getUserInfoQuery(103, "json", 379020, "银魂", 600).enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Toast.makeText(MainActivity.this, response.body().getKey(), Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, response.body().getDesc(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

        /**
         * GET获取用户信息   @Path  ,@Query
         */
        api.getUserInfoPath("openapi", "BaikeLemmaCardApi", 103, "json", 379020, "银魂", 600).enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Toast.makeText(MainActivity.this, response.body().getSubLemmaId() + "", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, response.body().getNewLemmaId() + "", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

        /**
         * GET获取用户信息  @Path   ,   @QueryMap
         */
        Map<String, String> map = new HashMap<>();
        map.put("scope", "103");
        map.put("format", "json");
        map.put("appid", "379020");
        map.put("bk_key", "银魂");
        map.put("bk_length", "600");

        api.getUserInfoQueryMap("openapi", "BaikeLemmaCardApi", map).enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Toast.makeText(MainActivity.this, response.body().getSubLemmaId() + "银", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, response.body().getNewLemmaId() + "魂", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

        /**
         * POST获取用户信息  @Body       JSON提交方式
         */
        Info info = new Info(103, "json", 379020, "银魂", 600);
        api.savaUser(info).enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Toast.makeText(MainActivity.this, response.body().getSubLemmaId() + "银Json", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, response.body().getNewLemmaId() + "魂Json", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

        /**
         * POST获取用户信息  @FormUrlEncoded      @Field       From提交方式
         */
        api.editUser(103, "json", 379020, "银魂", 600).enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Toast.makeText(MainActivity.this, response.body().getSubLemmaId() + "银From", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, response.body().getNewLemmaId() + "魂From", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

        /**
         * 与RxJava结合使用  报异常需在主程序中执行
         */
        api.loginWithRx(info).subscribe(new Observer<Result>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Result value) {
                Toast.makeText(MainActivity.this, value.getSubLemmaId() + "银Observer", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, value.getNewLemmaId() + "魂Observer", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(Throwable e) {
                Toast.makeText(MainActivity.this, "android.os.NetworkOnMainThreadException------>Observer", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onComplete() {

            }
        });

    }
}
