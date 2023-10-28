package no.runsafe.api.entity;

import no.runsafe.api.block.BlockFace;

public interface IHanging extends IEntity {
    boolean setFacingDirection(BlockFace face, boolean force);
}
