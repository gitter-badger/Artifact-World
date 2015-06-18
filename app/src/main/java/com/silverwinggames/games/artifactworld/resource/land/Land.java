package com.silverwinggames.games.artifactworld.resource.land;

/**
 * Created by Samuel on 6/17/2015.
 */

public class Land
{
    private static String name;
    private static String baseType;
    private static char globalMod;
    private static char tierOneMod;
    private static char tierTwoMod;
    private static char tierThreeMod;

    public Land()
    {

    }

    // Getters.
    public static String getName() {return name;}
    public static char getGlobalMod() {return globalMod;}
    public static char getTierOneMod() {return tierOneMod;}
    public static char getTierTwoMod() {return tierTwoMod;}
    public static char getTierThreeMod() {return tierThreeMod;}
    // Setters
    public static void setName(String s) {name = s;}
    public static void setBaseType(String s) {baseType = s;}
    public static void setGlobalMod(char c) {globalMod = c;}
    public static void setTierOneMod(char c) {tierOneMod = c;}
    public static void setTierTwoMod(char c) {tierTwoMod = c;}
    public static void setTierThreeMod(char c) {tierThreeMod = c;}


}
