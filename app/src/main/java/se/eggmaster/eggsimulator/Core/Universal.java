package se.eggmaster.eggsimulator.Core;

import android.app.Activity;

import se.eggmaster.eggsimulator.PlayerManager;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public final class Universal {
    private static PlayerManager mPlayerManager;


    public static void init(Activity activity) {
        mPlayerManager = new PlayerManager(activity);
    }

    public static PlayerManager getPlayerManager() {
        return mPlayerManager;
    }

}
