package physicalmoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MeteorMash extends PhysicalMove {

    public MeteorMash(){
        super(Type.STEEL, 90, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (Math.random() < 0.2){
            pokemon.setMod(Stat.ATTACK, 1);
        }
    }

    @Override
    protected String describe() {
        return "использует Meteor Mash";
    }
}
