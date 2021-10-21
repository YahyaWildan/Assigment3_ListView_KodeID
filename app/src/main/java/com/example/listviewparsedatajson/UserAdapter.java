package com.example.listviewparsedatajson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listviewparsedatajson.data.model.BaseResponse;
import com.example.listviewparsedatajson.databinding.ItemUsersBinding;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private List<BaseResponse> data;
    private Context context;

    public UserAdapter(List<BaseResponse> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemUsersBinding binding = ItemUsersBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new UserViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        BaseResponse item = data.get(position);
        holder.setDataToView(item);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
