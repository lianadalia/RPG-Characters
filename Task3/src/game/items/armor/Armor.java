package game.items.armor;

import game.items.Item;
import game.setup.ItemType;
import game.setup.SlotType;

public abstract class Armor implements Item {

    // Abstract Armor class which contains properties
    public final int countBonusHealth,countBonusStrength,countBonusDexterity,countBonusIntelligence;
    public final int gainBonusHealth,gainBonusStrength,gainBonusDexterity,gainBonusIntelligence;
    public final int level;
    private String title;
    public SlotType slot;
    public String name;
    public ItemType itemType = ItemType.ARMOR;
    public Armor(String name, int level, SlotType slot, int countBonusHealth,
                 int countBonusStrength,
                 int countBonusDexterity,
                 int countBonusIntelligence,
                 int gainBonusHealth,
                 int gainBonusStrength,
                 int gainBonusDexterity,
                 int gainBonusIntelligence)
    {


        this.countBonusHealth = countBonusHealth;
        this.countBonusStrength = countBonusStrength;
        this.countBonusDexterity = countBonusDexterity;
        this.countBonusIntelligence = countBonusIntelligence;

        this.gainBonusHealth = gainBonusHealth;
        this.gainBonusStrength = gainBonusStrength;
        this.gainBonusDexterity = gainBonusDexterity;
        this.gainBonusIntelligence = gainBonusIntelligence;

        this.name = name;
        this.level = level;
        this.slot = slot;
    }

    public int getItemHealthBonus(){

        return countBonusHealth + (gainBonusHealth * level);
    }
    public int getItemStrengthBonus(){

        return countBonusStrength + (gainBonusStrength * level);
    }
    public int getItemDexterityBonus(){

        return countBonusDexterity + (gainBonusDexterity * level);
    }
    public int getItemIntelligenceBonus(){

        return countBonusIntelligence + (gainBonusIntelligence * level);
    }
    public ItemType getItemType() {

        return itemType;
    }
    public SlotType getSlot(){

        return slot;
    }


    public String toString(){

        String BonusStats ="";

        if(getItemHealthBonus() > 0){
            BonusStats += "Bonus HP: "+ getItemHealthBonus()+"\n";
        }
        if(getItemStrengthBonus() > 0){
            BonusStats+= "Bonus Str: "+getItemStrengthBonus()+"\n";
        }
        if(getItemDexterityBonus() > 0){
            BonusStats+= "Bonus Dex: "+getItemDexterityBonus()+"\n";
        }

        if(getItemIntelligenceBonus() > 0){
            BonusStats+= "Bonus Int: "+getItemIntelligenceBonus()+"\n";
        }


        return "Item stats: "+ name+"\n"+
                "Weapon type: " + this.getClass().getSimpleName() +"\n"+
                "Slot: "+ slot.title+"\n"+
                "Armor lvl: "+ level+"\n"+
                BonusStats;
    }
    void SlotType(String title) {

        this.title = title;
    }

    public int getLevel() { return level; }
}

