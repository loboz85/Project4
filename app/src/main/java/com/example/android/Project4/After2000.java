package com.example.android.Project4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class After2000 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_2000);


        // Create a list of music
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.gladiator, "Now We Are Free", "Gladiator", "Hans Zimmer"));
        words.add(new Word(R.drawable.amelie, "Closer", "Amelia", "Yann Tiersen"));
        words.add(new Word(R.drawable.closer, "The Blower's Daughter", "Closer", "Damien Rice"));
        words.add(new Word(R.drawable.barcelona, "Barcelona", "Giulia y Los Tellarini", "Giulia y Los Tellarini"));
        words.add(new Word(R.drawable.intouchables, "Fly", "Intouchables", "Ludovico Einaudi"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // before_1990.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
