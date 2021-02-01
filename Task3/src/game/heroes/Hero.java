package game.heroes;

import game.items.Item;
import game.setup.ItemType;
import game.setup.SlotType;
import game.items.armor.Armor;
import game.items.weapon.Weapon;
import game.setup.WeaponType;

import java.util.HashMap;


public abstract class Hero {

    //stores key/value armor & weapon
    HashMap<SlotType, Armor> equippedArmor = new HashMap<>();
    HashMap<SlotType, Weapon> equippedWeapon = new HashMap<>();

    // stats
   public int healt,strength,dexterity,intelligence;
   public int expHealth,expStrength,expDexterity,expIntelligence;
   public int bonusHealth,bonusStrength,bonusDexterity,bonusIntelligence;
   public int level = 1;
   public int currentXp = 0;
   public int nextLevelExpRequirement = 100;
   public int totalExpNeeded = 100;



     Hero(int Healt, int Strength,int Dexterity, int intelligence,
                   int expHealth,int expStrength,int expDexterity,int expIntelligence){

        getHealth();
         {
             this.healt = Healt;
             this.expHealth = expHealth;
         }
        getStrength();
         {
             this.strength = Strength;
             this.expStrength = expStrength;
         }
        getDexterity();
         {
             this.dexterity = Dexterity;
             this.expDexterity = expDexterity;
         }
        getIntelligence();
         {
             this.intelligence = intelligence;
             this.expIntelligence = expIntelligence;
         }

    }

    // Actions
    public void removeEquippedItem(SlotType slot){

        if (slot == SlotType.MAINWEAPON){
            equippedWeapon.remove(slot);
        }else{
            BonusStatsItems(equippedArmor.get(slot),slot,false);
            equippedArmor.remove(slot);
        }
    }

    public int getDamage(SlotType slot){


        if (!equippedWeapon.containsKey(slot))
            return 0;
        Weapon currentWeapon = equippedWeapon.get(slot);

        int damage = 0;
        if(currentWeapon.getWeapontype() == WeaponType.MELEE){
            damage = currentWeapon.getBaseDamage()+(((int) (Math.floor(getStrength()*currentWeapon.getdamegeMultiply()))));
        }
        if(currentWeapon.getWeapontype() == WeaponType.RANGED){
            damage = currentWeapon.getBaseDamage()+(((int) (Math.floor(getDexterity()*currentWeapon.getdamegeMultiply()))));
        }
        return damage;
    }


    public void BonusStatsItems(Armor armor , SlotType slot, boolean increaseStats){
        double slotMultiplier = 1.0;
        if(armor != null) {

            if(slot == SlotType.HEAD){
                slotMultiplier = 0.8;
            }else if(slot == SlotType.LEGS){
                slotMultiplier = 0.6;
            }
            if(increaseStats) {
                bonusHealth += Math.floor(armor.getItemHealthBonus() * slotMultiplier);
                bonusStrength += Math.floor(armor.getItemStrengthBonus() * slotMultiplier);
                bonusDexterity += Math.floor(armor.getItemDexterityBonus() * slotMultiplier);
                bonusIntelligence += Math.floor(armor.getItemIntelligenceBonus() * slotMultiplier);
            }else{
                bonusHealth -= Math.floor(armor.getItemHealthBonus() * slotMultiplier);
                bonusStrength -= Math.floor(armor.getItemStrengthBonus() * slotMultiplier);
                bonusDexterity -= Math.floor(armor.getItemDexterityBonus() * slotMultiplier);
                bonusIntelligence -= Math.floor(armor.getItemIntelligenceBonus() * slotMultiplier);
            }
        }
    }

    public void levelUp(){
        level++;
        setHealth(getHealth() + expHealth);
        setStrength(getStrength() + expStrength);
        setDexterity(getDexterity() + expDexterity);
        setIntelligence(getIntelligence() + expIntelligence);

    }
    public void putItemInSlot(Item item, SlotType slot, ItemType itemType){

        if(itemType == ItemType.WEAPON){
            equippedWeapon.put(slot, (Weapon) item);
        }else{
            equippedArmor.put(slot,(Armor) item);
        }
    }
    public String toString(){
        return this.getClass().getSimpleName()+" details:"+"\n"+
                "HP: "+getHealth()+"\n"+
                "Str: "+getStrength()+"\n"+
                "Dex: "+getDexterity()+"\n"+
                "Int: "+getIntelligence()+"\n"+
                "Lvl: "+ level+"\n"+
                "XP to next "+(totalExpNeeded-currentXp);
    }

    public int getLevel() {
         return level;
     }

    public int getHealth()
    { return healt + bonusHealth;
    }

    public void setHealth(int newHealt) {
         this.healt = newHealt;
     }

    public int getStrength() {
         return strength + bonusStrength;
    }

    public void setStrength(int newStrength) {
         this.strength = newStrength;
     }

    public int getDexterity() {
         return dexterity + bonusDexterity;
    }

    public void setDexterity(int newDexterity) {
         this.dexterity = newDexterity;
     }

    public int getIntelligence() {
         return intelligence + bonusIntelligence;
    }

    public void setIntelligence(int newintelligence) {
         this.intelligence = newintelligence;
     }

    public int getcurrentXp(){
         return currentXp;
     }
    public void addExp(int expPoints){
         currentXp += expPoints;
     }

    public void setNeededExp(int nextLevelExpRequirement) {

         this.totalExpNeeded += nextLevelExpRequirement;
    }

    public int getLevelUpUpgrade(){
         return nextLevelExpRequirement;
     }
    public void setLevelUpUpgrade(){
         nextLevelExpRequirement = (int) Math.rint(nextLevelExpRequirement * 1.1);
     }
    public int getTotalExperienceNeeded(){
         return totalExpNeeded;
     }
    public HashMap<SlotType,Armor> getArmorMap(){
         return equippedArmor;
     }

}


