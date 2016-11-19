package com.allysonboone.allysonboone.hackathon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
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
    private ArrayList<String> clubs = new ArrayList<>();
    public void createArray(ArrayList<String> clubs){
        clubs.add("HES");
        clubs.add("GES");
        clubs.add("ACM-W");
    }
    /**
     * This method is called when the next button is clicked.
     */
    public void changeClub(View view) {
        createArray(clubs);
        int pos = 0;
        if(pos<clubs.size()){
            display(pos);
            pos++;
        }
        else{
            pos = 0;
            display(pos);
        }
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int pos) {
        TextView quantityTextView = (TextView) findViewById(R.id.clubName);
        quantityTextView.setText(clubs.get(pos));
    }
}
