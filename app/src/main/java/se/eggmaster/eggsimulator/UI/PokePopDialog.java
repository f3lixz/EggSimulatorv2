package se.eggmaster.eggsimulator.UI;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import se.eggmaster.eggsimulator.R;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class PokePopDialog extends Dialog implements View.OnClickListener {

    private TextView mHPText, mCPText, mHeightText, mWeightText;
    private Button mOkButton;

    public PokePopDialog(Context context) {
        super(context);
    }

    public PokePopDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.pokemon_dialog);
        mHPText = (TextView) findViewById(R.id.hpText);
        mCPText = (TextView) findViewById(R.id.cpText);
        mWeightText = (TextView) findViewById(R.id.weightText);
        mHeightText = (TextView) findViewById(R.id.heightText);
        mOkButton= (Button) findViewById(R.id.ok_button);
    }

    public void setPokemon() {

    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
