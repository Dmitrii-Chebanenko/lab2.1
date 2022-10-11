package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Attacks.*;

//класс готов
public class Volbeat extends Pokemon {
    public Volbeat(String name, int level) {
        super(name, level);
        setStats(65, 73, 75, 47, 85, 85);
        setType(Type.BUG);
        setMove(new StatusMove.Swagger(), new StatusMove.ThunderWave(), new StatusMove.DoubleTeam(),
                new StatusMove.TailGlow());
    }
}