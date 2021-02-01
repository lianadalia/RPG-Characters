package game.setup;

import game.heroes.Hero;
import game.items.Item;
import game.items.armor.Armor;

import java.util.HashMap;

public class DetailSetUp {
    public void addExperience(Hero hero, int addedExp){

        //Experience needed for next level & added
        //Level up 10% needed for next level
        //Stats increase
        do{
            hero.addExp(hero.getLevelUpUpgrade());
            addedExp-=hero.getLevelUpUpgrade();
            hero.setLevelUpUpgrade();
            hero.setNeededExp(hero.getLevelUpUpgrade());
            hero.levelUp();     
            System.out.println("Level up!"+"\n"+"Current level: " + hero.getLevel());

        } while((hero.getcurrentXp() + addedExp)>=(hero.getcurrentXp() + hero.getLevelUpUpgrade()));
        hero.addExp(addedExp);

        System.out.println(hero.getTotalExperienceNeeded()-hero.getcurrentXp() + " XP needed for level up");
    }

    public void equipItem(Hero hero, Item item, SlotType slot){

        HashMap<SlotType, Armor> equippedArmor = hero.getArmorMap();

        if(item.getLevel()<hero.getLevel()){
            if (item.getItemType().equals(ItemType.WEAPON)) {
                hero.putItemInSlot(item,slot,item.getItemType());
            } else {
                equipArmor(slot);
                if (equippedArmor.containsKey(slot)) {
                    hero.BonusStatsItems((Armor) item , item.getSlot(),false);
                }
                hero.putItemInSlot(item,slot,item.getItemType());
                hero.BonusStatsItems((Armor) item, item.getSlot(),true);
            }
        }else{
            System.out.println("Level too low. Cannot get Item.");
        }

    }

    private void equipArmor(SlotType slot) {
    }

    public void removeEquippedItem(Hero hero, Item item, SlotType slot){

        if(slot != SlotType.MAINWEAPON){
            hero.BonusStatsItems((Armor) item,slot,false);
        }else{
            hero.removeEquippedItem(slot);
        }

    }
}

