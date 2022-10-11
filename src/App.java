import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class App {
    public static void main(String[] args) throws Exception {
        Battle b = new Battle();
        var Cloyster = new Cloyster("eblan", 3);
        var Ralts = new Ralts("Ralts", 2);
        var Shellder = new Shellder("Shellder", 3);
        var Volbeat = new Volbeat("Volbeat", 3);
        var Gardevoir = new Gardevoir("Gardevoir", 3);
        var Kirlia = new Kirlia("Kirilia", 3);
        b.addAlly(Cloyster);
        b.addAlly(Gardevoir);
        b.addAlly(Ralts);
        b.addFoe(Shellder);
        b.addFoe(Volbeat);
        b.addFoe(Kirlia);
        b.go();
    }
}