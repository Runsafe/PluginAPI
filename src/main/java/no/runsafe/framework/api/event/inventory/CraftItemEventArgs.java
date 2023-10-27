package no.runsafe.framework.api.event.inventory;

public interface CraftItemEventArgs extends InventoryClickEventArgs {
    RunsafeRecipe getRecipe();
}
