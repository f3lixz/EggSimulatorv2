package se.eggmaster.eggsimulator.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import se.eggmaster.eggsimulator.R;
import se.eggmaster.eggsimulator.UI.LevelChooserWidget;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class PlayerSettingsFragment extends Fragment implements View.OnClickListener {

    private LevelChooserWidget mLevelChooserWidget;
    private Button mContinueButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.player_settings_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        mLevelChooserWidget = (LevelChooserWidget) view.findViewById(R.id.levelChooser);
        mContinueButton = (Button) view.findViewById(R.id.continueButton);
        mContinueButton.setOnClickListener(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View v) {

    }
}
