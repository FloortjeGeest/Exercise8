package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.AsyncTask;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Games> games = new ArrayList<Games>();

        games.add(new Games("Normal mode"));
        games.add(new Games("Hard mode"));
        games.add(new Games("Normal time mode practice"));
        games.add(new Games("Hard time mode practice"));
        games.add(new Games("View challenges"));


        GamesAdapter gamesAdapter = new GamesAdapter(this, games);

        ListView listView = (ListView) findViewById(R.id.listview_games);
        listView.setAdapter(gamesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 4:
                        Intent viewchallenges = new Intent(MainActivity.this,ViewChallenges.class);
                        startActivity(viewchallenges);
                        break;
                    case 0:
                        Intent test = new Intent(MainActivity.this,Test.class);
                        startActivity(test);
                        break;
                }
            }
        });

    }

}