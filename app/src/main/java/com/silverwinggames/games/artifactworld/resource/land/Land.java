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

    /**
     * Tier 0 (Base) Land
     * @param name Name of the Land.
     * @param baseType Base Type. Mountain, Desert, Plains
     */
    public Land(String name, String baseType)
    {
        this.name = name;
        this.baseType = baseType;
    }

    /**
     * Tier 1 Land
     * @param name Name of the Land.
     * @param baseType Base Type. Mountain, Desert, Plains
     * @param tierOneMod Tier One Mod : (f) Forest, (s) Savannah
     */
    public Land(String name, String baseType, char tierOneMod)
    {
        this.name = name;
        this.baseType = baseType;
        this.tierOneMod = tierOneMod;
    }

    /**
     * Tier 2 Land
     * @param name Name of the Land.
     * @param baseType Base Type. Mountain, Desert, Plains
     * @param tierOneMod Tier One Mod : (f) Forest, (s) Savannah
     * @param tierTwoMod Tier Two Mod : (s) Swamp, (j) Jungle, (m) Marsh, (g) Grasslands
     */
    public Land(String name, String baseType, char tierOneMod, char tierTwoMod)
    {
        this.name = name;
        this.baseType = baseType;
        this.tierOneMod = tierOneMod;
        this.tierTwoMod = tierTwoMod;
    }

    /**
     * Tier 3 Land
     * @param name Name of the Land.
     * @param baseType Base Type. Mountain, Desert, Plains
     * @param tierOneMod Tier One Mod : (f) Forest, (s) Savannah
     * @param tierTwoMod Tier Two Mod : (s) Swamp, (j) Jungle, (m) Marsh, (g) Grasslands
     * @param tierThreeMod Tier Three Mod : (r) Rainforest, (p) Paradise
     */
    public Land(String name, String baseType, char tierOneMod, char tierTwoMod, char tierThreeMod)
    {
        this.name = name;
        this.baseType = baseType;
        this.tierOneMod = tierOneMod;
        this.tierTwoMod = tierTwoMod;
        this.tierThreeMod = tierThreeMod;
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
