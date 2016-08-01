package se.eggmaster.eggsimulator.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class Player implements Serializable {
    @SerializedName("level")
    private int mLevel;

    @SerializedName("region")
    private int mRegion;

    @SerializedName("pokemons")
    private Pokemon[] mPokemons;


    public Player() {
        mLevel = 0;
    }

    public void setLevel(int level) {
        mLevel = level;
    }

    public int getLevel() {
        return mLevel;
    }

    public void addPokemon(Pokemon pokemon) {
        if (mPokemons == null)
            mPokemons = new Pokemon[1];
        else
            mPokemons = new Pokemon[mPokemons.length];
        mPokemons[mPokemons.length - 1] = pokemon;
    }

    public Pokemon[] getPokemons() {
        if (mPokemons == null)
            mPokemons = new Pokemon[1];
        return mPokemons;
    }

    public void clearPokemons() {
        mPokemons = null;
    }

}
