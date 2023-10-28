package no.runsafe.framework.api.player;

import no.runsafe.framework.api.item.IItem;
import no.runsafe.framework.api.item.IMeta;
import no.runsafe.framework.api.minecraft.IInventoryHolder;

import javax.annotation.Nullable;

public interface IPlayerInventory extends IInventoryHolder
{
	void give(IMeta... items);

	boolean hasItem(IItem itemType, int amount);

	boolean hasItemStrict(IItem itemType, int amount);

	void removeItem(IItem itemType, int amount);

	void removeItem(IItem itemType);

	void clearInventory();

	void closeInventory();

	@Deprecated
	@Nullable
	IMeta getItemInHand();

	@Nullable
	IMeta getItemInMainHand();

	@Nullable
	IMeta getItemInOffHand();

	void setItemInMainHand(IMeta itemStack);

	void setItemInOffHand(IMeta itemStack);

	void updateInventory();

	void openInventory(IPlayerInventory inventory);

	@Nullable
	IMeta getHelmet();

	@Nullable
	IMeta getChestPlate();

	@Nullable
	IMeta getLeggings();

	@Nullable
	IMeta getBoots();

	void setHelmet(IMeta itemStack);

	void setChestPlate(IMeta itemStack);

	void setLeggings(IMeta itemStack);

	void setBoots(IMeta itemStack);

	void removeExactItem(IMeta item, int amount);

	void removeExactItem(IMeta item);
}
