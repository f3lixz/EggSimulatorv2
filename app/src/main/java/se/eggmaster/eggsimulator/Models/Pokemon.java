package se.eggmaster.eggsimulator.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public abstract class Pokemon {
    @SerializedName("name")
    private String mName;

    @SerializedName("level")
    private int mLevel;

    @SerializedName("hp")
    private int mHP;

    @SerializedName("cp")
    private int mCP;

    @SerializedName("weight")
    private float mWeight;

    @SerializedName("height")
    private float mHeight;

    public Pokemon(String name, int level, int hp, int cp, float weight, float height) {
        mName = name;
        mLevel = level;
        mHP = hp;
        mCP = cp;
        mWeight = weight;
        mHeight = height;
    }

    @Override
    public String toString() {
        return "{" + mName + "} lv: " + mLevel + ", hp: " + mHP + ", cp: " + mCP + ", w: " + mWeight + ", h: " + mHeight;
    }
}
