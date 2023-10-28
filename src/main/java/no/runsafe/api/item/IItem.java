package no.runsafe.api.item;

import no.runsafe.api.ILocation;
import no.runsafe.api.block.IBlock;
import no.runsafe.api.minecraft.IEnchantable;

public interface IItem extends IEnchantable {
    byte AnyData = -1;

    int getStackSize();

    String getName();

    byte getData();

    IItem Drop(ILocation location);

    IItem Drop(ILocation location, int amount);

    IBlock Place(ILocation location);

    @Deprecated
    int getItemID();
}
