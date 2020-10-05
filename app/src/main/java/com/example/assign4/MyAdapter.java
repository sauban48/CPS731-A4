package com.example.assign4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Animals> animalsList;

    public MyAdapter(ArrayList<Animals> animalsList){
        this.animalsList = animalsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_main, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String name = animalsList.get(position).getAnimalName();
        String desc = animalsList.get(position).getAnimalDescription();
        holder.animalName.setText(name);
        holder.animalDesc.setText(desc);
    }

    @Override
    public int getItemCount() {
        return animalsList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView animalName;
        private TextView animalDesc;

        public MyViewHolder(final View itemView) {
            super(itemView);
            animalName = itemView.findViewById(R.id.animalName);
            animalDesc = itemView.findViewById(R.id.animalDescription);
        }
    }

}
