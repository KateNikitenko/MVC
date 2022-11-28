package DnD.CharacterCreator.DnDClass.Factory;

import DnD.CharacterCreator.DnDClass.Classes.CharacterClass;
import DnD.CharacterCreator.DnDClass.Classes.Bard;
import DnD.CharacterCreator.DnDClass.Classes.Ranger;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Bard".equalsIgnoreCase(type)) return new Bard();
        else if("Ranger".equalsIgnoreCase(type)) return new Ranger();
        return null;
 }

}
