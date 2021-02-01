package game.items.armor;

import game.items.Item;
import game.setup.SlotType;

public class Leather extends Armor implements Item {
    public static int countBonusHealth = 10;
    public static int countBonusStrength = 0;
    public static int countBonusDexterity = 1;
    public static int countBonusIntelligence = 3;

    public static int gainBonusHealth = 5;
    public static int gainBonusStrength = 0;
    public static int gainBonusDexterity = 1;
    public static int gainBonusIntelligence = 2;

    public Leather (String name, int level, SlotType slot) {
        super(name, level, slot, countBonusHealth, countBonusStrength, countBonusDexterity, countBonusIntelligence,
                gainBonusHealth, gainBonusStrength, gainBonusDexterity, gainBonusIntelligence);
    }

    }


