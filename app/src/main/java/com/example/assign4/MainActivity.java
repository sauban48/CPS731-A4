package com.example.assign4;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.*;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Animals> animalList;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        animalList = new ArrayList<>();
        recyclerView = findViewById(R.id.rvRecipe);
        setAnimalInfo();
        setAdapter();

    }

    private void setAdapter() {
        MyAdapter adapter = new MyAdapter(animalList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setAnimalInfo() {
        animalList.add(new Animals("Cat", "Click to see a cat!"));
        animalList.add(new Animals("Dog", "Click to see a dog!"));
        animalList.add(new Animals("Fox", "Click to see a fox!"));
        animalList.add(new Animals("Bat", "Click to see a bat!"));
        animalList.add(new Animals("Cow", "Click to see a cow!"));
        animalList.add(new Animals("Goat", "Click to see a goat!"));
        animalList.add(new Animals("Chicken", "Click to see a chicken!"));

        
    }

}