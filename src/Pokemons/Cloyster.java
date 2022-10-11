package Pokemons;

import ru.ifmo.se.pokemon.Type;
import Attacks.*;

//класс готов
public class Cloyster extends Shellder {
    public Cloyster(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.ICE);
        setStats(50, 95, 180, 85, 45, 70);
        addMove(new PhysicalMove.IcicleCrash());
    }
}
