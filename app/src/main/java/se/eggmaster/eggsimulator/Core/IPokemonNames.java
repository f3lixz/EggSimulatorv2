package se.eggmaster.eggsimulator.Core;

import java.util.ArrayList;

import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.Models.Pokemons.Arbok;
import se.eggmaster.eggsimulator.Models.Pokemons.Beedrill;
import se.eggmaster.eggsimulator.Models.Pokemons.Blastoise;
import se.eggmaster.eggsimulator.Models.Pokemons.Bulbasaur;
import se.eggmaster.eggsimulator.Models.Pokemons.Butterfree;
import se.eggmaster.eggsimulator.Models.Pokemons.Caterpie;
import se.eggmaster.eggsimulator.Models.Pokemons.Charizard;
import se.eggmaster.eggsimulator.Models.Pokemons.Charmander;
import se.eggmaster.eggsimulator.Models.Pokemons.Ekans;
import se.eggmaster.eggsimulator.Models.Pokemons.Fearow;
import se.eggmaster.eggsimulator.Models.Pokemons.Ivysaur;
import se.eggmaster.eggsimulator.Models.Pokemons.Kakuna;
import se.eggmaster.eggsimulator.Models.Pokemons.Metapod;
import se.eggmaster.eggsimulator.Models.Pokemons.Pidgeot;
import se.eggmaster.eggsimulator.Models.Pokemons.Pidgeotto;
import se.eggmaster.eggsimulator.Models.Pokemons.Pidgey;
import se.eggmaster.eggsimulator.Models.Pokemons.Pikachu;
import se.eggmaster.eggsimulator.Models.Pokemons.Raichu;
import se.eggmaster.eggsimulator.Models.Pokemons.Raticate;
import se.eggmaster.eggsimulator.Models.Pokemons.Rattata;
import se.eggmaster.eggsimulator.Models.Pokemons.Spearow;
import se.eggmaster.eggsimulator.Models.Pokemons.Squirtle;
import se.eggmaster.eggsimulator.Models.Pokemons.Venusaur;
import se.eggmaster.eggsimulator.Models.Pokemons.Wartortle;
import se.eggmaster.eggsimulator.Models.Pokemons.Weedle;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public final class IPokemonNames {

    public static String BULBASAUR = "Bulbasaur";
    public static String IVYSAUR = "Ivysaur";
    public static String VENUSAUR = "Venusaur";
    public static String CHARMANDER = "Charmander";
    public static String CHARMELEON = "Charmeleon";
    public static String CHARIZARD = "Charizard";
    public static String SQUIRTLE = "Squirtle";
    public static String WARTORTLE = "Wartortle";
    public static String BLASTOISE = "Blastoise";
    public static String CATERPIE = "Caterpie";
    public static String METAPOD = "Metapod";
    public static String BUTTERFREE = "Butterfree";
    public static String WEEDLE = "Weedle";
    public static String KAKUNA = "Kakuna";
    public static String BEEDRILL = "Beedrill";
    public static String PIDGEY = "Pidgey";
    public static String PIDGEOTTO = "Pidgeotto";
    public static String PIDGEOT = "Pidgeot";
    public static String RATTATA = "Rattata";
    public static String RATICATE = "Raticate";
    public static String SPEAROW = "Spearow";
    public static String FEAROW = "Fearow";
    public static String EKANS = "Ekans";
    public static String ARBOK = "Arbok";
    public static String PIKACHU = "Pikachu";
    public static String RAICHU = "Raichu";

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
        mPokemonById.add(10, new Caterpie());
        mPokemonById.add(11, new Metapod());
        mPokemonById.add(12, new Butterfree());
        mPokemonById.add(13, new Weedle());
        mPokemonById.add(14, new Kakuna());
        mPokemonById.add(15, new Beedrill());
        mPokemonById.add(16, new Pidgey());
        mPokemonById.add(17, new Pidgeotto());
        mPokemonById.add(18, new Pidgeot());
        mPokemonById.add(19, new Rattata());
        mPokemonById.add(20, new Raticate());
        mPokemonById.add(21, new Spearow());
        mPokemonById.add(22, new Fearow());
        mPokemonById.add(23, new Ekans());
        mPokemonById.add(24, new Arbok());
        mPokemonById.add(25, new Pikachu());
        mPokemonById.add(26, new Raichu());
    }

    public static Pokemon getPokemonById(int id) {
        return mPokemonById.get(id);
    }

}
