package naftoreiclag.umwelt.hats.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class JinmoriModel extends ModelBase
{
	ModelRenderer cinnabun;
	ModelRenderer lig1;
	ModelRenderer lig2;
	ModelRenderer lig3;
	ModelRenderer lig4;
	ModelRenderer lig5;

	public JinmoriModel()
	{
		textureWidth = 64;
		textureHeight = 32;

		cinnabun = new ModelRenderer(this, 10, 2);
		cinnabun.addBox(0F, 0F, 0F, 1, 2, 4);
		cinnabun.setRotationPoint(5F, -8F, -2F);
		cinnabun.setTextureSize(64, 32);
		cinnabun.mirror = true;
		setRotation(cinnabun, 0F, 0F, 0F);
		lig1 = new ModelRenderer(this, 0, 3);
		lig1.addBox(0F, 0F, 0F, 1, 1, 4);
		lig1.setRotationPoint(5F, -7F, -6F);
		lig1.setTextureSize(64, 32);
		lig1.mirror = true;
		setRotation(lig1, 0F, 0F, 0F);
		lig2 = new ModelRenderer(this, 22, 0);
		lig2.addBox(0F, 0F, 0F, 10, 1, 1);
		lig2.setRotationPoint(-5F, -7F, 5F);
		lig2.setTextureSize(64, 32);
		lig2.mirror = true;
		setRotation(lig2, 0F, 0F, 0F);
		lig3 = new ModelRenderer(this, 32, 0);
		lig3.addBox(0F, 0F, 0F, 1, 1, 12);
		lig3.setRotationPoint(-6F, -7F, -6F);
		lig3.setTextureSize(64, 32);
		lig3.mirror = true;
		setRotation(lig3, 0F, 0F, 0F);
		lig4 = new ModelRenderer(this, 0, 0);
		lig4.addBox(0F, 0F, 0F, 10, 1, 1);
		lig4.setRotationPoint(-5F, -7F, -6F);
		lig4.setTextureSize(64, 32);
		lig4.mirror = true;
		setRotation(lig4, 0F, 0F, 0F);
		lig5 = new ModelRenderer(this, 20, 3);
		lig5.addBox(0F, 0F, 0F, 1, 1, 4);
		lig5.setRotationPoint(5F, -7F, 2F);
		lig5.setTextureSize(64, 32);
		lig5.mirror = true;
		setRotation(lig5, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		cinnabun.render(f5);
		lig1.render(f5);
		lig2.render(f5);
		lig3.render(f5);
		lig4.render(f5);
		lig5.render(f5);
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
