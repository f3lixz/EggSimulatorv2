package se.eggmaster.eggsimulator.Core;

import android.util.Log;

import java.util.Random;

import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.Models.Pokemons.Pikachu;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public final class PokemonGenerator {

    private static double[] levelModifier =  {0.094, 0.1351374, 0.1663979, 0.1926509, 0.2157325, 0.2365727,
            0.2557201, 0.2735304, 0.2902499, 0.3060574, 0.3210876, 0.335445, 0.3492127,
            0.3624578, 0.3752356, 0.3875924, 0.3995673, 0.4111936, 0.4225, 0.4335117,
            0.4431076, 0.45306, 0.4627984, 0.4723361, 0.481685, 0.4908558, 0.4998584,
            0.5087018, 0.517394, 0.5259425, 0.5343543, 0.5426358, 0.5507927, 0.5588306,
            0.5667545, 0.5745692, 0.5822789, 0.5898879, 0.5974, 0.6048188, 0.6121573,
            0.6194041, 0.6265671, 0.6336492, 0.640653, 0.647581, 0.6544356, 0.6612193,
            0.667934, 0.6745819, 0.6811649, 0.6876849, 0.6941437, 0.7005429, 0.7068842,
            0.7131691, 0.7193991, 0.7255756, 0.7317, 0.734741, 0.7377695, 0.7407856, 0.7437894,
            0.7467812, 0.749761, 0.7527291, 0.7556855, 0.7586304, 0.7615638, 0.7644861, 0.7673972,
            0.7702973, 0.7731865, 0.776065, 0.7789328, 0.7817901, 0.784637, 0.7874736, 0.7903, 0.7931164};

    public static Pokemon generatePokemon(Pokemon basePokemon) {
        double minCP = Math.max(Math.floor(basePokemon.getBaseAttack() * Math.sqrt(basePokemon.getBaseDefence()) * Math.sqrt(basePokemon.getBaseStamina()) * Math.pow(levelModifier[basePokemon.getLevel() * 2 - 2], 2) / 10), 10);
        double maxCP = Math.max(Math.floor((basePokemon.getBaseAttack() + 15) * Math.sqrt(basePokemon.getBaseDefence()+15) * Math.sqrt(basePokemon.getBaseStamina()+15) * Math.pow(levelModifier[basePokemon.getLevel() *2 - 2], 2) / 10), 10);

        double minHP = Math.max(Math.floor(basePokemon.getBaseStamina() * levelModifier[basePokemon.getLevel() *2 -2]), 10);
        double maxHP = Math.max(Math.floor((basePokemon.getBaseStamina()+15) * levelModifier[basePokemon.getLevel() *2 -2]), 10);

        double cp = minCP + new Random().nextInt((int)maxCP - (int)minCP + 1);
        double hp = minHP + new Random().nextInt((int)maxHP - (int)minHP + 1);

        basePokemon.setCP((int)cp);
        basePokemon.setHP((int)hp);

        return basePokemon;
   }

    public static int getMaxCP(Pokemon basePokemon) {
        double maxCP = Math.max(Math.floor((basePokemon.getBaseAttack() + 15) * Math.sqrt(basePokemon.getBaseDefence()+15) * Math.sqrt(basePokemon.getBaseStamina()+15) * Math.pow(levelModifier[basePokemon.getLevel() *2 - 2], 2) / 10), 10);
        return (int) maxCP;
    }

    public static int getMinCP(Pokemon basePokemon) {
        double minCP = Math.max(Math.floor(basePokemon.getBaseAttack() * Math.sqrt(basePokemon.getBaseDefence()) * Math.sqrt(basePokemon.getBaseStamina()) * Math.pow(levelModifier[basePokemon.getLevel() * 2 - 2], 2) / 10), 10);
        return (int) minCP;
    }
}
