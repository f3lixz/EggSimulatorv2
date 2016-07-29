package se.eggmaster.eggsimulator.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;

import se.eggmaster.eggsimulator.R;
import se.eggmaster.eggsimulator.UI.PokePopDialog;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class EggOpenerFragment extends Fragment implements View.OnClickListener {

    private ImageView mEggImage;
    private PokePopDialog mPokePopDialog;

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mEggImage = (ImageView) view.findViewById(R.id.eggImage);
        mEggImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (mPokePopDialog == null)
            mPokePopDialog = new PokePopDialog(getActivity());
        if (!mPokePopDialog.isShowing())
            mPokePopDialog.show();
    }
}
