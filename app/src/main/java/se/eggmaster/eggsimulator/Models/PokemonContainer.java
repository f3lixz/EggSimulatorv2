package se.eggmaster.eggsimulator.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

import se.eggmaster.eggsimulator.Models.Pokemon;

/**
 * Created by FelixTheMaster on 2016-08-02.
 */
public class PokemonContainer implements Serializable {

    @SerializedName("pokemons")
    private ArrayList<Pokemon> mPokemons;

    @SerializedName("pokemonIds")
    private ArrayList<Integer> mPokemonIds;

    public PokemonContainer() {
        mPokemons = new ArrayList<>();
        mPokemonIds = new ArrayList<>();
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        mPokemons = pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        mPokemons.add(pokemon);
    }

    public void addPokemonId(int pokeId) {
        if (!mPokemonIds.contains(pokeId))
            mPokemonIds.add(pokeId);
    }

    public ArrayList<Integer> getPokemonIds() {
        return mPokemonIds;
    }

    public ArrayList<Pokemon> getPokemons() {
        return mPokemons;
    }
}
