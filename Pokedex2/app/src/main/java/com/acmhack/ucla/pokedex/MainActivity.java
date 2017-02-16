package com.acmhack.ucla.pokedex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //How to use CSVFile to read pokemon data
        //InputStream inputStream = getResources().openRawResource(R.raw.pokemon);
        //CSVFile csvFile = new CSVFile(inputStream);
        //List pokemonData = csvFile.read();
    }
}
