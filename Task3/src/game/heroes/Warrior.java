package game.heroes;

public class Warrior extends Hero {
    // stats warrior
    public static int baseHealth = 150;
    public static int baseStrength = 10;
    public static int baseDexterity = 3;
    public static int baseIntelligence = 1;

    public static int expHealth = 30;
    public static int expStrength = 5;
    public static int expDexterity = 2;
    public static int expIntelligence = 1;

    // Constructor
    //super keyword
    public Warrior(){
        super(baseHealth,baseStrength,baseDexterity,baseIntelligence,expHealth,expStrength,expDexterity,expIntelligence);
    }

}
