package com.teamone.chatboot.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.teamone.chatboot.R;
import com.teamone.chatboot.databinding.ActivityChatBinding;
import com.teamone.chatboot.models.User;
import com.teamone.chatboot.utilities.Constants;

public class ChatActivity extends AppCompatActivity {
    private ActivityChatBinding binding;
    private User receiverUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        setContentView(R.layout.activity_chat);
    }

    private void loadReceiverDetail(){
        receiverUser= (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }

    private void setListeners(){
        binding.imageBack.setOnClickListener(v->onBackPressed());
    }
}