package se.eggmaster.eggsimulator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import se.eggmaster.eggsimulator.Core.Universal;
import se.eggmaster.eggsimulator.Fragments.PlayerSettingsFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Universal.init(this);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        Fragment playerSettingsFrag = Fragment.instantiate(this, PlayerSettingsFragment.class.getName());
        fm.beginTransaction().add(R.id.content_frame, playerSettingsFrag, playerSettingsFrag.getClass().getName()).commit();
    }
}
