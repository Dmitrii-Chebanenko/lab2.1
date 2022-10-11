package Attacks;

import ru.ifmo.se.pokemon.*;

public class SpecialMove {
    // extends от SpecialMove начало
    // HydroPump готов
    public static class HydroPump extends ru.ifmo.se.pokemon.SpecialMove {
        public HydroPump() {
            super(Type.WATER, 110, 80);
        }

        @Override
        protected String describe() {
            return "does HydroPump";
        }
    }

    // AuroraBeam готов
    public static class AuroraBeam extends ru.ifmo.se.pokemon.SpecialMove {
        public AuroraBeam() {
            super(Type.ICE, 65, 100);
        }

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            Effect effect = new Effect().stat(Stat.ATTACK, -1).chance(0.1);
            pokemon.addEffect(effect);
        }

        @Override
        protected String describe() {
            return "does AuroraBeam";
        }
    }

    // Confusion готов
    public static class Confusion extends ru.ifmo.se.pokemon.SpecialMove {
        public Confusion() {
            super(Type.PSYCHIC, 50, 100);
        }

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            if (Helpfunction.Chance.raisechance(10)) {
                Effect.confuse(pokemon);
                super.applyOppEffects(pokemon);
            }
        }

        @Override
        protected String describe() {
            return "does Confusion";
        }
    }

    // FocusBlast
    public static class FocusBlast extends ru.ifmo.se.pokemon.SpecialMove {
        public FocusBlast() {
            super(Type.FIGHTING, 120, 70);
        }

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, -1).chance(0.1);
            pokemon.addEffect(effect);
            super.applyOppEffects(pokemon);

        }

        @Override
        protected String describe() {
            return "does FocusBlast";
        }
    }
    // extends от SpecialMove конец
}
