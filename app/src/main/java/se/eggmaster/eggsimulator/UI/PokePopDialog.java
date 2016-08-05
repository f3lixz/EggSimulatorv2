package se.eggmaster.eggsimulator.UI;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.triggertrap.seekarc.SeekArc;

import org.w3c.dom.Text;

import se.eggmaster.eggsimulator.Core.Pokedex;
import se.eggmaster.eggsimulator.Core.PokemonGenerator;
import se.eggmaster.eggsimulator.Core.Universal;
import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.R;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class PokePopDialog extends Dialog implements View.OnClickListener {

    private TextView mNameText, mLevelText, mHPText, mCPText, mIVCPText, mIVHPText, mNewText, mHeightText, mWeightText;
    private ImageView mImage;
    private Button mOkButton, mSaveButton;
    private ProgressBar mIVCPProgress, mIVHPProgress;

    private SeekArc mSeekArc;

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
        mIVCPText = (TextView) findViewById(R.id.ivCPText);
        mIVHPText = (TextView) findViewById(R.id.ivHPText);
        mNewText= (TextView) findViewById(R.id.newText);
        //mWeightText = (TextView) findViewById(R.id.weightText);
        //mHeightText = (TextView) findViewById(R.id.heightText);
        mOkButton= (Button) findViewById(R.id.ok_button);
        mSaveButton = (Button) findViewById(R.id.save_button);
        mImage = (ImageView) findViewById(R.id.pokeImage);
        mIVCPProgress = (ProgressBar) findViewById(R.id.iv_progress_cp);
        mIVHPProgress = (ProgressBar) findViewById(R.id.iv_progress_hp);
        mSeekArc= (SeekArc) findViewById(R.id.seekArc);
        mOkButton.setOnClickListener(this);
        mIVCPProgress.setProgressDrawable(getContext().getResources().getDrawable(R.drawable.progresscolor));
        mIVHPProgress.setProgressDrawable(getContext().getResources().getDrawable(R.drawable.progresscolor));
        mSaveButton.setOnClickListener(saveButtonClickListener);
    }

    private void updateSeekArc() {
        mSeekArc.setProgress((int) PokemonGenerator.getCPPercentage(mPokemon));
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPokemon = null;
    }

    private void updateViews() {
        int cpiv = Math.round(PokemonGenerator.getCPPercentage(mPokemon));
        int hpiv = Math.round(PokemonGenerator.getHPPercentage(mPokemon));

        mNameText.setText(getString(R.string.pokepop_name, mPokemon.getName()));
        mLevelText.setText(getString(R.string.pokepop_level, mPokemon.getLevel()));
        mHPText.setText(getString(R.string.pokepop_hp, mPokemon.getHP()));
        mCPText.setText(getString(R.string.pokepop_cp, mPokemon.getCP()));
        mIVCPText.setText(getString(R.string.pokepop_iv_cp, cpiv) + "%");
        mIVHPText.setText(getString(R.string.pokepop_iv_hp, hpiv) + "%");
        mIVCPProgress.setProgress(cpiv);
        mIVHPProgress.setProgress(hpiv);
        if (Pokedex.isNew(mPokemon))
            mNewText.setVisibility(View.VISIBLE);
        else
            mNewText.setVisibility(View.GONE);

        if (mPokemon.getImageRes() != null)
            mImage.setImageResource(mPokemon.getImageRes());
        updateSeekArc();
    }

    public void setPokemon(Pokemon pokemon) {
        if (pokemon.getCP() != 0)
            mPokemon = pokemon;
        else
            mPokemon = PokemonGenerator.generatePokemon(pokemon);
        updateViews();
    }

    public void disableSaveButton() {
        mSaveButton.setVisibility(View.GONE);
    }

    private String getString(int resId, Object... params) {
        return getContext().getString(resId, params);
    }

    private View.OnClickListener saveButtonClickListener = new View.OnClickListener() {
        final Context mContext = getContext();
        @Override
        public void onClick(View v) {
            Log.v("felix", "a: " + mPokemon);
            Universal.getPokemonManager().addPokemon(mPokemon);
            Toast.makeText(mContext, "Saved " + mPokemon.getName(), Toast.LENGTH_SHORT).show();
            dismiss();
        }
    };

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
