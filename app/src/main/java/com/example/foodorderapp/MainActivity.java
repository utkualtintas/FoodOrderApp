package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int dessert_quantity=0;
    int cheeseBurger_quantity=0;
    int chips_quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dessert_increment(View view){
        dessert_quantity++;
        TextView dessert_textView = (TextView) findViewById(R.id.dessertText);

        dessert_textView.setText("Dessert count: "+dessert_quantity);
    }
    public void dessert_decrement(View view){
        if(dessert_quantity>0) {
            dessert_quantity--;
        }
        TextView dessert_textView = (TextView) findViewById(R.id.dessertText);

        dessert_textView.setText("Dessert count: "+dessert_quantity);
    }
    public void chips_decrement(View view){
        if(chips_quantity>0) {
            chips_quantity--;
        }
        TextView chips_textView = (TextView) findViewById(R.id.chipsText);

        chips_textView.setText("Chips count: "+chips_quantity);
    }
    public void chips_increment(View view){
        chips_quantity++;
        TextView chips_textView = (TextView) findViewById(R.id.chipsText);

        chips_textView.setText("Chips count: "+chips_quantity);
    } public void cheeseBurger_decrement(View view){
        if(cheeseBurger_quantity>0) {
            cheeseBurger_quantity--;
        }
        TextView cheeseBurger_textView = (TextView) findViewById(R.id.cheeseBurgerText);

        cheeseBurger_textView.setText("Dessert count: "+cheeseBurger_quantity);
    }
    public void cheeseBurger_increment(View view){
        cheeseBurger_quantity++;
        TextView cheeseBurger_textView = (TextView) findViewById(R.id.cheeseBurgerText);
        cheeseBurger_textView.setText("Dessert count: "+cheeseBurger_quantity);
    }

    public String mailBodyBuilder(){
        CheckBox ketchupCheckBox = (CheckBox)findViewById(R.id.ketchupCheckBox);
        CheckBox mayoCheckBox = (CheckBox)findViewById(R.id.mayocheckBox);
        CheckBox mustardCheckbox = (CheckBox) findViewById(R.id.mustardCheckBox);
        EditText nameEditText = (EditText) findViewById(R.id.namesEditText);
        EditText adressEditText = (EditText) findViewById(R.id.adressEditText);
        EditText notesEditText = (EditText) findViewById(R.id.notesEditText);
        String name = nameEditText.getText().toString();
        String adress = adressEditText.getText().toString();
        String notes = notesEditText.getText().toString();
        String sauces = "Sauces are: ";
        if(ketchupCheckBox.isChecked()){
            sauces = sauces + "ketchup, ";
        }
        if(mayoCheckBox.isChecked()){
            sauces = sauces + "mayonaisse, ";
        }
        if(mustardCheckbox.isChecked()){
            sauces = sauces + "mustard.";
        }
        return "Name: "+name+"\nAdress: +"+adress+"\nAdditional notes: "+notes+"\n"+sauces;




    }


}