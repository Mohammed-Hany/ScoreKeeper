package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void threePointsA(View view){
        scoreA += 3;
        displayTeamA(scoreA);
    }

    public void threePointsB(View view){
        scoreB += 3;
        displayTeamB(scoreB);
    }

    public void twoPointsA(View view){
        scoreA += 2;
        displayTeamA(scoreA);
    }

    public void twoPointsB(View view){
        scoreB += 2;
        displayTeamB(scoreB);
    }

    public void fivePointsA(View view){
        scoreA += 5;
        displayTeamA(scoreA);
    }

    public void fivePointsB(View view){
        scoreB += 5;
        displayTeamB(scoreB);
    }

    public void reset (View view){
        scoreA = 0;
        scoreB = 0;
        displayTeamA(scoreA);
        displayTeamB(scoreB);
    }



    public void displayTeamA(int score){
        TextView scoreView = findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));

    }

    public void displayTeamB(int score){
        TextView scoreView = findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }
}
