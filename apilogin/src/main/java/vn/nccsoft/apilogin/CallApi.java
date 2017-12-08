package vn.nccsoft.apilogin;

import android.content.Context;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by vancu on 20/11/2017.
 */

public class CallApi {
    public static void getTokenLogin(String username, String password) {

        Call<Item> mCall = ApiUtils.getAPIService().login(username,password);
        mCall.enqueue(new Callback<Item>() {
            @Override
            public void onResponse(Call<Item> call, Response<Item> response) {
                if(response.isSuccessful()) {
                    String  token = response.body().getToken();
                }
            }
            @Override
            public void onFailure(Call<Item> call, Throwable t) {

            }
        });
    }
}
