package com.example.project;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.time.LocalDate;

public class Data_Entry_Activity_Screen extends AppCompatActivity {

    private TextView tv_date;
    private EditText et_name;
    private Spinner spinner_expiration, spinner_servings, spinner_packages, spinner_meal_type, spinner_food_group;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry_screen);

        tv_date = findViewById(R.id.tv_people);
        et_name = findViewById(R.id.et_name);
        spinner_expiration = findViewById(R.id.spinner_expiration);
        spinner_servings = findViewById(R.id.spinner_servings);
        spinner_packages = findViewById(R.id.spinner_packages);
        spinner_meal_type = findViewById(R.id.spinner_meal_type);
        spinner_food_group = findViewById(R.id.spinner_food_group);

        //Filling items for dates of expiration
        String[] expiration = {"6-months", "7-months", "8-months", "9-months", "10-months", "11-months", "12-months", "13-months", "14-months",
                "15-months", "16-months", "17-months", "18-months", "19-months", "20-months", "21-months", "22-months", "23-months", "24-months"};
        ArrayAdapter <String> adapter_expiration = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, expiration);
        spinner_expiration.setAdapter(adapter_expiration);

        //Filling items for number of servings
        Integer[] servings = {1,2,3,4,5,6,7,8,9,10};
        ArrayAdapter <Integer> adapter_servings = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, servings);
        spinner_servings.setAdapter(adapter_servings);

        //Filling items for number of packages
        Integer[] packages = {1,2,3,4,5,6,7,8,9,10};
        ArrayAdapter <Integer> adapter_packages = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, packages);
        spinner_packages.setAdapter(adapter_packages);

        //Filling items for types of meal
        String[] meal_type = {"N/A", "Main Dish", "Side Dish", "Dessert"};
        ArrayAdapter <String> adapter_meal_type = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, meal_type);
        spinner_meal_type.setAdapter(adapter_meal_type);

        //Filling items for groups of food
        String[] food_group = {"Vegetable, Grains", "Starch, Fruit, Dairy, Meat", "Beans, Oils", "Sweets"};
        ArrayAdapter <String> adapter_food_group = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, food_group);
        spinner_food_group.setAdapter(adapter_food_group);

        //Setting the current date in the Text View
        LocalDate currentDate = LocalDate.now();
        tv_date.setText(currentDate.toString());
    }

    //Button to save the entry data
    public void save_data(View v){}

    //Button to return
    public void b_return(View v){
        Intent ret = new Intent(this, MainActivity.class);
        startActivity(ret);
    }
}