package com.example.listviewparsedatajson.data.network;

import com.example.listviewparsedatajson.data.model.BaseResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("users")
    public Call<List<BaseResponse>> getUsers();
}
