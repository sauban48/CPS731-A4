package com.example.assign4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<Animals> animalsList;
    private RecyclerListener listener;

    public MyAdapter(ArrayList<Animals> animalsList, RecyclerListener listener){
        this.animalsList = animalsList;
        this.listener = listener;
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
        String imgURL = animalsList.get(position).getImgURL();
        holder.animalName.setText(name);
        holder.animalDesc.setText(desc);
    }

    @Override
    public int getItemCount() {
        return animalsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView animalName;
        private TextView animalDesc;


        public MyViewHolder(final View itemView) {
            super(itemView);
            animalName = itemView.findViewById(R.id.animalName);
            animalDesc = itemView.findViewById(R.id.animalDescription);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, getAdapterPosition());

        }
    }
    public interface RecyclerListener{
        void onClick(View v, int position);
    }

}
