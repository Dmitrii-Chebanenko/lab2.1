package Attacks;

import ru.ifmo.se.pokemon.*;

public class PhysicalMove {
    // extends от PhysicalMove начало
    // IcicleCrash готов
    public static class IcicleCrash extends ru.ifmo.se.pokemon.PhysicalMove {
        public IcicleCrash() {
            super(Type.ICE, 85, 90);
        }

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            if (Helpfunction.Chance.raisechance(30)) {
                Effect.flinch(pokemon);
                super.applyOppEffects(pokemon);
            }
        }

        @Override
        protected String describe() {
            return "does IcicleCrash";
        }
    }
    // extends от PhysicalMove конец
}
