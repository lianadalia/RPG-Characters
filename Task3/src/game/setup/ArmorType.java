package game.setup;

import game.items.armor.Armor;

import java.util.HashMap;

public interface ArmorType {

        HashMap countBonusStats(int level, String slot, int hp, int str, int dex, int intelligence);

        void setArmorPieceToSlot(HashMap itemSlots, Armor armor);
    }

