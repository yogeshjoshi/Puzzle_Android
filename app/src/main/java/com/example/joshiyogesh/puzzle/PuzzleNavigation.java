package com.example.joshiyogesh.puzzle;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PuzzleNavigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    protected Button numberButton,alphabetButton,aboutUsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_navigation);
        numberButton = (Button)findViewById(R.id.Number_puzzle);
        alphabetButton = (Button)findViewById(R.id.Alphabet_puzzle);
        aboutUsButton = (Button)findViewById(R.id.button3);
        numberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NumberPuzzleList.class);
                startActivity(intent);
            }
        });
        alphabetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AlphabetQuestionList.class);
                startActivity(intent);
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.puzzle_navigation, menu);
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
            Intent intent = new Intent(getApplicationContext(),Settings.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.drawer_exercise1) {
            Intent intent = new Intent(getApplicationContext(),ExerciseOneQuestionList.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.drawer_exercise2) {
            Intent intent = new Intent(getApplicationContext(),ExerciseTwoQuestionsList.class);
            startActivity(intent);

        } else if (id == R.id.drawer_exercise3) {
            Intent intent = new Intent(getApplicationContext(),ExerciseThirdQuestionList.class);
            startActivity(intent);

        } else if (id == R.id.drawer_exercise4) {
            Intent intent = new Intent(getApplicationContext(),ExerciseFourthQuestionList.class);
            startActivity(intent);
        } else if (id == R.id.drawer_exercise5) {
            Intent intent = new Intent(getApplicationContext(),ExerciseFiveQuestionList.class);
            startActivity(intent);
        } else if (id == R.id.drawer_alphabet) {
            Intent intent = new Intent(getApplicationContext(),AlphabetQuestionList.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_share) {

        }
        else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
