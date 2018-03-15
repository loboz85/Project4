package com.example.android.Project4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class After2010 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after2010);

        // Create a list of music
        ArrayList<Soundtrack> soundtracks = new ArrayList<>();
        soundtracks.add(new Soundtrack(R.drawable.skyfall, "Skyfall", "Skyfall", "Adele"));
        soundtracks.add(new Soundtrack(R.drawable.penny, "Be True", "Penny Dreadful", "Abel Korzeniowski"));
        soundtracks.add(new Soundtrack(R.drawable.spectre, "Writing's On The Wall", "Spectre", "Sam Smith"));
        soundtracks.add(new Soundtrack(R.drawable.crown, "Main Title", "The Crown", "Hans Zimmer "));
        soundtracks.add(new Soundtrack(R.drawable.dunkirk, "End Titles", "Dunkirk", "Dunkirk"));

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
