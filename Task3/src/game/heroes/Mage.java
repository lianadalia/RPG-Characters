package game.heroes;

public class Mage extends Hero {
    // stats
     public static int baseHealth = 100;
     public static int baseStrength = 2;
     public static int baseDexterity = 3;
     public static int baseIntelligence = 10;

     public static int expHealth = 15;
     public static int expStrength = 1;
     public static int expDexterity = 2;
     public static int expIntelligence = 5;

    // Constructor
    //super keyword
    public Mage(){
        super(baseHealth,baseStrength,baseDexterity,baseIntelligence,expHealth,expStrength,expDexterity,expIntelligence);
    }
}




