package pokemons;

import statusmoves.Amnesia;

public class Braviary extends Rufflet{
    public Braviary(String name, int level) {
        super(name, level);
        setStats(100, 123,75,57,75,80);
        addMove(new Amnesia());
    }
}
