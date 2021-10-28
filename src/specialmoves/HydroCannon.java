package specialmoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroCannon extends SpecialMove {

    public HydroCannon(){
        super(Type.WATER, 150, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.turn();
    }


    @Override
    protected String describe() {
        return "использует Hydro Cannon";
    }
}
