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
        ArrayList<Soundtrack> soundtracks = new ArrayList<Soundtrack>();
        soundtracks.add(new Soundtrack(R.drawable.sheltering,"The Sheltering Sky Theme", "The Sheltering Sky","Ryuichi Sakamoto"));
        soundtracks.add(new Soundtrack(R.drawable.weronika,"Les Marionnettes", "The Sheltering Sky","Zbigniew Preisner"));
        soundtracks.add(new Soundtrack(R.drawable.bodyguard,"I Will Always Love You", "The Bodyguard","Whitney Houston"));
        soundtracks.add(new Soundtrack(R.drawable.philadelphia,"Streets of Philadelphia", "Philadelphia","Bruce Springsteen"));
        soundtracks.add(new Soundtrack(R.drawable.piano,"The Heart Asks Pleasure First", "Piano","Michael Nyman"));


        // Create an {@link SountrackAdapter}, whose data source is a list of {@link Soundtrack}s. The
        // adapter knows how to create list items for each item in the list.
        SountrackAdapter adapter =   new SountrackAdapter(this, soundtracks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // before_1990.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SountrackAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Soundtrack} in the list.
        listView.setAdapter(adapter);

        // set up back button on ActionBar, that moves user back to MainActivity screen
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
