package com.example.domekgoryegz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView polubieniaText;
    ImageView obrazek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        polubieniaText = findViewById(R.id.polubieniaText);
        obrazek = findViewById(R.id.obraz);
    }
    int licznikPolubien = 0;

    public void polub(View view) {
        licznikPolubien++;
        polubieniaText.setText(licznikPolubien + " polubień");

    }

    public void usunPolubienie(View view) {
        if(licznikPolubien > 0){
            licznikPolubien--;
        }
        polubieniaText.setText(licznikPolubien +  " polubień");
    }

    public void usunObrazek(View view) {
        obrazek.setVisibility(View.INVISIBLE);
    }
}