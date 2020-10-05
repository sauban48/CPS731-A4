package com.example.assign4;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Animals> animalList;
    private MyAdapter.RecyclerListener listener;

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
        setOnClickListener();
        MyAdapter adapter = new MyAdapter(animalList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new MyAdapter.RecyclerListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), AnimalActivity.class);
                intent.putExtra("animalName", animalList.get(position).getAnimalName());
                startActivity(intent);
            }
        };
    }


    private void setAnimalInfo() {
        animalList.add(new Animals("Cat", "Click to see a cat!", "cat.jpg"));
        animalList.add(new Animals("Dog", "Click to see a dog!", "cat.jpg"));
        animalList.add(new Animals("Fox", "Click to see a fox!", "cat.jpg"));
        animalList.add(new Animals("Bat", "Click to see a bat!", "cat.jpg"));
        animalList.add(new Animals("Cow", "Click to see a cow!", "cat.jpg"));
        animalList.add(new Animals("Goat", "Click to see a goat!", "cat.jpg"));
        animalList.add(new Animals("Chicken", "Click to see a chicken!", "cat.jpg"));
        animalList.add(new Animals("Donkey", "Click to see a donkey!", "cat.jpg"));
        animalList.add(new Animals("Turtle", "Click to see a turtle!", "cat.jpg"));
        animalList.add(new Animals("Deer", "Click to see a deer!", "cat.jpg"));
    }

}