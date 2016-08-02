package se.eggmaster.eggsimulator.Managers;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.Models.Pokemons.Pokemons;

/**
 * Created by FelixTheMaster on 2016-08-01.
 */
public class PokemonManager {
    private static final String PREFERENCE_NAME = "PokemonPrefsEggSim";
    private static final String POKEMON_NAME = "PokemonNameEggSimZ";

    private SharedPreferences mPrefs;

    private Pokemons mPokemons;

    public PokemonManager(Activity activity) {
        mPrefs = activity.getSharedPreferences(PREFERENCE_NAME, 0);
        String pokemonJson = mPrefs.getString(POKEMON_NAME, "");

        Gson gson = new GsonBuilder().create();
        if (pokemonJson.isEmpty()) {
            mPokemons = new Pokemons();
        } else {
            mPokemons = gson.fromJson(pokemonJson, Pokemons.class);
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
