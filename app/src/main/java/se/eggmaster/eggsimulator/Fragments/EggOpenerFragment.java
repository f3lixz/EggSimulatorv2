package se.eggmaster.eggsimulator.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.Random;

import se.eggmaster.eggsimulator.Core.Pokedex;
import se.eggmaster.eggsimulator.Core.Universal;
import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.R;
import se.eggmaster.eggsimulator.UI.PokePopDialog;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class EggOpenerFragment extends Fragment implements View.OnClickListener {

    private ImageView mEggImage;
    private CheckBox mSkipCrackCheckBox;
    private PokePopDialog mPokePopDialog;
    private int mEggState = 0;

    private int mEggId;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        mEggId = getArguments().getInt(Universal.KEY_EGG_ID, Pokedex.EGG_2KM);
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.egg_opener_fragment, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mSkipCrackCheckBox = (CheckBox) view.findViewById(R.id.dontCrackCheckbox);
        mEggImage = (ImageView) view.findViewById(R.id.eggImage);
        mEggImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (mSkipCrackCheckBox.isChecked() || mEggState == 2) {
            if (mPokePopDialog == null)
                mPokePopDialog = new PokePopDialog(getActivity());

            Pokemon pokemon = Pokedex.getRandomPokemon(mEggId, Universal.getPlayerManager().getPlayer().getLevel());
            mPokePopDialog.show();
            mPokePopDialog.setPokemon(pokemon);
            mEggState = 0;
        } else {
            mEggState++;
        }
        switch (mEggState) {
            case 0:
                mEggImage.setImageResource(R.drawable.egg);
                break;
            case 1:
                mEggImage.setImageResource(R.drawable.egg_crack_one);
                break;
            case 2:
                mEggImage.setImageResource(R.drawable.egg_crack_two);

        }

    }
}
