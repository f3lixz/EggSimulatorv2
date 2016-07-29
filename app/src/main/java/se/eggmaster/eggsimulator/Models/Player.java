package se.eggmaster.eggsimulator.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class Player implements Serializable {
    @SerializedName("level")
    private int mLevel;

    @SerializedName("region")
    private int mRegion;

    @SerializedName("pokemons")
    private int[] mPokemons;


    public Player() {
        mLevel = 0;
    }

    public void setLevel(int level) {
        mLevel = level;
    }

    public int getLevel() {
        return mLevel;
    }
}
