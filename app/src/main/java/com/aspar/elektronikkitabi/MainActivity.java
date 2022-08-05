package com.aspar.elektronikkitabi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.aspar.elektronikkitabi.databinding.ActivityDetailsBinding;
import com.aspar.elektronikkitabi.databinding.ActivityMainBinding;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ELektronik> elektronikArraylist;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        elektronikArraylist = new ArrayList<>();

        ELektronik uno = new ELektronik("Uno", "tanım kısmı", R.drawable.uno);
        ELektronik nano = new ELektronik("Nano", "tanım kısmı", R.drawable.nano);
        ELektronik leo = new ELektronik("Leonardo", "tanım kısmı", R.drawable.leo);
        ELektronik mini = new ELektronik("Mini", "tanım kısmı", R.drawable.mini);

        elektronikArraylist.add(uno);
        elektronikArraylist.add(nano);
        elektronikArraylist.add(leo);
        elektronikArraylist.add(mini);



    }
}