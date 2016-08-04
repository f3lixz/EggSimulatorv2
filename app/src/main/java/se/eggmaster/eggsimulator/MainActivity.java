package se.eggmaster.eggsimulator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import se.eggmaster.eggsimulator.Core.Universal;
import se.eggmaster.eggsimulator.Fragments.PlayerSettingsFragment;
import se.eggmaster.eggsimulator.Fragments.PokebagFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Universal.init(this);
        setContentView(R.layout.activity_main);
        setupActionbar();
        setPlayerFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custommenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.startPage:
                setPlayerFragment();
                break;
            case R.id.pokeBag:
                setPokebagFragment();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupActionbar() {
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void setPlayerFragment() {
        FragmentManager fm = getSupportFragmentManager();
        Fragment playerSettingsFrag = Fragment.instantiate(this, PlayerSettingsFragment.class.getName());
        fm.beginTransaction().add(R.id.content_frame, playerSettingsFrag, playerSettingsFrag.getClass().getName()).commit();
    }

    private void setPokebagFragment() {
        FragmentManager fm = getSupportFragmentManager();
        Fragment pokebagFrag = Fragment.instantiate(this, PokebagFragment.class.getName());
        fm.beginTransaction().add(R.id.content_frame, pokebagFrag, pokebagFrag.getClass().getName()).commit();
    }

    public void replaceFragment(Fragment newFragment) {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame, newFragment, newFragment.getClass().getName()).addToBackStack(null).commit();
    }
}
