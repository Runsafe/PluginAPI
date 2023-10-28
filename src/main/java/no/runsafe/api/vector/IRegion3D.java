package no.runsafe.api.vector;

public interface IRegion3D
{
	boolean contains(IPoint3D point);
	IPoint3D getMinimum();
	IPoint3D getMaximum();
}
