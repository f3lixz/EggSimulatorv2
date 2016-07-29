package se.eggmaster.eggsimulator.Core;

import java.util.ArrayList;

import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.Models.Pokemons.Blastoise;
import se.eggmaster.eggsimulator.Models.Pokemons.Bulbasaur;
import se.eggmaster.eggsimulator.Models.Pokemons.Charizard;
import se.eggmaster.eggsimulator.Models.Pokemons.Charmander;
import se.eggmaster.eggsimulator.Models.Pokemons.Ivysaur;
import se.eggmaster.eggsimulator.Models.Pokemons.Pikachu;
import se.eggmaster.eggsimulator.Models.Pokemons.Squirtle;
import se.eggmaster.eggsimulator.Models.Pokemons.Venusaur;
import se.eggmaster.eggsimulator.Models.Pokemons.Wartortle;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public final class IPokemonNames {

    public static String PIKACHU = "Pikachu";
    public static String BULBASAUR = "Bulbasaur";
    public static String IVYSAUR = "Ivysaur";
    public static String VENUSAUR = "Venusaur";
    public static String CHARMANDER = "Charmander";
    public static String CHARMELEON = "Charmeleon";
    public static String CHARIZARD = "Charizard";
    public static String SQUIRTLE = "Squirtle";
    public static String WARTORTLE = "Wartortle";
    public static String BLASTOISE = "Blastoise";

    static ArrayList<Pokemon> mPokemonById = new ArrayList<>();
    static {
        mPokemonById.add(0, null);
        mPokemonById.add(1, new Bulbasaur());
        mPokemonById.add(2, new Ivysaur());
        mPokemonById.add(3, new Venusaur());
        mPokemonById.add(4, new Charmander());
        mPokemonById.add(5, new Charmander());
        mPokemonById.add(6, new Charizard());
        mPokemonById.add(7, new Squirtle());
        mPokemonById.add(8, new Wartortle());
        mPokemonById.add(9, new Blastoise());

        //mPokemonById.add(25, new Pikachu());
    }

    public static Pokemon getPokemonById(int id) {
        return mPokemonById.get(id);
    }

}
