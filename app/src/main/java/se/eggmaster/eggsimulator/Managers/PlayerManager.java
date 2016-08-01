package se.eggmaster.eggsimulator.Managers;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.gson.Gson;

import se.eggmaster.eggsimulator.Models.Player;
import se.eggmaster.eggsimulator.Models.Pokemon;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class PlayerManager {

    private static final String PREFERENCE_NAME = "PlayerPrefsEggSim";
    private static final String PLAYER_NAME = "PlayerNameEggSim";

    private SharedPreferences mPrefs;
    private Player mPlayer;

    public PlayerManager(Activity activity) {
        mPrefs = activity.getSharedPreferences(PREFERENCE_NAME, 0);
        String playerJson = mPrefs.getString(PLAYER_NAME, "");
        if (playerJson.isEmpty())
            mPlayer = new Player();
        else {
            mPlayer = new Gson().fromJson(playerJson, Player.class);
        }
    }

    public void updateLevel(int level) {
        mPlayer.setLevel(level);
        saveStorage();
    }

    public void addPokemon(Pokemon pokemon)  {
        mPlayer.addPokemon(pokemon);
        saveStorage();
    }

    public Player getPlayer() {
        return mPlayer;
    }

    private void saveStorage() {
        Log.v("felix", "saveStorages");
        Gson gson = new Gson();
        String player = gson.toJson(mPlayer);
        mPrefs.edit().putString(PLAYER_NAME, player).commit();
    }

}
