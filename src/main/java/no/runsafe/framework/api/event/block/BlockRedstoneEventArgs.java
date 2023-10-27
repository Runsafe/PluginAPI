package no.runsafe.framework.api.event.block;

public interface BlockRedstoneEventArgs extends BlockEventArgs {
    int getOldCurrent();
    int getNewCurrent();
    void setNewCurrent(int newCurrent);
}
