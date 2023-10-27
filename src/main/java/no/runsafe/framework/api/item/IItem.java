package no.runsafe.framework.api.item;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.minecraft.IEnchantable;

public interface IItem extends IEnchantable {
    byte AnyData = -1;

    int getStackSize();

    String getName();

    byte getData();

    IItem Drop(ILocation location);

    @SuppressWarnings("LocalVariableOfConcreteClass")
    IItem Drop(ILocation location, int amount);

    IBlock Place(ILocation location);

    @Deprecated
    int getItemID();
}
