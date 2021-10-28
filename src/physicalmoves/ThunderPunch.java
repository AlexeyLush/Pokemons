package physicalmoves;

import ru.ifmo.se.pokemon.*;

public class ThunderPunch extends PhysicalMove {

    public ThunderPunch(){
        super(Type.ELECTRIC, 75, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        if (Math.random() < 0.1){
            Effect.paralyze(pokemon);
        }
    }


    @Override
    protected String describe() {
        return "исопльзует Thunder Punch";
    }
}
