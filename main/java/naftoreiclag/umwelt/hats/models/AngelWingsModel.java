package naftoreiclag.umwelt.hats.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class AngelWingsModel extends ModelBase
{
	// fields
	ModelRenderer feather1;
	ModelRenderer feather2;
	ModelRenderer feather3;
	ModelRenderer hump;

	public AngelWingsModel()
	{
		textureWidth = 64;
		textureHeight = 64;

		feather1 = new ModelRenderer(this, 0, 0);
		feather1.addBox(0F, 0F, 0F, 4, 16, 2);
		feather1.setRotationPoint(2F, 0F, 4F);
		feather1.setTextureSize(64, 64);
		feather1.mirror = true;
		setRotation(feather1, 0F, 0F, 0F);
		feather2 = new ModelRenderer(this, 12, 0);
		feather2.addBox(0F, 0F, 0F, 4, 13, 2);
		feather2.setRotationPoint(6F, 0F, 4F);
		feather2.setTextureSize(64, 64);
		feather2.mirror = true;
		setRotation(feather2, 0F, 0F, 0F);
		feather3 = new ModelRenderer(this, 24, 0);
		feather3.addBox(0F, 1F, 0F, 2, 8, 2);
		feather3.setRotationPoint(10F, -1F, 4F);
		feather3.setTextureSize(64, 64);
		feather3.mirror = true;
		setRotation(feather3, 0F, 0F, 0F);
		hump = new ModelRenderer(this, 32, 0);
		hump.addBox(0F, 0F, 0F, 7, 2, 2);
		hump.setRotationPoint(4F, -2F, 4F);
		hump.setTextureSize(64, 64);
		hump.mirror = true;
		setRotation(hump, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		feather1.render(f5);
		feather2.render(f5);
		feather3.render(f5);
		hump.render(f5);
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
