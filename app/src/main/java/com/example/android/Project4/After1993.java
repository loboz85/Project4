package com.example.android.Project4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class After1993 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_1993);


        // Create a list of music
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.schindler, "Theme", "John Williams", "John Williams"));
        words.add(new Word(R.drawable.gump, "Suita", "Forrest Gump", "Alan Silvestri"));
        words.add(new Word(R.drawable.hill, "She", "Notting Hill", "Elvis Costello"));
        words.add(new Word(R.drawable.american, "Dead Already", "American Beauty", "Thomas Newman"));
        words.add(new Word(R.drawable.bandit, "Taniec Eleny", "Bandyta", "Michal Lorenc"));

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

        // set up back button on ActionBar, that moves user back to MainActivity screen
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
