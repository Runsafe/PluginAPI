package no.runsafe.api.server;

public interface IMetadataValue
{
    Object value();

    int asInt();

    float asFloat();

    double asDouble();

    long asLong();

    short asShort();

    byte asByte();

    boolean asBoolean();

    String asString();

    IPlugin getOwningPlugin();

    void invalidate();
}
