package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreHome = 0;
    int scoreGuest = 0;
    int yellowHome = 0;
    int redHome = 0;
    int yellowGuest = 0;
    int redGuest = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void one_point_home(View view) {
        scoreHome = scoreHome + 1;
        displayHome(scoreHome);
    }

    public void one_point_guest(View v){
        scoreGuest = scoreGuest +1;
        displayGuest(scoreGuest);
    }

    public void yellow_home(View v){
        yellowHome = yellowHome +1;
        displayYellowHome(yellowHome);
    }

    public void red_home(View v){
        redHome = redHome +1;
        displayRedHome(redHome);
    }

    public void yellow_guest(View v){
        yellowGuest = yellowGuest +1;
        displayYellowGuest(yellowGuest);
    }

    public void red_guest(View v){
        redGuest = redGuest +1;
        displayRedGuest(redGuest);
    }


    public void reset(View view){
        scoreHome = 0;
        scoreGuest = 0;
        yellowHome = 0;
        redHome = 0;
        yellowGuest = 0;
        redGuest = 0;

        displayHome(scoreHome);
        displayGuest(scoreGuest);
        displayYellowHome(yellowHome);
        displayRedHome(redHome);
        displayYellowGuest(yellowGuest);
        displayRedGuest(redGuest);
    }


    /**
     * Displays the given score for the Home team.
     */
    public void displayHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for the Away team.
     */
    public void displayGuest(int score) {
        TextView scoreView = (TextView) findViewById(R.id.guest_score);
        scoreView.setText((String.valueOf(score)));
    }

    /**
     * Displays the given number of yllow cards for the Home team.
     */
    public void displayYellowHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_num_home_text_view);
        scoreView.setText((String.valueOf(score)));
    }

    /**
     * Displays the given number of red cards for the Guest team.
     */
    public void displayRedHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_num_home_text_view);
        scoreView.setText((String.valueOf(score)));
    }


    /**
     * Displays the given number of red cards for the Guest team.
     */
    public void displayYellowGuest(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_num_guest_text_view);
        scoreView.setText((String.valueOf(score)));
    }


    /**
     * Displays the given number of red cards for the Guest team.
     */
    public void displayRedGuest(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_num_guest_text_view);
        scoreView.setText((String.valueOf(score)));
    }



}

