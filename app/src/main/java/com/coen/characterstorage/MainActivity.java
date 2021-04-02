package com.coen.characterstorage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.coen.characterstorage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();
    Character tenko = new Character("Tenko");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tenko.setRace("Kitsune");
        tenko.setCharClass("Cleric");
        tenko.setLevel(5);
        tenko.setDex(15);
        tenko.getAcrobatics().setProficient(true);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        binding.setCharacter(tenko);
        //Log.v(TAG, tenko.getName() + tenko.getAcrobatics().isProficient());
    }
}