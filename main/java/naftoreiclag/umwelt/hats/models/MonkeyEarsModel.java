package naftoreiclag.umwelt.hats.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import net.minecraft.client.model.ModelRenderer;

public class MonkeyEarsModel extends ModelBase
{
	ModelRenderer ear1;
	ModelRenderer ear2;

	public MonkeyEarsModel()
	{
		textureWidth = 64;
		textureHeight = 32;

		ear1 = new ModelRenderer(this, 12, 0);
		ear1.addBox(0F, 0F, 0F, 5, 5, 1);
		ear1.setRotationPoint(4F, -7F, -2F);
		ear1.setTextureSize(64, 32);
		ear1.mirror = true;
		setRotation(ear1, 0F, 0F, 0F);
		ear2 = new ModelRenderer(this, 0, 0);
		ear2.addBox(0F, 0F, 0F, 5, 5, 1);
		ear2.setRotationPoint(-9F, -7F, -2F);
		ear2.setTextureSize(64, 32);
		ear2.mirror = true;
		setRotation(ear2, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		ear1.render(f5);
		ear2.render(f5);
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
