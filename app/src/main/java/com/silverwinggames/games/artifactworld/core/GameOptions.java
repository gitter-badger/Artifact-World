package com.silverwinggames.games.artifactworld.core;

/**
 * Created by Samuel on 6/18/2015.
 */
public class GameOptions
{
    private static String language;

    public GameOptions()
    {
        this.language = "en_us";
    }

    public static String getLanguage() {return language;}

    public static void setLanguage(String language) {GameOptions.language = language;}
}
