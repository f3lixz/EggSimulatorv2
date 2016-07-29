package se.eggmaster.eggsimulator.UI;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import se.eggmaster.eggsimulator.Core.PokemonGenerator;
import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.R;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class PokePopDialog extends Dialog implements View.OnClickListener {

    private TextView mNameText, mLevelText, mHPText, mCPText, mHeightText, mWeightText;
    private Button mOkButton;

    private Pokemon mPokemon;

    public PokePopDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.pokemon_dialog);
        mNameText = (TextView) findViewById(R.id.nameText);
        mLevelText = (TextView) findViewById(R.id.lvlText);
        mHPText = (TextView) findViewById(R.id.hpText);
        mCPText = (TextView) findViewById(R.id.cpText);
        mWeightText = (TextView) findViewById(R.id.weightText);
        mHeightText = (TextView) findViewById(R.id.heightText);
        mOkButton= (Button) findViewById(R.id.ok_button);
        mOkButton.setOnClickListener(this);
    }

    private void updateViews() {
        mNameText.setText(getString(R.string.pokepop_name, mPokemon.getName()));
        mLevelText.setText(getString(R.string.pokepop_level, mPokemon.getLevel()));
        mHPText.setText(getString(R.string.pokepop_hp, mPokemon.getHP()));
        mCPText.setText(getString(R.string.pokepop_cp, mPokemon.getCP()));
    }

    public void setPokemon(Pokemon pokemon) {
        mPokemon = PokemonGenerator.generatePokemon(pokemon);
        Log.v("felix", "pokemon: " + mPokemon);

        updateViews();
    }

    private String getString(int resId, Object... params) {
        return getContext().getString(resId, params);
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
