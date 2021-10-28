package statusmoves;

import ru.ifmo.se.pokemon.*;

public class Foresight extends StatusMove {

    public Foresight(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe() {
        return "исопльзует Foresight";
    }

}
