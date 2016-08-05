package se.eggmaster.eggsimulator.UI;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.GridView;

import java.util.ArrayList;

import se.eggmaster.eggsimulator.Adapters.PokemonGridAdapter;
import se.eggmaster.eggsimulator.Core.Pokedex;
import se.eggmaster.eggsimulator.Core.Universal;
import se.eggmaster.eggsimulator.Managers.PokemonManager;
import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.R;

/**
 * Created by FelixTheMaster on 2016-08-05.
 */
public class InfoDialog extends Dialog {

    private GridView mPokeGrid;
    private int mEgg = Pokedex.EGG_2KM;

    public InfoDialog(Context context, int eggId) {
        super(context);
        setCanceledOnTouchOutside(true);
        mEgg = eggId;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.info_scroll_dialog);
        mPokeGrid = (GridView) findViewById(R.id.pokemon_grid);
        mPokeGrid.setAdapter(new PokemonGridAdapter(getContext(), getMissingPokemon(), null));
    }

    private ArrayList<Pokemon> getMissingPokemon() {
        int previousEggPokemons = mEgg - 1;
        ArrayList<Integer> eggPokes = new ArrayList<>(Pokedex.getEggsPokemonIds(previousEggPokemons));
        ArrayList<Integer> myPokes = Universal.getPokemonManager().getPokemonIds();
        ArrayList<Integer> redundantPokes = new ArrayList<>(myPokes);
        redundantPokes.removeAll(eggPokes);
        myPokes.removeAll(redundantPokes);
        eggPokes.removeAll(myPokes);
        return Pokedex.getPokemonsFromIds(eggPokes);
    }
}
