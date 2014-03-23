package naftoreiclag.umwelt.hats.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FairyHornsModel extends ModelBase
{
	// fields
	ModelRenderer thethingy;
	ModelRenderer thethingytwo;

	public FairyHornsModel()
	{
		textureWidth = 64;
		textureHeight = 32;

		thethingy = new ModelRenderer(this, -14, 6);
		thethingy.addBox(0F, 0F, 0F, 14, 6, 0);
		thethingy.setRotationPoint(-7F, -14F, 0.1F);
		thethingy.setTextureSize(64, 32);
		thethingy.mirror = true;
		setRotation(thethingy, 0F, 0F, 0F);
		thethingytwo = new ModelRenderer(this, 0, 0);
		thethingytwo.addBox(0F, 0F, 0F, 14, 6, 0);
		thethingytwo.setRotationPoint(-7F, -14F, 0F);
		thethingytwo.setTextureSize(64, 32);
		thethingytwo.mirror = true;
		setRotation(thethingytwo, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		thethingy.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
