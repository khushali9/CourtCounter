package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    int totalScoreA=0;
    int totalScoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayForTeamA(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_a_score);

        totalScoreA+=score;
        scoreView.setText(String.valueOf(totalScoreA));
    }
    public void displayForTeamB(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_b_score);

        totalScoreB+=score;
        scoreView.setText(String.valueOf(totalScoreB));
    }
    public void teamA3(View v){
        displayForTeamA(3);

    }

    public void teamA2(View v){
        displayForTeamA(2);

    }
    public void teamAfree(View v){
        displayForTeamA(1);

    }

    public void teamB3(View v){
        displayForTeamB(3);

    }

    public void teamB2(View v){
        displayForTeamB(2);

    }
    public void teamBfree(View v){
        displayForTeamB(1);

    }
    public void set0(View v){
        totalScoreA=0;
        totalScoreB=0;
        displayForTeamB(0);
        displayForTeamA(0);

    }
}
