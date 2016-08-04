package se.eggmaster.eggsimulator.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

import se.eggmaster.eggsimulator.Models.Pokemon;

/**
 * Created by FelixTheMaster on 2016-08-02.
 */
public class PokemonContainer implements Serializable {

    @SerializedName("pokemons")
    private ArrayList<Pokemon> mPokemons;

    public PokemonContainer() {
        mPokemons = new ArrayList<>();
    }

    public PokemonContainer(ArrayList<Pokemon> pokemons) {
        mPokemons = pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        mPokemons = pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        mPokemons.add(pokemon);
    }

    public ArrayList<Pokemon> getPokemons() {
        return mPokemons;
    }
}
