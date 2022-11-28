package DnD.CharacterCreator.DnDClass.Classes;

public class Ranger extends CharacterClass{
    private String perk;
    public Ranger(){
        this.name = "Ranger";
        this.dice = 10;
        this.perk = "Beast master";
    }

    public void printDice(){
        System.out.println("Health = " + dice);
    }

    @Override
    public void printMagica() {
        System.out.println("Class " + name + " can: " + perk);
    }
}