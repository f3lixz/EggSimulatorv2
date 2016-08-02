package se.eggmaster.eggsimulator.Core;

import java.util.ArrayList;

import se.eggmaster.eggsimulator.Models.Pokemon;
import se.eggmaster.eggsimulator.Models.Pokemons.Abra;
import se.eggmaster.eggsimulator.Models.Pokemons.Alakazam;
import se.eggmaster.eggsimulator.Models.Pokemons.Arbok;
import se.eggmaster.eggsimulator.Models.Pokemons.Arcanine;
import se.eggmaster.eggsimulator.Models.Pokemons.Beedrill;
import se.eggmaster.eggsimulator.Models.Pokemons.Bellsprout;
import se.eggmaster.eggsimulator.Models.Pokemons.Blastoise;
import se.eggmaster.eggsimulator.Models.Pokemons.Bulbasaur;
import se.eggmaster.eggsimulator.Models.Pokemons.Butterfree;
import se.eggmaster.eggsimulator.Models.Pokemons.Caterpie;
import se.eggmaster.eggsimulator.Models.Pokemons.Charizard;
import se.eggmaster.eggsimulator.Models.Pokemons.Charmander;
import se.eggmaster.eggsimulator.Models.Pokemons.Charmeleon;
import se.eggmaster.eggsimulator.Models.Pokemons.Clefable;
import se.eggmaster.eggsimulator.Models.Pokemons.Clefairy;
import se.eggmaster.eggsimulator.Models.Pokemons.Diglett;
import se.eggmaster.eggsimulator.Models.Pokemons.Dragonite;
import se.eggmaster.eggsimulator.Models.Pokemons.Dugtrio;
import se.eggmaster.eggsimulator.Models.Pokemons.Ekans;
import se.eggmaster.eggsimulator.Models.Pokemons.Fearow;
import se.eggmaster.eggsimulator.Models.Pokemons.Gloom;
import se.eggmaster.eggsimulator.Models.Pokemons.Golbat;
import se.eggmaster.eggsimulator.Models.Pokemons.Golduck;
import se.eggmaster.eggsimulator.Models.Pokemons.Growlithe;
import se.eggmaster.eggsimulator.Models.Pokemons.Ivysaur;
import se.eggmaster.eggsimulator.Models.Pokemons.Jigglypuff;
import se.eggmaster.eggsimulator.Models.Pokemons.Kadabra;
import se.eggmaster.eggsimulator.Models.Pokemons.Kakuna;
import se.eggmaster.eggsimulator.Models.Pokemons.Machamp;
import se.eggmaster.eggsimulator.Models.Pokemons.Machoke;
import se.eggmaster.eggsimulator.Models.Pokemons.Machop;
import se.eggmaster.eggsimulator.Models.Pokemons.Mankey;
import se.eggmaster.eggsimulator.Models.Pokemons.Meowth;
import se.eggmaster.eggsimulator.Models.Pokemons.Metapod;
import se.eggmaster.eggsimulator.Models.Pokemons.Mewtwo;
import se.eggmaster.eggsimulator.Models.Pokemons.Moltres;
import se.eggmaster.eggsimulator.Models.Pokemons.Nidoking;
import se.eggmaster.eggsimulator.Models.Pokemons.Nidoqueen;
import se.eggmaster.eggsimulator.Models.Pokemons.Nidoranf;
import se.eggmaster.eggsimulator.Models.Pokemons.Nidoranm;
import se.eggmaster.eggsimulator.Models.Pokemons.Nidorina;
import se.eggmaster.eggsimulator.Models.Pokemons.Nidorino;
import se.eggmaster.eggsimulator.Models.Pokemons.Ninetales;
import se.eggmaster.eggsimulator.Models.Pokemons.Oddish;
import se.eggmaster.eggsimulator.Models.Pokemons.Paras;
import se.eggmaster.eggsimulator.Models.Pokemons.Parasect;
import se.eggmaster.eggsimulator.Models.Pokemons.Persian;
import se.eggmaster.eggsimulator.Models.Pokemons.Pidgeot;
import se.eggmaster.eggsimulator.Models.Pokemons.Pidgeotto;
import se.eggmaster.eggsimulator.Models.Pokemons.Pidgey;
import se.eggmaster.eggsimulator.Models.Pokemons.Pikachu;
import se.eggmaster.eggsimulator.Models.Pokemons.Poliwag;
import se.eggmaster.eggsimulator.Models.Pokemons.Poliwhirl;
import se.eggmaster.eggsimulator.Models.Pokemons.Poliwrath;
import se.eggmaster.eggsimulator.Models.Pokemons.Primeape;
import se.eggmaster.eggsimulator.Models.Pokemons.Psyduck;
import se.eggmaster.eggsimulator.Models.Pokemons.Raichu;
import se.eggmaster.eggsimulator.Models.Pokemons.Raticate;
import se.eggmaster.eggsimulator.Models.Pokemons.Rattata;
import se.eggmaster.eggsimulator.Models.Pokemons.Sandshrew;
import se.eggmaster.eggsimulator.Models.Pokemons.Sandslash;
import se.eggmaster.eggsimulator.Models.Pokemons.Spearow;
import se.eggmaster.eggsimulator.Models.Pokemons.Squirtle;
import se.eggmaster.eggsimulator.Models.Pokemons.Tentacool;
import se.eggmaster.eggsimulator.Models.Pokemons.Tentacruel;
import se.eggmaster.eggsimulator.Models.Pokemons.Venomoth;
import se.eggmaster.eggsimulator.Models.Pokemons.Venonat;
import se.eggmaster.eggsimulator.Models.Pokemons.Venusaur;
import se.eggmaster.eggsimulator.Models.Pokemons.Victreebel;
import se.eggmaster.eggsimulator.Models.Pokemons.Vileplume;
import se.eggmaster.eggsimulator.Models.Pokemons.Vulpix;
import se.eggmaster.eggsimulator.Models.Pokemons.Wartortle;
import se.eggmaster.eggsimulator.Models.Pokemons.Weedle;
import se.eggmaster.eggsimulator.Models.Pokemons.Weepinbell;
import se.eggmaster.eggsimulator.Models.Pokemons.Wigglytuff;
import se.eggmaster.eggsimulator.Models.Pokemons.Zubat;

/**
 * Created by FelixTheMaster on 2016-07-29.
 */
public final class IPokemonNames {

    public static int POKEMON_NR = 73;

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
        mPokemonById.add(0, null);
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
        /*mPokemonById.add(74, new Geodude());
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
        mPokemonById.add(151, new Mew());*/


    }

    public static Pokemon getPokemonById(int id) {
        Pokemon pokemonTemplate = mPokemonById.get(id);
        Pokemon pokemonClose = new Pokemon(pokemonTemplate.getName(), pokemonTemplate.getBaseAttack(), pokemonTemplate.getBaseDefence(), pokemonTemplate.getBaseStamina(), pokemonTemplate.getImageRes());
        return pokemonClose;
    }

}
