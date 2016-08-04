package se.eggmaster.eggsimulator.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import se.eggmaster.eggsimulator.Adapters.PokemonGridAdapter;
import se.eggmaster.eggsimulator.Core.Universal;
import se.eggmaster.eggsimulator.R;

/**
 * Created by FelixTheMaster on 2016-08-04.
 */
public class PokebagFragment extends Fragment {


    private GridView mPokeGrid;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.pokebag_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPokeGrid = (GridView) view.findViewById(R.id.pokemon_grid);
        mPokeGrid.setAdapter(new PokemonGridAdapter(getContext(), Universal.getPokemonManager().getPokemons()));
    }
}
