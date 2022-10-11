package Pokemons;

import ru.ifmo.se.pokemon.Type;
import Attacks.*;

//класс готов
public class Gardevoir extends Kirlia {
    public Gardevoir(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(68, 65, 65, 125, 115, 80);
        addMove(new SpecialMove.FocusBlast());
    }
}
