package naftoreiclag.umwelt.hats.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HaloHatModel extends ModelBase
{
	// fields
	ModelRenderer front;
	ModelRenderer back;
	ModelRenderer left;
	ModelRenderer right;

	public HaloHatModel()
	{
		textureWidth = 64;
		textureHeight = 32;

		front = new ModelRenderer(this, 0, 0);
		front.addBox(0F, 0F, 0F, 6, 1, 1);
		front.setRotationPoint(-3F, -12F, -3F);
		front.setTextureSize(64, 32);
		front.mirror = true;
		setRotation(front, 0F, 0F, 0F);
		back = new ModelRenderer(this, 14, 0);
		back.addBox(0F, 0F, 0F, 6, 1, 1);
		back.setRotationPoint(-3F, -12F, 2F);
		back.setTextureSize(64, 32);
		back.mirror = true;
		setRotation(back, 0F, 0F, 0F);
		left = new ModelRenderer(this, 0, 2);
		left.addBox(0F, 0F, 0F, 1, 1, 4);
		left.setRotationPoint(2F, -12F, -2F);
		left.setTextureSize(64, 32);
		left.mirror = true;
		setRotation(left, 0F, 0F, 0F);
		right = new ModelRenderer(this, 10, 2);
		right.addBox(0F, 0F, 0F, 1, 1, 4);
		right.setRotationPoint(-3F, -12F, -2F);
		right.setTextureSize(64, 32);
		right.mirror = true;
		setRotation(right, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		front.render(f5);
		back.render(f5);
		left.render(f5);
		right.render(f5);
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
