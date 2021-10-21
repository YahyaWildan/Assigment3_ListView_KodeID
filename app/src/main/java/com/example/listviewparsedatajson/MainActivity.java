package com.example.listviewparsedatajson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.listviewparsedatajson.data.model.BaseResponse;
import com.example.listviewparsedatajson.data.network.ApiService;
import com.example.listviewparsedatajson.data.network.NetworkClient;
import com.example.listviewparsedatajson.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    UserAdapter adapterUser;
    List<BaseResponse> userResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        userResult = new ArrayList<>();
        adapterUser = new UserAdapter(userResult, this);
        binding.rvUser.setLayoutManager(new LinearLayoutManager(this));
        binding.rvUser.setAdapter(adapterUser);
        fetchUser();
    }

    private void fetchUser() {
        NetworkClient.getInstance().create(ApiService.class).getUsers().enqueue(new Callback<List<BaseResponse>>() {
            @Override
            public void onResponse(Call<List<BaseResponse>> call, Response<List<BaseResponse>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    userResult.addAll(response.body());
                    adapterUser.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<BaseResponse>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error" + t.getLocalizedMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
