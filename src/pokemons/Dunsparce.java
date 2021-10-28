package pokemons;

import physicalmoves.PayDay;
import physicalmoves.ThunderPunch;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import specialmoves.PetalDance;
import statusmoves.Supersonic;

public class Dunsparce extends Pokemon {

    public Dunsparce(String name, int level){
        super(name, level);
        setMove(new Supersonic(), new PayDay(), new PetalDance(), new ThunderPunch());
        setType(Type.NORMAL);
        setStats(100, 70, 70, 65, 65, 45);
    }


}
