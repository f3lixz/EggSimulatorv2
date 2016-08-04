package se.eggmaster.eggsimulator.Models.Pokemons;

import se.eggmaster.eggsimulator.Core.IPokemonNames;
import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.R;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public class Ditto extends Pokemon {

    public Ditto() {
        super(IPokemonNames.DITTO, 110, 110, 96, R.drawable.ditto);
    }
}
