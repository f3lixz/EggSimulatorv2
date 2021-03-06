package se.eggmaster.eggsimulator.Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import se.eggmaster.eggsimulator.Managers.PlayerManager;
import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.Models.Pokemons.*;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public final class Pokedex {

    public static int POKEMON_NR = 151;

    public final static int EGG_2KM   = 1;
    public final static int EGG_5KM   = 2;
    public final static int EGG_10KM  = 3;

    private static ArrayList<IPokedexEvents> mSubscribers = new ArrayList<>();


    public static String BULBASAUR = "Bulbasaur";
    public static String IVYSAUR = "Ivysaur";
    public static String VENUSAUR = "Venusaur";
    public static String CHARMANDER = "Charmander";
    public static String CHARMELEON = "Charmeleon";
    public static String CHARIZARD = "Charizard";
    public static String SQUIRTLE = "Squirtle";
    public static String WARTORTLE = "Wartortle";
    public static String BLASTOISE = "Blastoise";
    public static String CATERPIE = "Caterpie";
    public static String METAPOD = "Metapod";
    public static String BUTTERFREE = "Butterfree";
    public static String WEEDLE = "Weedle";
    public static String KAKUNA = "Kakuna";
    public static String BEEDRILL = "Beedrill";
    public static String PIDGEY = "Pidgey";
    public static String PIDGEOTTO = "Pidgeotto";
    public static String PIDGEOT = "Pidgeot";
    public static String RATTATA = "Rattata";
    public static String RATICATE = "Raticate";
    public static String SPEAROW = "Spearow";
    public static String FEAROW = "Fearow";
    public static String EKANS = "Ekans";
    public static String ARBOK = "Arbok";
    public static String PIKACHU = "Pikachu";
    public static String RAICHU = "Raichu";
    public static String SANDSHREW = "Sandshrew";
    public static String SANDSLASH = "Sandslash";
    public static String NIDORANF = "Nidoran♀";
    public static String NIDORINA = "Nidorina";
    public static String NIDOQUEEN = "Nidoqueen";
    public static String NIDORANM = "Nidoran♂";
    public static String NIDORINO = "Nidorino";
    public static String NIDOKING = "Nidoking";
    public static String CLEFAIRY = "Clefairy";
    public static String CLEFABLE = "Clefable";
    public static String VULPIX = "Vulpix";
    public static String NINETALES = "Ninetales";
    public static String JIGGLYPUFF = "Jigglypuff";
    public static String WIGGLYTUFF = "Wigglytuff";
    public static String ZUBAT = "Zubat";
    public static String GOLBAT = "Golbat";
    public static String ODDISH = "Oddish";
    public static String GLOOM = "Gloom";
    public static String VILEPLUME = "Vileplume";
    public static String PARAS = "Paras";
    public static String PARASECT = "Parasect";
    public static String VENONAT = "Venonat";
    public static String VENOMOTH = "Venomoth";
    public static String DIGLETT = "Diglett";
    public static String DUGTRIO = "Dugtrio";
    public static String MEOWTH = "Meowth";
    public static String PERSIAN = "Persian";
    public static String PSYDUCK = "Psyduck";
    public static String GOLDUCK = "Golduck";
    public static String MANKEY = "Mankey";
    public static String PRIMEAPE = "Primeape";
    public static String GROWLITHE = "Growlithe";
    public static String ARCANINE = "Arcanine";
    public static String POLIWAG = "Poliwag";
    public static String POLIWHIRL = "Poliwhirl";
    public static String POLIWRATH = "Poliwrath";
    public static String ABRA = "Abra";
    public static String KADABRA = "Kadabra";
    public static String ALAKAZAM = "Alakazam";
    public static String MACHOP = "Machop";
    public static String MACHOKE = "Machoke";
    public static String MACHAMP = "Machamp";
    public static String BELLSPROUT = "Bellsprout";
    public static String WEEPINBELL = "Weepinbell";
    public static String VICTREEBEL = "Victreebel";
    public static String TENTACOOL = "Tentacool";
    public static String TENTACRUEL = "Tentacruel";
    public static String GEODUDE = "Geodude";
    public static String GRAVELER = "Graveler";
    public static String GOLEM = "Golem";
    public static String PONYTA = "Ponyta";
    public static String RAPIDASH = "Rapidash";
    public static String SLOWPOKE = "Slowpoke";
    public static String SLOWBRO = "Slowbro";
    public static String MAGNEMITE = "Magnemite";
    public static String MAGNETON = "Magneton";
    public static String FARFETCHD = "Farfetchd";
    public static String DODUO = "Doduo";
    public static String DODRIO = "Dodrio";
    public static String SEEL = "Seel";
    public static String DEWGONG = "Dewgong";
    public static String GRIMER = "Grimer";
    public static String MUK = "Muk";
    public static String SHELLDER = "Shellder";
    public static String CLOYSTER = "Cloyster";
    public static String GASTLY = "Gastly";
    public static String HAUNTER = "Haunter";
    public static String GENGAR = "Gengar";
    public static String ONIX = "Onix";
    public static String DROWZEE = "Drowzee";
    public static String HYPNO = "Hypno";
    public static String KRABBY = "Krabby";
    public static String KINGLER = "Kingler";
    public static String VOLTORB = "Voltorb";
    public static String ELECTRODE = "Electrode";
    public static String EXEGGCUTE = "Exeggcute";
    public static String EXEGGUTOR = "Exeggutor";
    public static String CUBONE = "Cubone";
    public static String MAROWAK = "Marowak";
    public static String HITMONLEE = "Hitmonlee";
    public static String HITMONCHAN = "Hitmonchan";
    public static String LICKITUNG = "Lickitung";
    public static String KOFFING = "Koffing";
    public static String WEEZING = "Weezing";
    public static String RHYHORN = "Rhyhorn";
    public static String RHYDON = "Rhydon";
    public static String CHANSEY = "Chansey";
    public static String TANGELA = "Tangela";
    public static String KANGASKHAN = "Kangaskhan";
    public static String HORSEA = "Horsea";
    public static String SEADRA = "Seadra";
    public static String GOLDEEN = "Goldeen";
    public static String SEAKING = "Seaking";
    public static String STARYU = "Staryu";
    public static String STARMIE = "Starmie";
    public static String MRMIME = "Mr. Mime";
    public static String SCYTHER = "Scyther";
    public static String JYNX = "Jynx";
    public static String ELECTABUZZ = "Electabuzz";
    public static String MAGMAR = "Magmar";
    public static String PINSIR = "Pinsir";
    public static String TAUROS = "Tauros";
    public static String MAGIKARP = "Magikarp";
    public static String GYARADOS = "Gyarados";
    public static String LAPRAS = "Lapras";
    public static String DITTO = "Ditto";
    public static String EEVEE = "Eevee";
    public static String VAPOREON = "Vaporeon";
    public static String JOLTEON = "Jolteon";
    public static String FLAREON = "Flareon";
    public static String PORYGON = "Porygon";
    public static String OMANYTE = "Omanyte";
    public static String OMASTAR = "Omastar";
    public static String KABUTO = "Kabuto";
    public static String KABUTOPS = "Kabutops";
    public static String AERODACTYL = "Aerodactyl";
    public static String SNORLAX = "Snorlax";
    public static String ARTICUNO = "Articuno";
    public static String ZAPDOS = "Zapdos";
    public static String MOLTRES = "Moltres";
    public static String DRATINI = "Dratini";
    public static String DRAGONAIR = "Dragonair";
    public static String DRAGONITE = "Dragonite";
    public static String MEWTWO = "Mewtwo";
    public static String MEW = "Mew";

    static ArrayList<Pokemon> mPokemonById = new ArrayList<>();
    static {
        mPokemonById.add(0, new Pokemon("missingno", 0, 0, 0, 0));
        mPokemonById.add(1, new Bulbasaur());
        mPokemonById.add(2, new Ivysaur());
        mPokemonById.add(3, new Venusaur());
        mPokemonById.add(4, new Charmander());
        mPokemonById.add(5, new Charmeleon());
        mPokemonById.add(6, new Charizard());
        mPokemonById.add(7, new Squirtle());
        mPokemonById.add(8, new Wartortle());
        mPokemonById.add(9, new Blastoise());
        mPokemonById.add(10, new Caterpie());
        mPokemonById.add(11, new Metapod());
        mPokemonById.add(12, new Butterfree());
        mPokemonById.add(13, new Weedle());
        mPokemonById.add(14, new Kakuna());
        mPokemonById.add(15, new Beedrill());
        mPokemonById.add(16, new Pidgey());
        mPokemonById.add(17, new Pidgeotto());
        mPokemonById.add(18, new Pidgeot());
        mPokemonById.add(19, new Rattata());
        mPokemonById.add(20, new Raticate());
        mPokemonById.add(21, new Spearow());
        mPokemonById.add(22, new Fearow());
        mPokemonById.add(23, new Ekans());
        mPokemonById.add(24, new Arbok());
        mPokemonById.add(25, new Pikachu());
        mPokemonById.add(26, new Raichu());
        mPokemonById.add(27, new Sandshrew());
        mPokemonById.add(28, new Sandslash());
        mPokemonById.add(29, new Nidoranf());
        mPokemonById.add(30, new Nidorina());
        mPokemonById.add(31, new Nidoqueen());
        mPokemonById.add(32, new Nidoranm());
        mPokemonById.add(33, new Nidorino());
        mPokemonById.add(34, new Nidoking());
        mPokemonById.add(35, new Clefairy());
        mPokemonById.add(36, new Clefable());
        mPokemonById.add(37, new Vulpix());
        mPokemonById.add(38, new Ninetales());
        mPokemonById.add(39, new Jigglypuff());
        mPokemonById.add(40, new Wigglytuff());
        mPokemonById.add(41, new Zubat());
        mPokemonById.add(42, new Golbat());
        mPokemonById.add(43, new Oddish());
        mPokemonById.add(44, new Gloom());
        mPokemonById.add(45, new Vileplume());
        mPokemonById.add(46, new Paras());
        mPokemonById.add(47, new Parasect());
        mPokemonById.add(48, new Venonat());
        mPokemonById.add(49, new Venomoth());
        mPokemonById.add(50, new Diglett());
        mPokemonById.add(51, new Dugtrio());
        mPokemonById.add(52, new Meowth());
        mPokemonById.add(53, new Persian());
        mPokemonById.add(54, new Psyduck());
        mPokemonById.add(55, new Golduck());
        mPokemonById.add(56, new Mankey());
        mPokemonById.add(57, new Primeape());
        mPokemonById.add(58, new Growlithe());
        mPokemonById.add(59, new Arcanine());
        mPokemonById.add(60, new Poliwag());
        mPokemonById.add(61, new Poliwhirl());
        mPokemonById.add(62, new Poliwrath());
        mPokemonById.add(63, new Abra());
        mPokemonById.add(64, new Kadabra());
        mPokemonById.add(65, new Alakazam());
        mPokemonById.add(66, new Machop());
        mPokemonById.add(67, new Machoke());
        mPokemonById.add(68, new Machamp());
        mPokemonById.add(69, new Bellsprout());
        mPokemonById.add(70, new Weepinbell());
        mPokemonById.add(71, new Victreebel());
        mPokemonById.add(72, new Tentacool());
        mPokemonById.add(73, new Tentacruel());
        mPokemonById.add(74, new Geodude());
        mPokemonById.add(75, new Graveler());
        mPokemonById.add(76, new Golem());
        mPokemonById.add(77, new Ponyta());
        mPokemonById.add(78, new Rapidash());
        mPokemonById.add(79, new Slowpoke());
        mPokemonById.add(80, new Slowbro());
        mPokemonById.add(81, new Magnemite());
        mPokemonById.add(82, new Magneton());
        mPokemonById.add(83, new Farfetchd());
        mPokemonById.add(84, new Doduo());
        mPokemonById.add(85, new Dodrio());
        mPokemonById.add(86, new Seel());
        mPokemonById.add(87, new Dewgong());
        mPokemonById.add(88, new Grimer());
        mPokemonById.add(89, new Muk());
        mPokemonById.add(90, new Shellder());
        mPokemonById.add(91, new Cloyster());
        mPokemonById.add(92, new Gastly());
        mPokemonById.add(93, new Haunter());
        mPokemonById.add(94, new Gengar());
        mPokemonById.add(95, new Onix());
        mPokemonById.add(96, new Drowzee());
        mPokemonById.add(97, new Hypno());
        mPokemonById.add(98, new Krabby());
        mPokemonById.add(99, new Kingler());
        mPokemonById.add(100, new Voltorb());
        mPokemonById.add(101, new Electrode());
        mPokemonById.add(102, new Exeggcute());
        mPokemonById.add(103, new Exeggutor());
        mPokemonById.add(104, new Cubone());
        mPokemonById.add(105, new Marowak());
        mPokemonById.add(106, new Hitmonlee());
        mPokemonById.add(107, new Hitmonchan());
        mPokemonById.add(108, new Lickitung());
        mPokemonById.add(109, new Koffing());
        mPokemonById.add(110, new Weezing());
        mPokemonById.add(111, new Rhyhorn());
        mPokemonById.add(112, new Rhydon());
        mPokemonById.add(113, new Chansey());
        mPokemonById.add(114, new Tangela());
        mPokemonById.add(115, new Kangaskhan());
        mPokemonById.add(116, new Horsea());
        mPokemonById.add(117, new Seadra());
        mPokemonById.add(118, new Goldeen());
        mPokemonById.add(119, new Seaking());
        mPokemonById.add(120, new Staryu());
        mPokemonById.add(121, new Starmie());
        mPokemonById.add(122, new MrMime());
        mPokemonById.add(123, new Scyther());
        mPokemonById.add(124, new Jynx());
        mPokemonById.add(125, new Electabuzz());
        mPokemonById.add(126, new Magmar());
        mPokemonById.add(127, new Pinsir());
        mPokemonById.add(128, new Tauros());
        mPokemonById.add(129, new Magikarp());
        mPokemonById.add(130, new Gyarados());
        mPokemonById.add(131, new Lapras());
        mPokemonById.add(132, new Ditto());
        mPokemonById.add(133, new Eevee());
        mPokemonById.add(134, new Vaporeon());
        mPokemonById.add(135, new Jolteon());
        mPokemonById.add(136, new Flareon());
        mPokemonById.add(137, new Porygon());
        mPokemonById.add(138, new Omanyte());
        mPokemonById.add(139, new Omastar());
        mPokemonById.add(140, new Kabuto());
        mPokemonById.add(141, new Kabutops());
        mPokemonById.add(142, new Aerodactyl());
        mPokemonById.add(143, new Snorlax());
        mPokemonById.add(144, new Articuno());
        mPokemonById.add(145, new Zapdos());
        mPokemonById.add(146, new Moltres());
        mPokemonById.add(147, new Dratini());
        mPokemonById.add(148, new Dragonair());
        mPokemonById.add(149, new Dragonite());
        mPokemonById.add(150, new Mewtwo());
        mPokemonById.add(151, new Mew());
    }

    static Integer[] mTwoKMEgg = {1, 4, 7, 10, 13, 16, 19, 21, 25, 35, 39, 41, 74, 129};
    static Integer[] mFiveKMEgg = {23, 27, 37, 43, 46, 48, 50, 52, 54, 56, 58, 60, 63, 66, 69, 72, 77, 79, 81, 84, 86, 88, 90, 92, 96, 98, 100, 102, 104, 108,
    109, 111, 114, 115, 116, 118, 120, 128, 137};
    static Integer[] mTenKMEgg = {95, 106, 107, 113, 122, 123, 124, 125, 126, 127, 131, 133, 138, 140, 142, 143, 147};


    public static Pokemon getRandomPokemon(int egg, int playerLevel) {
        Integer[] pokeSection;
        switch (egg) {
            case EGG_2KM:
                pokeSection = mTwoKMEgg;
                break;
            case EGG_5KM:
                pokeSection = mFiveKMEgg;
                break;
            case EGG_10KM:
                pokeSection = mTenKMEgg;
                break;
            default:
                pokeSection = mTwoKMEgg;
                break;

        }

        int pokeLevel = new Random().nextInt(playerLevel) + 1;
        int eggIndex = new Random().nextInt(pokeSection.length);
        int pokeId = pokeSection[eggIndex];
        Pokemon pokemon = Pokedex.getPokemonById(pokeId);
        pokemon.setLevel(pokeLevel);
        return pokemon;
    }

    public static List<Integer> getEggsPokemonIds(int egg) {
        switch (egg) {
            case EGG_2KM:
                return Arrays.asList(mTwoKMEgg);
            case EGG_5KM:
                return Arrays.asList(mFiveKMEgg);
            case EGG_10KM:
                return Arrays.asList(mTenKMEgg);
            default:
                return Arrays.asList(mTwoKMEgg);
        }
    }

    public static Pokemon getPokemonById(int id) {
        Pokemon pokemonTemplate = mPokemonById.get(id);
        Pokemon pokemonClose = new Pokemon(pokemonTemplate.getName(), pokemonTemplate.getBaseAttack(), pokemonTemplate.getBaseDefence(), pokemonTemplate.getBaseStamina(), pokemonTemplate.getImageRes());
        return pokemonClose;
    }

    public static boolean isNew(Pokemon pokemon) {
        int pokeIndex = getPokedexIndex(pokemon);
        return !Universal.getPokemonManager().getPokemonIds().contains(pokeIndex);
    }

    public static int getPokedexIndex(Pokemon pokemon) {
        return mPokemonById.indexOf(pokemon);
    }


    public static ArrayList<Pokemon> getPokemonsFromIds(ArrayList<Integer> ids) {
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        for (int id : ids) {
            pokemons.add(getPokemonById(id));
        }
        return pokemons;
    }

    public static void updateMyPokedex() {
        if (Universal.getPlayerManager().getPlayer().getProgress() == PlayerManager.PROGRESS_1_EGG) {
            if (Universal.getPokemonManager().getPokemonIds().equals(Arrays.asList(mTwoKMEgg))) {
                Universal.getPlayerManager().updateEggProgress();
                callSubscribers(Universal.getPlayerManager().getPlayer().getProgress());
            }
        } else if (Universal.getPlayerManager().getPlayer().getProgress() == PlayerManager.PROGRESS_2_EGG) {
            if (Universal.getPokemonManager().getPokemonIds().equals(Arrays.asList(mFiveKMEgg))) {
                Universal.getPlayerManager().updateEggProgress();
                callSubscribers(Universal.getPlayerManager().getPlayer().getProgress());
            }
        } else if (Universal.getPlayerManager().getPlayer().getProgress() == PlayerManager.PROGRESS_3_EGG) {

        }
    }

    public static void callSubscribers(int progress) {
        for (IPokedexEvents subscriber : mSubscribers) {
            subscriber.finishedEggRequirement(progress);
        }
    }

    public static void subscribe(IPokedexEvents caller) {
        mSubscribers.add(caller);
    }

    public static void unSubscribe(IPokedexEvents caller) {
        if (mSubscribers.contains(caller))
            mSubscribers.remove(caller);
    }

}
