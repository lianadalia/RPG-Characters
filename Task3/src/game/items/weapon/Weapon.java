package game.items.weapon;

import game.items.Item;
import game.setup.ItemType;
import game.setup.SlotType;
import game.setup.WeaponType;

public abstract class Weapon implements Item {

    public SlotType slot;
    public ItemType itemType = ItemType.WEAPON;
    public WeaponType weapontype;
    public String name;
    public int level;
    public double damegeMultiply;


    public Weapon(String name, int level, SlotType slot, double damegeMultiply, WeaponType weapontype){
        this.name = name;
        this.level = level;
        this.slot = slot;
        this.damegeMultiply = damegeMultiply;
        this.weapontype = weapontype;
    }

    public abstract int getBaseDamage();
    public double getdamegeMultiply(){
        return damegeMultiply;
    }
    public SlotType getSlot(){ return slot; }
    public ItemType getItemType() { return itemType; }
    public WeaponType getWeapontype() { return weapontype; }
    public int getLevel(){ return level; }


    public String toString(){

        return "Item stats for: "+ name+"\n"+
                "Weapon Type: "+this.getClass().getSimpleName()+"\n"+
                "Weapon level: " + level+"\n"+
                "Damage: "+ getBaseDamage();
    }

}



