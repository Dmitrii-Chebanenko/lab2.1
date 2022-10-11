package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Attacks.*;

// класс готов
public class Ralts extends Pokemon {
    public Ralts(String name, int level) {
        super(name, level);
        setStats(28, 25, 25, 45, 35, 40);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new StatusMove.CalmMind(), new SpecialMove.Confusion());
    }
}
