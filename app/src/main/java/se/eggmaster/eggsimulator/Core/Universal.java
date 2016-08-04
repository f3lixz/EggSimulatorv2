package se.eggmaster.eggsimulator.Core;

import android.app.Activity;
import android.content.Context;

import se.eggmaster.eggsimulator.Managers.PlayerManager;
import se.eggmaster.eggsimulator.Managers.PokemonManager;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public final class Universal {

    public static final String KEY_EGG_ID = "Egg_id_key";

    private static PlayerManager mPlayerManager;
    private static PokemonManager mPokemonManager;
    private static Context mainContext;


    public static void init(Activity activity) {
        mainContext = activity;
        mPlayerManager = new PlayerManager(activity);
        mPokemonManager = new PokemonManager(activity);
    }

    public static PlayerManager getPlayerManager() {
        return mPlayerManager;
    }

    public static Context getMainContext() {
        return mainContext;
    }

    public static PokemonManager getPokemonManager() {
        return mPokemonManager;
    }

}
