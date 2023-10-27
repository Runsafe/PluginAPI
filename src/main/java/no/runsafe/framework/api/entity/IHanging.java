package no.runsafe.framework.api.entity;

import no.runsafe.framework.api.block.BlockFace;

public interface IHanging extends IEntity {
    boolean setFacingDirection(BlockFace face, boolean force);
}
