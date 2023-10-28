package no.runsafe.api.event.inventory;

public interface CraftItemEventArgs extends InventoryClickEventArgs {
    IRecipe getRecipe();
}

