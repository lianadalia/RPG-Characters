package game;

import game.heroes.Mage;
import game.heroes.Ranger;
import game.heroes.Warrior;
import game.setup.SlotType;
import game.items.armor.Cloth;
import game.items.armor.Leather;
import game.items.armor.Plate;
import game.items.weapon.Melee;
import game.items.weapon.Ranged;
import game.setup.DetailSetUp;

public class Main {
    public static void main(String[] args) {
        DetailSetUp DetailSetUp = new DetailSetUp();

        // Displays hero classes

        System.out.println();
        System.out.println("-Creates Hero classes-");
        Mage mage = new Mage();
        Ranger ranger = new Ranger();
        Warrior warrior = new Warrior();


        System.out.println("------------");
        System.out.println(warrior.toString());
        System.out.println("------------");
        System.out.println();
        System.out.println("------------");
        System.out.println(mage.toString());
        System.out.println("------------");
        System.out.println();
        System.out.println("------------");
        System.out.println(ranger.toString());
        System.out.println("------------");

        System.out.println();
        System.out.println("-Experience is added to the Warrior-");
        System.out.println();
        System.out.println("------------");
        DetailSetUp.addExperience(warrior,500);
        System.out.println("------------");
        System.out.println();
        System.out.println("-Experience is added to the Mage-");
        System.out.println();
        System.out.println("------------");
        DetailSetUp.addExperience(mage, 350);
        System.out.println("------------");
        System.out.println();
        System.out.println("-Experience is added to the Ranger-");
        System.out.println();
        System.out.println("------------");
        DetailSetUp.addExperience(ranger, 450);
        System.out.println();
        System.out.println("------------");
        System.out.println("-Heroes updated stats-");
        System.out.println();
        System.out.println(warrior.toString());
        System.out.println();
        System.out.println(mage.toString());
        System.out.println();
        System.out.println(ranger.toString());
        System.out.println();
        System.out.println("------------");

        System.out.println("-Creating each Item types-");
        System.out.println();
        Cloth clothHelmet = new Cloth("Ice ClothHelmet",4, SlotType.HEAD);
        System.out.println(clothHelmet.toString());


        Plate platePants = new Plate("Frozen PlatePants", 3, SlotType.LEGS);
        System.out.println(platePants.toString());
        Leather leatherBody = new Leather("Winter LeatherBody", 1, SlotType.BODY);
        System.out.println(leatherBody.toString());
        Ranged ranged = new Ranged("The Bow of the North",1, SlotType.MAINWEAPON);
        System.out.println("Multiplier " +ranged.getdamegeMultiply());
        System.out.println(ranged.toString());
        System.out.println();
        Melee melee = new Melee("Icebreaker Axe",2, SlotType.MAINWEAPON);
        System.out.println("Multiplier " +melee.getdamegeMultiply());
        System.out.println(melee.toString());

        System.out.println("-Warrior is equipping the Helmet and Pants-");
        DetailSetUp.equipItem(warrior, platePants, SlotType.LEGS);
        DetailSetUp.equipItem(warrior, clothHelmet, SlotType.HEAD);
        System.out.println();
        System.out.println("------------");
        System.out.println("-Updated Stats-");
        System.out.println(warrior.toString());
        System.out.println();

        System.out.println("-Mage is equipping the Bodyarmor-");
        DetailSetUp.equipItem(mage, leatherBody, SlotType.BODY);
        System.out.println();
        System.out.println("------------");
        System.out.println("-Updated Stats-");
        System.out.println(mage.toString());
        System.out.println();

        System.out.println("-Warrior and Mage removed the Armor Items-");
        System.out.println();
        DetailSetUp.removeEquippedItem(warrior,clothHelmet, SlotType.HEAD);
        DetailSetUp.removeEquippedItem(warrior,platePants, SlotType.LEGS);
        DetailSetUp.removeEquippedItem(mage,leatherBody, SlotType.BODY);
        System.out.println("------------");
        System.out.println("-Updated Stats-");
        System.out.println();
        System.out.println(warrior.toString());
        System.out.println();
        System.out.println(mage.toString());
        System.out.println();

        System.out.println("-Warrior and Ranger are equipping Weapons-");
        DetailSetUp.equipItem(warrior,melee, SlotType.MAINWEAPON);
        DetailSetUp.equipItem(ranger,ranged, SlotType.MAINWEAPON);
        System.out.println("------------");
        System.out.println("-Warrior does damage-");
        System.out.println();
        System.out.println("Damage points: " +warrior.getDamage(SlotType.MAINWEAPON));
        System.out.println();

        System.out.println("------------");
        System.out.println("-Ranger does damage-");
        System.out.println();
        System.out.println("Damage points: " +ranger.getDamage(SlotType.MAINWEAPON));
        System.out.println();
        System.out.println("-----END-----");



    }
}
