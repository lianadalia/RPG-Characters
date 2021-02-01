package game.heroes;

public class Ranger extends Hero {
    // stats ranger
    public static int baseHealth = 120;
    public static int baseStrength = 5;
    public static int baseDexterity = 10;
    public static int baseIntelligence = 2;

    public static int expHealth = 20;
    public static int expStrength = 2;
    public static int expDexterity = 5;
    public static int expIntelligence = 1;

    // Constructor
    //super keyword
    public Ranger(){
        super(baseHealth,baseStrength,baseDexterity,baseIntelligence,expHealth,expStrength,expDexterity,expIntelligence);
    }
}

