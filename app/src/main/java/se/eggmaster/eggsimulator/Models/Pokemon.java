package se.eggmaster.eggsimulator.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public abstract class Pokemon {
    @SerializedName("name")
    private String mName;

    @SerializedName("BaseAttack")
    private float mBaseAttack;

    @SerializedName("BaseDefence")
    private float mBaseDefence;

    @SerializedName("BaseStamina")
    private float mBaseStamina;

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

    public Pokemon(String name, float baseAttack, float baseDefence, float baseStamina) {
        mName = name;
        mBaseAttack = baseAttack;
        mBaseDefence = baseDefence;
        mBaseStamina = baseStamina;
    }

    public Pokemon(String name, int level, int hp, int cp, float weight, float height) {
        mName = name;
        mLevel = level;
        mHP = hp;
        mCP = cp;
        mWeight = weight;
        mHeight = height;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setLevel(int level) {
        mLevel = level;
    }

    public void setHP(int hp) {
        mHP = hp;
    }

    public void setCP(int cp) {
        mCP = cp;
    }

    public String getName() {
        return mName;
    }

    public int getLevel() {
        return mLevel;
    }

    public int getHP() {
        return mHP;
    }

    public int getCP() {
        return mCP;
    }

    public float getBaseAttack() {
        return mBaseAttack;
    }

    public float getBaseDefence() {
        return mBaseDefence;
    }

    public float getBaseStamina() {
        return mBaseStamina;
    }

    @Override
    public String toString() {
        return "{" + mName + "} lv: " + mLevel + ", hp: " + mHP + ", cp: " + mCP + ", w: " + mWeight + ", h: " + mHeight;
    }
}
