package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA =0;
    public void plusthreeA(View v){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }

    public void plustwoA(View v){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }

    public void plusoneA(View v){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    public void minusoneA(View v){
        scoreA=scoreA-1;
        displayForTeamA(scoreA);
    }

    /**Making the Functions for Calculating the Score of B
     *
     */
    int scoreB =0;
    public void plusthreeB(View v){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }

    public void plustwoB(View v){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }

    public void plusoneB(View v){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    public void minusoneB(View v){
        scoreB=scoreB-1;
        displayForTeamB(scoreB);
    }
    public void resetscore(View v){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int scoreF) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreF));
    }
}