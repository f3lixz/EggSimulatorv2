package se.eggmaster.eggsimulator.UI;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import se.eggmaster.eggsimulator.Core.Universal;
import se.eggmaster.eggsimulator.R;

/**
 * Created by FelixTheMaster on 2016-08-04.
 */
public class EggView extends RelativeLayout {

    public interface IEggClick {
        void clicked(int id);
    }

    private View mDisabledView;

    private int mEggId = -1;

    public EggView(Context context) {
        super(context);
    }

    public EggView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EggView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mDisabledView = getMaskView();
        addView(mDisabledView);
    }

    private View getMaskView() {
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        view.setBackgroundColor(getResources().getColor(R.color.transparantBlack));
        view.setVisibility(GONE);
        return view;
    }

    public void disable() {
        mDisabledView.setVisibility(VISIBLE);
    }

    public void enable() {
        mDisabledView.setVisibility(GONE);
    }

    public int getEggId() {
        return mEggId;
    }

    public void refresh() {
        setBackground(null);
        setSelected(false);
    }

    public OnClickListener getOnClickListener(final int eggId, final IEggClick eggClickListener) {
        return new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
    }
}
