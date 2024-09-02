package com.example.doubleactivity;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity {



        private final FoodExpert expert = new FoodExpert();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void onClickSeekMenu(View view) {
            Spinner MealSpinner = (Spinner) findViewById(R.id.MealSpinner);
            String SelectedMeal = String.valueOf(MealSpinner.getSelectedItem());

            List<String> menuList = expert.getMenu(SelectedMeal);

            StringBuilder menuFormatted = new StringBuilder();
            for (String menu : menuList) {
                menuFormatted.append(menu).append('\n');
            }

            TextView MenuTextView = (TextView) findViewById(R.id.SeekButton);
            MenuTextView.setText(menuFormatted);
            String messageText=MenuTextView.getText().toString();
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("message", messageText);
            startActivity(intent);

    }
}