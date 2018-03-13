package com.example.android.Project4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class After1990 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_1990);



        // Create a list of music
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.sheltering,"The Sheltering Sky Theme", "The Sheltering Sky","Ryuichi Sakamoto"));
        words.add(new Word(R.drawable.weronika,"Les Marionnettes", "The Sheltering Sky","Zbigniew Preisner"));
        words.add(new Word(R.drawable.bodyguard,"I Will Always Love You", "The Bodyguard","Whitney Houston"));
        words.add(new Word(R.drawable.philadelphia,"Streets of Philadelphia", "Philadelphia","Bruce Springsteen"));
        words.add(new Word(R.drawable.piano,"The Heart Asks Pleasure First", "Piano","Michael Nyman"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter =   new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // before_1990.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
