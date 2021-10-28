package specialmoves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Gust extends SpecialMove {

    public Gust(){
        super(Type.FLYING, 40, 100);
    }


    @Override
    protected String describe() {
        return "исопльзует Gust";
    }
}
