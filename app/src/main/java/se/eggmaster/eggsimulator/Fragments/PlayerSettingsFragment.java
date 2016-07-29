package se.eggmaster.eggsimulator.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import se.eggmaster.eggsimulator.R;
import se.eggmaster.eggsimulator.UI.LevelChooserWidget;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class PlayerSettingsFragment extends Fragment {

    private LevelChooserWidget mLevelChooserWidget;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.player_settings_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        mLevelChooserWidget = (LevelChooserWidget) view.findViewById(R.id.levelChooser);
        super.onViewCreated(view, savedInstanceState);
    }
}
