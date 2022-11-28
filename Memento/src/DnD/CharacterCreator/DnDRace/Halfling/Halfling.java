package DnD.CharacterCreator.DnDRace.Halfling;

import DnD.CharacterCreator.DnDRace.CharacterRace;
import DnD.CharacterCreator.Stats;
public class Halfling extends CharacterRace {

    Halfling(String name, Stats stat) {
        this.name = name;
        this.bonuses = stat;
    }

    @Override
    public void shout() {
        System.out.println("Reparo");
    }
}
