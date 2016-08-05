package se.eggmaster.eggsimulator.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import se.eggmaster.eggsimulator.Adapters.PokemonGridAdapter;
import se.eggmaster.eggsimulator.Core.IPokedexEvents;
import se.eggmaster.eggsimulator.Core.Pokedex;
import se.eggmaster.eggsimulator.Core.Universal;
import se.eggmaster.eggsimulator.MainActivity;
import se.eggmaster.eggsimulator.R;
import se.eggmaster.eggsimulator.UI.InfoDialog;
import se.eggmaster.eggsimulator.UI.LevelChooserWidget;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class PlayerSettingsFragment extends Fragment implements View.OnClickListener, IPokedexEvents {

    private Button mContinueButton;

    private ImageView mEgg2km, mEgg5km, mEgg10km;
    private View mEgg5kmMask, mEgg10kmMask;

    private Integer mSelectedEgg;

    @Override
    public void onResume() {
        super.onResume();
        Pokedex.subscribe(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        Pokedex.unSubscribe(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.player_settings_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mContinueButton = (Button) view.findViewById(R.id.continueButton);
        mContinueButton.setOnClickListener(this);
        mEgg2km = (ImageView) view.findViewById(R.id.egg1);
        mEgg2km.setOnClickListener(getEggOnClickListener(Pokedex.EGG_2KM));
        mEgg5km = (ImageView) view.findViewById(R.id.egg2);
        mEgg5km.setOnClickListener(getEggOnClickListener(Pokedex.EGG_5KM));
        mEgg10km = (ImageView) view.findViewById(R.id.egg3);
        mEgg10km.setOnClickListener(getEggOnClickListener(Pokedex.EGG_10KM));

        mEgg5kmMask = view.findViewById(R.id.disabledView2);
        mEgg10kmMask = view.findViewById(R.id.disabledView3);

        updateMasks();

    }

    private void updateMasks() {
        if (Universal.getPlayerManager().getPlayer().getProgress() < Pokedex.EGG_5KM) {
            mEgg5kmMask.setVisibility(View.VISIBLE);
        }
        if (Universal.getPlayerManager().getPlayer().getProgress() < Pokedex.EGG_10KM) {
            mEgg10kmMask.setVisibility(View.VISIBLE);
        }

    }

    public View.OnClickListener getEggOnClickListener(final int eggId) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Universal.getPlayerManager().getPlayer().getProgress() >= eggId) {
                    mSelectedEgg = eggId;
                    updateEggDrawables();
                    v.setSelected(true);
                    v.setBackground(getResources().getDrawable(R.drawable.selected_border));
                    v.invalidate();
                } else {
                    new InfoDialog(getContext(), eggId).show();
                }
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
        if (mSelectedEgg != null) {
            Bundle args = new Bundle();
            args.putInt(Universal.KEY_EGG_ID, mSelectedEgg);
            EggOpenerFragment fragment = new EggOpenerFragment();
            fragment.setArguments(args);
            ((MainActivity) getActivity()).replaceFragment(fragment);
        } else {
            Toast.makeText(getContext(), R.string.error_choose_egg, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void finishedEggRequirement(int progress) {
        updateMasks();
    }
}
