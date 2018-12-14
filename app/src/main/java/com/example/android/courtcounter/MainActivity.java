package com.example.android.courtcounter;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Global variable For Team A score
     */
    int scoreTeamA = 0;
    int foulA = 0;
    int foulB = 0;

    /**
     * Global variable For Team B score
     */
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase score of team a by 3
     */
    public void onclick_A_3(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase score of team a by 2
     */
    public void onclick_A_2(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase score of team a by 1
     */

    public void onclick_A_free(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase score of team b by 3
     */
    public void onclick_B_3(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase score of team b by 2
     */
    public void onclick_B_2(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase score of team b by 1
     */

    public void onclick_B_free(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset score to zero
     */
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulA = 0;
        foulB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        foulTeamA(foulA);
        foulTeamB(foulB);
    }
    public void onclick_foul_A(View view) {
        foulA = foulA + 1;
        foulTeamA(foulA);
    }
    public void onclick_foul_B(View view) {
        foulB = foulB + 1;
        foulTeamB(foulB);
    }

    public void foulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void foulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

}
