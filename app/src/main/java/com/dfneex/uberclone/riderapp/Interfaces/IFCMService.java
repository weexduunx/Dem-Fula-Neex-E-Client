package com.dfneex.uberclone.riderapp.Interfaces;

import com.dfneex.uberclone.riderapp.Model.fcm.FCMResponse;
import com.dfneex.uberclone.riderapp.Model.fcm.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
        "Authorization:key=AAAAf6dGbBc:APA91bFvI8qHjBfIetWfEKT_ixnhZmnr0bjjYVyWY991vE51FLnGEjG3cXUEf4rdpd7mDXzWJnLFtKiuMgZFvpdzIj69djsWfCRBzv238c-tc1B-KrTqRurU52UhNg1vzx5pNKqtBdTO"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
