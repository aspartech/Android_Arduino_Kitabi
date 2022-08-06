package com.aspar.elektronikkitabi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aspar.elektronikkitabi.databinding.ActivityDetailsBinding;

public class Details extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        ELektronik selectedElektronik = (ELektronik) intent.getSerializableExtra("elektronik");
        binding.nameText.setText(selectedElektronik.name);
        binding.tanimText.setText(selectedElektronik.tanim);
        binding.image.setImageResource(selectedElektronik.image);
    }
}