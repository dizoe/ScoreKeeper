package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreBatman = 0;

    int scoreSuperman = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * scores for Batman
     */

    public void addSixForBatman (View v) {
        scoreBatman = scoreBatman + 6;
        displayForBatman (scoreBatman);
    }
    public void addThreeForBatman (View v) {
        scoreBatman = scoreBatman + 3;
        displayForBatman(scoreBatman);
    }
    public void addTwoForBatman (View v) {
        scoreBatman = scoreBatman + 2;
        displayForBatman(scoreBatman);
    }
    public void addOneForBatman (View v) {
        scoreBatman = scoreBatman + 1;
        displayForBatman(scoreBatman);
    }

    /**
     *  scores for Superman
     */

    public void addSixForSuperman (View v) {
        scoreSuperman = scoreSuperman + 6;
        displayForSuperman(scoreSuperman);
    }
    public void addThreeForSuperman (View v) {
        scoreSuperman = scoreSuperman + 3;
        displayForSuperman(scoreSuperman);
    }
    public void addTwoForSuperman (View v) {
        scoreSuperman = scoreSuperman + 2;
        displayForSuperman(scoreSuperman);
    }
    public void addOneForSuperman (View v) {
        scoreSuperman = scoreSuperman + 1;
        displayForSuperman(scoreSuperman);
    }

    /**
     * Martha button
     */

    public void martha (View v) {
        scoreSuperman = 0;
        scoreBatman = 0;
        displayForSuperman(scoreSuperman);
        displayForBatman(scoreBatman);
    }







    /**
     * display for Batman
     */

    public void displayForBatman (int score) {
        TextView scoreView = (TextView) findViewById(R. id.batman_score);
        scoreView.setText (String.valueOf(score));
    }

    /**
     * display for Superman
     */

    public void displayForSuperman (int score) {
        TextView scoreView = (TextView) findViewById(R. id.superman_score);
        scoreView.setText (String.valueOf(score));
    }
}

