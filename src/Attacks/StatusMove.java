package Attacks;

import ru.ifmo.se.pokemon.*;

public class StatusMove {
    // extends от StatusMove начало
    // Swagger готов
    public static class Swagger extends ru.ifmo.se.pokemon.StatusMove {
        public Swagger() {
            super(Type.NORMAL, 0, 85);
        }

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            super.applyOppEffects(pokemon);
            Effect.confuse(pokemon);
        }

        @Override
        protected void applySelfEffects(Pokemon pokemon) {
            super.applySelfEffects(pokemon);
            Effect effect = new Effect().stat(Stat.ATTACK, 2);
            pokemon.addEffect(effect);
        }

        @Override
        protected String describe() {
            return "does Swagger";
        }
    }

    //
    public static class Rest extends ru.ifmo.se.pokemon.StatusMove {
        public Rest() {
            super(Type.PSYCHIC, 0, 0);
        }

        @Override
        // доделать функцию
        protected void applySelfEffects(Pokemon pokemon) {
            super.applySelfEffects(pokemon);
            Effect effect = new Effect().condition(Status.SLEEP).turns(2);
            // полностью исцелить
            pokemon.addEffect(effect);
        }

        @Override
        protected String describe() {
            return "does Rest";
        }
    }

    // CalmMind готов
    public static class CalmMind extends ru.ifmo.se.pokemon.StatusMove {
        public CalmMind() {
            super(Type.PSYCHIC, 0, 0);
        }

        @Override
        protected void applySelfEffects(Pokemon pokemon) {
            Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
            Effect effect2 = new Effect().stat(Stat.SPECIAL_DEFENSE, 1);
            pokemon.addEffect(effect);
            pokemon.addEffect(effect2);
            super.applySelfEffects(pokemon);
        }

        @Override
        protected String describe() {
            return "does CalmMind";
        }
    }

    // класс готов
    public static class Charm extends ru.ifmo.se.pokemon.StatusMove {
        public Charm() {
            super(Type.FAIRY, 0, 100);
        }

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            Effect effect = new Effect().stat(Stat.ATTACK, -2);
            pokemon.addEffect(effect);
            super.applyOppEffects(pokemon);
        }

        @Override
        protected String describe() {
            return "does Charm";
        }
    }

    // класс готов
    public static class ThunderWave extends ru.ifmo.se.pokemon.StatusMove {
        public ThunderWave() {
            super(Type.ELECTRIC, 0, 90);
        }

        @Override
        protected void applyOppEffects(Pokemon pokemon) {
            Effect.paralyze(pokemon);
            super.applyOppEffects(pokemon);
        }

        @Override
        protected String describe() {
            return "does ThunderWave";
        }
    }

    //
    public static class DoubleTeam extends ru.ifmo.se.pokemon.StatusMove {
        public DoubleTeam() {
            super(Type.NORMAL, 0, 0);
        }

        @Override
        protected void applySelfEffects(Pokemon pokemon) {
            Effect effect = new Effect().stat(Stat.EVASION, 1);
            pokemon.addEffect(effect);
            super.applySelfEffects(pokemon);
        }

        @Override
        protected String describe() {
            return "does DoubleTeam";
        }
    }

    public static class TailGlow extends ru.ifmo.se.pokemon.StatusMove {
        public TailGlow() {
            super(Type.BUG, 0, 0);
        }

        @Override
        protected void applySelfEffects(Pokemon pokemon) {
            Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, 3);
            pokemon.addEffect(effect);
            super.applySelfEffects(pokemon);
        }

        @Override
        protected String describe() {
            return "does MoveData";
        }
    }

    // extends от StatusMove конец
}
