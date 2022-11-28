package DnD.CharacterCreator.DnDRace.Hobgobling;

import DnD.CharacterCreator.DnDRace.CharacterRace;
import DnD.CharacterCreator.Stats;

public class Hobgobling extends CharacterRace {
    Hobgobling(String name, Stats stat) {
        this.name = name;
        this.bonuses = stat;
    }

    @Override
    public void shout() {
        System.out.println("Portus");
    }
}
