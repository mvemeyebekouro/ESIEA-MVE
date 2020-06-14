package com.example.esiea_mve;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends BaseActivity implements MainInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//J'ajoute du code
        showList();
        Button mainButton = findViewById(R.id.button2);
        mainButton.setBackgroundColor(Color.RED);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "OnClick", Toast.LENGTH_SHORT).show();


            }
        });

        Chat chat = new Chat( "toto", 2 );
        showBaseError();

    }

    private void showList() {
        //TODO afficher liste
    }


    @Override
    public void ShowList(List<Chat> list) {
        //TODO Faire le vrai code

    }

    @Override
    public void ShowLoader() {

    }

    @Override
    public void ShowError() {

    }
}