package se.eggmaster.eggsimulator.UI;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import se.eggmaster.eggsimulator.R;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class LevelChooserWidget extends LinearLayout implements SeekBar.OnSeekBarChangeListener {

    private TextView mLevelText;
    private SeekBar mLevelSlider;

    private int mChosenLevel = 0;

    public LevelChooserWidget(Context context) {
        super(context);
    }

    public LevelChooserWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LevelChooserWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mLevelText = (TextView) findViewById(R.id.levelText);
        mLevelSlider = (SeekBar) findViewById(R.id.levelSlider);
        mLevelText.setText("1");
        mLevelSlider.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        mLevelText.setText(String.valueOf(progress + 1));
        mChosenLevel = progress + 1;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    public int getChosenLevel() {
        return mChosenLevel;
    }
}
