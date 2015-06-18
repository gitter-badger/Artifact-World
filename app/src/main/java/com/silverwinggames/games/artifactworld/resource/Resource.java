package com.silverwinggames.games.artifactworld.resource;

/**
 * Created by Samuel on 6/17/2015.
 */
public class Resource
{

    public static String name;
    public static double count;
    public static double modifier;

    public Resource()
    {

    }
    // Getters
    public static String getName() {return name;}
    public static double getCount() {return count;}
    public static double getModifier() {return modifier;}
    // Setters
    public static void setName(String name) {Resource.name = name;}
    public static void setCount(double count) {Resource.count = count;}
    public static void setModifier(double modifier) {Resource.modifier = modifier;}
}
