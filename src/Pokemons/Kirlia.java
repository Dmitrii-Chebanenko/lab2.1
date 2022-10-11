package Pokemons;

//класс готов
import ru.ifmo.se.pokemon.Type;
import Attacks.*;

//класс готов
public class Kirlia extends Ralts {
    public Kirlia(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(38, 35, 35, 65, 55, 50);
        addMove(new StatusMove.Charm());
    }
}
