package game.items.weapon;

import game.items.Item;
import game.setup.SlotType;
import game.setup.WeaponType;

public class Ranged extends Weapon implements Item {
    private static WeaponType weaponType = WeaponType.RANGED;
    private int baseDamage = 5;
    private static  double damageMultiplier = 2.0;

    public Ranged(String name, int level, SlotType slot) {
        super(name, level,slot,damageMultiplier,weaponType);
    }


    @Override
    public int getBaseDamage() {
        return baseDamage+(3*getLevel());
    }

}

