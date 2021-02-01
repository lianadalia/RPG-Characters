package game.items.armor;

import game.items.Item;
import game.setup.SlotType;

public class Plate extends Armor implements Item {
    public static int countBonusHealth = 30;
    public static int countBonusStrength = 3;
    public static int countBonusDexterity = 1;
    public static int countBonusIntelligence = 0;

    public static int gainBonusHealth = 12;
    public static int gainBonusStrength = 2;
    public static int gainBonusDexterity = 1;
    public static int gainBonusIntelligence = 0;


    public Plate(String name , int level, SlotType slot){
        super(name,level,slot,countBonusHealth,countBonusStrength,countBonusDexterity,countBonusIntelligence,
                gainBonusHealth,gainBonusStrength,gainBonusDexterity,gainBonusIntelligence);

    }
}

