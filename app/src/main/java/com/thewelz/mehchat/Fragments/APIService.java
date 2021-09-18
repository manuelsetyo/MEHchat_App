package com.thewelz.mehchat.Fragments;

import com.thewelz.mehchat.Notifications.MyResponse;
import com.thewelz.mehchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAflF1LIg:APA91bGUQPmvbppwebGHhNevA1jp7UQW07eiZRXnEbuiZf5zBr79w_eHWHL-STAJCKpDwG5C6gmu7yG6B8-MU1NYq6SoHAtveKT_Mlce51RFIUeQYir73pO1UsuWqr8zps728sVWaneQ"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
