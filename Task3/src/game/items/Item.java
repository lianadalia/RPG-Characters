package game.items;

import game.setup.ItemType;
import game.setup.SlotType;

public interface Item {
    public ItemType getItemType();
    public int getLevel();
    public SlotType getSlot();
}

