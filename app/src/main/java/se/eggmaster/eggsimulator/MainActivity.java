package se.eggmaster.eggsimulator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import se.eggmaster.eggsimulator.Core.PokemonGenerator;
import se.eggmaster.eggsimulator.Core.Universal;
import se.eggmaster.eggsimulator.Fragments.PlayerSettingsFragment;
import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.Models.Pokemons.Bulbasaur;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Universal.init(this);
        setContentView(R.layout.activity_main);
        setPlayerFragment();
    }

    private void setPlayerFragment() {
        FragmentManager fm = getSupportFragmentManager();
        Fragment playerSettingsFrag = Fragment.instantiate(this, PlayerSettingsFragment.class.getName());
        fm.beginTransaction().add(R.id.content_frame, playerSettingsFrag, playerSettingsFrag.getClass().getName()).commit();
    }

    public void replaceFragment(Fragment newFragment) {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame, newFragment, newFragment.getClass().getName()).addToBackStack(null).commit();
    }
}
