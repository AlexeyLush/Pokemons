package physicalmoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PayDay extends PhysicalMove {

    public PayDay(){
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "исопльзует Pay Day";
    }

}
