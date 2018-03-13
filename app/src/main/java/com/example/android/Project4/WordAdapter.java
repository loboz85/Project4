package com.example.android.Project4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by loboz on 06.03.2018.
 */

public class WordAdapter extends ArrayAdapter<Word>  {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord= getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView composerTextView = (TextView) listItemView.findViewById(R.id.composer_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        composerTextView.setText(currentWord.getComposer());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        songTextView.setText(currentWord.getSong());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView movieTextView = (TextView) listItemView.findViewById(R.id.movie_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        movieTextView.setText(currentWord.getMovie());

// Find the TextView in the list_item.xml layout with the ID version_number
        ImageView Image = listItemView.findViewById(R.id.image_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        Image.setImageResource(currentWord.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
