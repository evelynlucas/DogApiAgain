package org.pursuit.dogapiagain;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import org.pursuit.dogapiagain.model.Dog;
import org.pursuit.dogapiagain.network.GetApi;
import org.pursuit.dogapiagain.network.RetrofitSingleton;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = RetrofitSingleton.getInstance();
        GetApi getApi = retrofit.create(GetApi.class);

        getApi.getDogImages("hound")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> Log.d("mainActivity", response.getMessage().get(0)), error -> {
                    Log.d("failure", error.getMessage());
                });

    }
}
