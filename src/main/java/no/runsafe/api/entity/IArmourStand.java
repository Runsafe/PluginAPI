package no.runsafe.api.entity;

import no.runsafe.api.item.IMeta;
import no.runsafe.api.vector.IPoint3D;

public interface IArmourStand extends ILivingEntity
{
	IMeta getItemInHand();
	void setItemInHand(IMeta itemStack);
	IMeta getBoots();
	void setBoots(IMeta itemStack);
	IMeta getLeggings();
	void setLeggings(IMeta itemStack);
	IMeta getChestPlate();
	void setChestPlate(IMeta itemStack);
	IMeta getHelmet();
	void setHelmet(IMeta itemStack);
	boolean hasBasePlate();
	void setBasePlate(boolean basePlateValue);
	boolean hasGravity();
	void setGravity(boolean gravityValue);
	boolean isVisible();
	void setVisible(boolean visibleValue);
	boolean hasArms();
	void setArms(boolean armsValue);
	boolean isSmall();
	void setSmall(boolean smallValue);
	boolean isMarker();
	void setMarker(boolean markerValue);
	IPoint3D getBodyPose();
	void setBodyPose(IPoint3D poseAngle);
	IPoint3D getLeftArmPose();
	void setLeftArmPose(IPoint3D poseAngle);
	IPoint3D getRightArmPose();
	void setRightArmPose(IPoint3D poseAngle);
	IPoint3D getLeftLegPose();
	void setLeftLegPose(IPoint3D poseAngle);
	IPoint3D getRightLegPose();
	void setRightLegPose(IPoint3D poseAngle);
	IPoint3D getHeadPose();
	void setHeadPose(IPoint3D poseAngle);
}