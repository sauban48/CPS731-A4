package com.example.assign4;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;





public class AnimalActivity extends AppCompatActivity{
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.animal_picture);

        ImageView animalImg = findViewById(R.id.animalImgView);
        TextView nameText = findViewById((R.id.animalName2));
        String animalName_ = "Animal not chosen";
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            animalName_ = extras.getString("animalName");
        }
        assert animalName_ != null;
        switch (animalName_){
            case "Cat":
                animalImg.setImageResource(R.drawable.cat);
                nameText.setText(animalName_);
                break;
            case "Dog":
                animalImg.setImageResource(R.drawable.dog);
                nameText.setText(animalName_);
                break;
            case "Fox":
                animalImg.setImageResource(R.drawable.fox);
                nameText.setText(animalName_);
                break;
            case "Bat":
                animalImg.setImageResource(R.drawable.bat);
                nameText.setText(animalName_);
                break;
            case "Cow":
                animalImg.setImageResource(R.drawable.cow);
                nameText.setText(animalName_);
                break;
            case "Goat":
                animalImg.setImageResource(R.drawable.goat);
                nameText.setText(animalName_);
                break;
            case "Chicken":
                animalImg.setImageResource(R.drawable.chicken);
                nameText.setText(animalName_);
                break;
            case "Donkey":
                animalImg.setImageResource(R.drawable.donkey);
                nameText.setText(animalName_);
                break;
            case "Turtle":
                animalImg.setImageResource(R.drawable.turtle);
                nameText.setText(animalName_);
                break;
            case "Deer":
                animalImg.setImageResource(R.drawable.deer);
                nameText.setText(animalName_);
                break;
        }




    }


}
