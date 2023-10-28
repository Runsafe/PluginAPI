package no.runsafe.api.entity;

import no.runsafe.api.item.IMeta;

public interface IEntityEquipment {
    IEntityEquipment setItemInHand(IMeta itemStack);

    IEntityEquipment setHelmet(IMeta itemStack);

    IEntityEquipment setChestPlate(IMeta itemStack);

    IEntityEquipment setLeggings(IMeta itemStack);

    IEntityEquipment setBoots(IMeta itemStack);

    IEntityEquipment setArmorContents(Iterable<IMeta> itemStacks);

    IEntityEquipment setItemInHandDropChance(float chance);

    IEntityEquipment setHelmetDropChance(float chance);

    IEntityEquipment setChestPlateDropChance(float chance);

    IEntityEquipment setLeggingsDropChance(float chance);

    IEntityEquipment setBootsDropChance(float chance);
}
