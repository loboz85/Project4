package com.example.android.Project4;

/**
 * Created by loboz on 05.03.2018.
 */
/**
 * {@link Soundtrack} represents sountrack tha user will listen.
 * * It contains a song title, image, author/composer, movie title.
 */
public class Soundtrack {
    /** song title */
    private String mSong;

    /** composer/author */
    private String mComposer;

    /** movie name */
    private String mMovie;

    /**
     * image
     */
    private int mImage;

    /**
     * Create a new  object.
     *
     *@param imageResourceId - id for image
     *
     * @param moviePlay - movie title
     *
     * @param songPlay - song title
     *
     * @param ComposerPlay - composer name
     */
    public Soundtrack(int imageResourceId, String songPlay, String moviePlay, String ComposerPlay) {
        mImage = imageResourceId;
        mComposer = ComposerPlay;
        mMovie= moviePlay;
        mSong = songPlay;

    }

    /**
     * get image ID
     */
    public Integer getImageResourceId() {
        return mImage;
    }

    /**
     * get song title
     */
    public String getSong() {
        return mSong;
    }

    /**
     * get movie title
     */
    public String getMovie() {
        return mMovie;
    }

    /**
     * get composer name
     */
    public String getComposer() {

        return mComposer;
    }

}
