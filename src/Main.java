import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {

    public static void main(String[] args){
        Battle b = new Battle();

        Pokemon dun = new Dunsparce("Слизень", 1);
        Pokemon ruff = new Rufflet("Орлик", 2);
        Pokemon brav = new Braviary("Орёл", 4);


        Pokemon flab = new Flabebe("Росток", 2);
        Pokemon floet = new Floette("Раст", 2);
        Pokemon florg = new Florges("Флорг", 4);


        b.addAlly(dun);
        b.addAlly(ruff);
        b.addAlly(brav);

        b.addFoe(flab);
        b.addFoe(floet);
        b.addFoe(florg);

        b.go();
    }

}
