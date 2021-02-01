package game.items.weapon;

import game.items.Item;
import game.setup.SlotType;
import game.setup.WeaponType;


public class Melee extends Weapon implements Item {
    public static WeaponType weaponType = WeaponType.MELEE;
    int baseDamage = 15;
    public static double damageMultiplier = 1.5;
    public Melee(String name, int level, SlotType slot) {
        super(name, level,slot,damageMultiplier,weaponType);
    }


    @Override
    public int getBaseDamage() {
        return baseDamage+(2*getLevel());
    }
}



