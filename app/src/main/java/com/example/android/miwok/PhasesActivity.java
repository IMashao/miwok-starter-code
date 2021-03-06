package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phases);

        ArrayList<Word> words = new ArrayList<Word>();
        // words.add("one");
        words.add(new Word("Where are you going?","minto wuksus"));
        words.add(new Word("What is your name?","tinnә oyaase'nә"));
        words.add(new Word("My name is...?","oyaaset..."));
        words.add(new Word("How are you feeling??","michәksәs?"));
        words.add(new Word("I’m feeling good.?","kuchi achit"));
        words.add(new Word("Are you coming??","әәnәs'aa?"));
        words.add(new Word("I’m coming..","әәnәm"));
        words.add(new Word("Let’s go.","yoowutis"));
        words.add(new Word("Come here.","әnni'nem"));


        ListView listView = (ListView)findViewById(R.id.list);
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
        listView.setAdapter(adapter);


    }
}
