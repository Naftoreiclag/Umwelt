package naftoreiclag.umwelt.hats.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HellHornsModel extends ModelBase
{
	// fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer tipL;
	ModelRenderer baser;
	ModelRenderer BaseL;
	ModelRenderer tipR;

	public HellHornsModel()
	{
		textureWidth = 64;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this, 43, 0);
		Shape1.addBox(0F, 0F, 0F, 1, 24, 1);
		Shape1.setRotationPoint(0F, 0F, 0F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 23);
		Shape2.addBox(0F, 0F, 0F, 8, 8, 8);
		Shape2.setRotationPoint(-4F, -8F, -4F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		tipL = new ModelRenderer(this, 4, 7);
		tipL.addBox(0F, 0F, 0F, 1, 5, 1);
		tipL.setRotationPoint(2F, -13.4F, -4F);
		tipL.setTextureSize(64, 32);
		tipL.mirror = true;
		setRotation(tipL, -0.5576792F, -0.1858931F, -0.1115358F);
		baser = new ModelRenderer(this, 0, 0);
		baser.addBox(0F, 0F, 0F, 2, 5, 2);
		baser.setRotationPoint(-4.133333F, -9.433333F, -7F);
		baser.setTextureSize(64, 32);
		baser.mirror = true;
		setRotation(baser, 0.8922867F, 0.2230705F, 0F);
		BaseL = new ModelRenderer(this, 8, 0);
		BaseL.addBox(0F, 0F, 0F, 2, 5, 2);
		BaseL.setRotationPoint(2.4F, -9.333333F, -7F);
		BaseL.setTextureSize(64, 32);
		BaseL.mirror = true;
		setRotation(BaseL, 0.8922867F, -0.2230717F, 0F);
		tipR.mirror = true;
		tipR = new ModelRenderer(this, 0, 7);
		tipR.addBox(0F, 0F, 0F, 1, 5, 1);
		tipR.setRotationPoint(-2.933333F, -14.2F, -3.4F);
		tipR.setTextureSize(64, 32);
		tipR.mirror = true;
		setRotation(tipR, -0.5576851F, 0.3717861F, -0.1115358F);
		tipR.mirror = false;
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape1.render(f5);
		Shape2.render(f5);
		tipL.render(f5);
		baser.render(f5);
		BaseL.render(f5);
		tipR.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}

}
