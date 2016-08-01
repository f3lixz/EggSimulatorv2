package se.eggmaster.eggsimulator.Core;

import android.app.Activity;
import android.content.Context;

import se.eggmaster.eggsimulator.Managers.PlayerManager;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public final class Universal {
    private static PlayerManager mPlayerManager;
    private static Context mainContext;


    public static void init(Activity activity) {
        mainContext = activity;
        mPlayerManager = new PlayerManager(activity);
    }

    public static PlayerManager getPlayerManager() {
        return mPlayerManager;
    }

    public static Context getMainContext() {
        return mainContext;
    }

}
