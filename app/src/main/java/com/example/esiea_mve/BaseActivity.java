package com.example.esiea_mve;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

abstract public class BaseActivity extends AppCompatActivity  {
    public void showBaseError(){
        //TODO afficher l'erreur
        Toast.makeText(this, "Oupsss... une erreur est survenue", Toast.LENGTH_SHORT).show();
    }
}
