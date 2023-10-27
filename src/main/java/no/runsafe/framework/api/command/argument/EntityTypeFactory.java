package no.runsafe.framework.api.command.argument;

import no.runsafe.framework.api.minecraft.RunsafeEntityType;

import java.util.List;

public interface EntityTypeFactory {
    public List<RunsafeEntityType> getTypesByName(String filter);
}
