package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Attacks.*;

//класс готов
public class Shellder extends Pokemon {
    public Shellder(String name, int level) {
        super(name, level);
        setStats(30, 65, 100, 45, 25, 40);
        setType(Type.WATER);
        setMove(new SpecialMove.HydroPump(), new SpecialMove.AuroraBeam(), new StatusMove.Rest());
    }
}