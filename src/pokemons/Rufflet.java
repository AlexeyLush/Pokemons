package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import specialmoves.Gust;
import statusmoves.Foresight;
import statusmoves.MorningSun;

public class Rufflet extends Pokemon {

    public Rufflet(String name, int level){
        super(name, level);
        setType(Type.NORMAL, Type.FLYING);
        setStats(70, 83, 50, 37, 50, 60);
        setMove(new Foresight(), new Gust(), new MorningSun());
    }

}
