package com.silverwinggames.games.artifactworld.core;

/**
 * Created by Samuel on 6/18/2015.
 */
public class Player
{
    private static String name;
    private static int uid;
    private static int clickPower;
    private static int clickModifier;

    public Player()
    {
        //TODO Add localization somehow.
    }

    // Getters
    public static String getName() {return name;}
    public static int getUid() {return uid;}
    public static int getClickPower() {return clickPower;}
    public static int getClickModifier() {return clickModifier;}

    // Setters
    public static void setName(String name) {Player.name = name;}
    public static void setUid(int uid) {Player.uid = uid;}
    public static void setClickPower(int clickPower) {Player.clickPower = clickPower;}
    public static void setClickModifier(int clickModifier) {Player.clickModifier = clickModifier;}
}
