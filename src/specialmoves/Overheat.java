package specialmoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Overheat extends SpecialMove {

    public Overheat(){
        super(Type.FIRE, 130, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "использует Overheat";
    }
}
