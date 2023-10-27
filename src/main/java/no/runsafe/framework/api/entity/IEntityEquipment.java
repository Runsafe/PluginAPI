package no.runsafe.framework.api.entity;

import no.runsafe.framework.api.item.IMeta;

public interface IEntityEquipment {
    IEntityEquipment setItemInHand(IMeta itemStack);

    IEntityEquipment setHelmet(IMeta itemStack);

    IEntityEquipment setChestplate(IMeta itemStack);

    IEntityEquipment setLeggings(IMeta itemStack);

    IEntityEquipment setBoots(IMeta itemStack);

    IEntityEquipment setArmorContents(Iterable<IMeta> itemStacks);

    IEntityEquipment setItemInHandDropChance(float chance);

    IEntityEquipment setHelmetDropChance(float chance);

    IEntityEquipment setChestplateDropChance(float chance);

    IEntityEquipment setLeggingsDropChance(float chance);

    IEntityEquipment setBootsDropChance(float chance);
}
