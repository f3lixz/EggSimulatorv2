package se.eggmaster.eggsimulator.UI;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import se.eggmaster.eggsimulator.Core.PokemonGenerator;
import se.eggmaster.eggsimulator.Core.Universal;
import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.R;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class PokePopDialog extends Dialog implements View.OnClickListener {

    private TextView mNameText, mLevelText, mHPText, mCPText, mHeightText, mWeightText;
    private ImageView mImage;
    private Button mOkButton, mSaveButton;

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
        //mWeightText = (TextView) findViewById(R.id.weightText);
        //mHeightText = (TextView) findViewById(R.id.heightText);
        mOkButton= (Button) findViewById(R.id.ok_button);
        mSaveButton = (Button) findViewById(R.id.save_button);
        mImage = (ImageView) findViewById(R.id.pokeImage);
        mOkButton.setOnClickListener(this);
        mSaveButton.setOnClickListener(saveButtonClickListener);
    }

    private void updateViews() {
        mNameText.setText(getString(R.string.pokepop_name, mPokemon.getName()));
        mLevelText.setText(getString(R.string.pokepop_level, mPokemon.getLevel()));
        mHPText.setText(getString(R.string.pokepop_hp, mPokemon.getHP()));
        mCPText.setText(getString(R.string.pokepop_cp, mPokemon.getCP()));
        if (mPokemon.getImageRes() != null)
            mImage.setImageDrawable(getContext().getResources().getDrawable(mPokemon.getImageRes()));
    }

    public void setPokemon(Pokemon pokemon) {
        mPokemon = PokemonGenerator.generatePokemon(pokemon);
        updateViews();
    }

    private String getString(int resId, Object... params) {
        return getContext().getString(resId, params);
    }

    private View.OnClickListener saveButtonClickListener = new View.OnClickListener() {
        final Context mContext = getContext();
        @Override
        public void onClick(View v) {
            Universal.getPlayerManager().addPokemon(mPokemon);
            Toast.makeText(mContext, "Saved " + mPokemon.getName(), Toast.LENGTH_SHORT).show();
            Log.v("felix", "my pokes: " + Universal.getPlayerManager().getPlayer().getPokemons());
            dismiss();
        }
    };

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
