package se.eggmaster.eggsimulator.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Random;

import se.eggmaster.eggsimulator.Core.IPokemonNames;
import se.eggmaster.eggsimulator.Core.Universal;
import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.R;
import se.eggmaster.eggsimulator.UI.PokePopDialog;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class EggOpenerFragment extends Fragment implements View.OnClickListener {

    private ImageView mEggImage;
    private PokePopDialog mPokePopDialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.egg_opener_fragment, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mEggImage = (ImageView) view.findViewById(R.id.eggImage);
        mEggImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (mPokePopDialog == null)
            mPokePopDialog = new PokePopDialog(getActivity());

        int pokeLevel = new Random().nextInt(Universal.getPlayerManager().getPlayer().getLevel()) + 1;
        int pokeId = new Random().nextInt(IPokemonNames.POKEMON_NR) + 1;
        Pokemon pokemon = IPokemonNames.getPokemonById(pokeId);
        pokemon.setLevel(pokeLevel);
        mPokePopDialog.show();
        mPokePopDialog.setPokemon(pokemon);
    }
}
