package statusmoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class MorningSun extends StatusMove {

    public MorningSun(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, (int)pokemon.getStat(Stat.HP));
    }

    @Override
    protected String describe() {
        return "исопльзует Morning Sun";
    }
}
