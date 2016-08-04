package se.eggmaster.eggsimulator.Managers;

import android.app.Activity;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.Models.PokemonContainer;

/**
 * Created by FelixTheMaster on 2016-08-01.
 */
public class PokemonManager {
    private static final String PREFERENCE_NAME = "PokemonPrefsEggSim";
    private static final String POKEMON_NAME = "PokemonNameEggSimZ";

    private SharedPreferences mPrefs;

    private PokemonContainer mPokemons;

    public PokemonManager(Activity activity) {
        mPrefs = activity.getSharedPreferences(PREFERENCE_NAME, 0);
        String pokemonJson = mPrefs.getString(POKEMON_NAME, "");

        Gson gson = new GsonBuilder().create();
        if (pokemonJson.isEmpty()) {
            mPokemons = new PokemonContainer();
        } else {
            mPokemons = gson.fromJson(pokemonJson, PokemonContainer.class);
        }
    }

    public void addPokemon(Pokemon pokemon) {
        mPokemons.addPokemon(pokemon);
        saveStorage();
    }

    public ArrayList<Pokemon> getPokemons() {
        return mPokemons.getPokemons();
    }

    private void saveStorage() {
        Gson gson = new Gson();
        String pokemons = gson.toJson(mPokemons);
        mPrefs.edit().putString(POKEMON_NAME, pokemons).commit();
    }

}
