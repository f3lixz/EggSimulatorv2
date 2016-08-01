package se.eggmaster.eggsimulator.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import se.eggmaster.eggsimulator.MainActivity;
import se.eggmaster.eggsimulator.R;
import se.eggmaster.eggsimulator.UI.LevelChooserWidget;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class PlayerSettingsFragment extends Fragment implements View.OnClickListener {

    private LevelChooserWidget mLevelChooserWidget;
    private Button mContinueButton;

    private ImageView mEgg2km;
    private ImageView mEgg5km;
    private ImageView mEgg10km;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.player_settings_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mLevelChooserWidget = (LevelChooserWidget) view.findViewById(R.id.levelChooser);
        mContinueButton = (Button) view.findViewById(R.id.continueButton);
        mContinueButton.setOnClickListener(this);
        mEgg2km = (ImageView) view.findViewById(R.id.egg1);
        mEgg2km.setOnClickListener(getEggOnClickListener());
        mEgg5km = (ImageView) view.findViewById(R.id.egg2);
        mEgg5km.setOnClickListener(getEggOnClickListener());
        mEgg10km = (ImageView) view.findViewById(R.id.egg3);
        mEgg10km.setOnClickListener(getEggOnClickListener());
    }

    public View.OnClickListener getEggOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateEggDrawables();
                v.setSelected(true);
                v.setBackground(getResources().getDrawable(R.drawable.selected_border));
                v.invalidate();
            }
        };
    }

    private void updateEggDrawables() {
        mEgg2km.setSelected(false);
        mEgg5km.setSelected(false);
        mEgg10km.setSelected(false);
        mEgg2km.setBackground(null);
        mEgg5km.setBackground(null);
        mEgg10km.setBackground(null);
    }

    @Override
    public void onClick(View v) {
        ((MainActivity) getActivity()).replaceFragment(new EggOpenerFragment());
    }
}
