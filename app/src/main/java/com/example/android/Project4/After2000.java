package com.example.android.Project4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class After2000 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after2000);


        // Create a list of music
        ArrayList<Soundtrack> soundtracks = new ArrayList<Soundtrack>();
        soundtracks.add(new Soundtrack(R.drawable.gladiator, "Now We Are Free", "Gladiator", "Hans Zimmer"));
        soundtracks.add(new Soundtrack(R.drawable.amelie, "Closer", "Amelia", "Yann Tiersen"));
        soundtracks.add(new Soundtrack(R.drawable.closer, "The Blower's Daughter", "Closer", "Damien Rice"));
        soundtracks.add(new Soundtrack(R.drawable.barcelona, "Barcelona", "Giulia y Los Tellarini", "Giulia y Los Tellarini"));
        soundtracks.add(new Soundtrack(R.drawable.intouchables, "Fly", "Intouchables", "Ludovico Einaudi"));

        // Create an {@link SountrackAdapter}, whose data source is a list of {@link Soundtrack}s. The
        // adapter knows how to create list items for each item in the list.
        SountrackAdapter adapter = new SountrackAdapter(this, soundtracks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // before1990xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SountrackAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Soundtrack} in the list.
        listView.setAdapter(adapter);

        // set up back button on ActionBar, that moves user back to MainActivity screen
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
