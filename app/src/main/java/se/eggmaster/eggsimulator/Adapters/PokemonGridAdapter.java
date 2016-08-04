package se.eggmaster.eggsimulator.Adapters;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.R;
import se.eggmaster.eggsimulator.UI.PokePopDialog;

/**
 * Created by FelixTheMaster on 2016-08-02.
 */
public class PokemonGridAdapter extends BaseAdapter {

    private ArrayList<Pokemon> mPokemons;
    private Context mContext;
    private View.OnClickListener mOnClickListener;
    private boolean mCustomOnClick = false;

    public PokemonGridAdapter(Context context, ArrayList<Pokemon> pokemons) {
        mPokemons = pokemons;
        mContext = context;
    }

    public PokemonGridAdapter(Context context, ArrayList<Pokemon> pokemons, View.OnClickListener customOnClick) {
        mPokemons = pokemons;
        mContext = context;
        mOnClickListener = customOnClick;
        mCustomOnClick = true;
    }

    @Override
    public int getCount() {
        return mPokemons.size();
    }

    @Override
    public Pokemon getItem(int position) {
        return mPokemons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridItem = convertView;
        if (gridItem == null) {
            gridItem = inflater.inflate(R.layout.pokemon_grid_item, null);
        }
        Pokemon pokemon = getItem(position);
        ImageView imageView = (ImageView) gridItem.findViewById(R.id.pokepic);
        imageView.setImageResource(pokemon.getImageRes());
        TextView textView = (TextView) gridItem.findViewById(R.id.pokeCP);
        textView.setText(String.valueOf(pokemon.getCP()));
        LinearLayout mCpTextContainer = (LinearLayout) gridItem.findViewById(R.id.pokepicText);
        if (pokemon.getCP() == 0)
            mCpTextContainer.setVisibility(View.GONE);
        else
            mCpTextContainer.setVisibility(View.VISIBLE);
        if (!mCustomOnClick) {
            gridItem.setOnClickListener(gridOnClickListener(pokemon));
        } else {
            gridItem.setOnClickListener(mOnClickListener);
        }
        return gridItem;
    }


    private View.OnClickListener gridOnClickListener(final Pokemon pokemon) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PokePopDialog pokeDialog = new PokePopDialog(mContext);
                pokeDialog.show();
                pokeDialog.disableSaveButton();
                pokeDialog.setPokemon(pokemon);
            }
        };
    }

}
