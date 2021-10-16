package com.example.sparkbank.UserInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sparkbank.R;

public class HomeScreen extends AppCompatActivity {

    Animation anim;
    ImageView bankLogo;
    TextView tvBankTitle;
    Button btnAllUsers, btnAllTransactions;
   @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //
        anim = AnimationUtils.loadAnimation(this, R.anim.animation);
        bankLogo = findViewById(R.id.bank_logo);
        btnAllUsers = findViewById(R.id.Users);
        btnAllTransactions = findViewById(R.id.Transaction);
        tvBankTitle = findViewById(R.id.bank_logo);

        bankLogo.setAnimation(anim);
        tvBankTitle.setAnimation(anim);
        btnAllUsers.setAnimation(anim);
        btnAllTransactions.setAnimation(anim);
    }
    public void showAllUsers(View view) {
        Intent intent = new Intent(this, UsersList.class);
        startActivity(intent);
    }

    public void showAllTransactions(View view) {
        Intent intent = new Intent(this, TransactionHistory.class);
        startActivity(intent);
}
}