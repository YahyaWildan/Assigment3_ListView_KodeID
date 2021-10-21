package com.example.listviewparsedatajson;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listviewparsedatajson.data.model.BaseResponse;
import com.example.listviewparsedatajson.databinding.ItemUsersBinding;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ItemUsersBinding binding;

    public UserViewHolder(ItemUsersBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void setDataToView(BaseResponse item) {
        binding.tvName.setText(item.getName());
        binding.tvEmail.setText(item.getEmail());
        binding.tvPhone.setText(item.getPhone());
    }
}
