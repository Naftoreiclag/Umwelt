package naftoreiclag.umwelt.hats.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class JellyfishHatModel extends ModelBase
{
	// fields
	ModelRenderer Shape2;
	ModelRenderer Tentacle1;
	ModelRenderer Tentacle2;
	ModelRenderer Tentacle3;
	ModelRenderer Tentacle4;
	ModelRenderer Tentacle5;
	ModelRenderer Tentacle6;
	ModelRenderer Tentacle7;
	ModelRenderer Tentacle8;
	ModelRenderer Skirt;

	public JellyfishHatModel()
	{
		textureWidth = 64;
		textureHeight = 32;

		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(-3F, 0F, -3F, 6, 6, 6);
		Shape2.setRotationPoint(0F, -14F, 1F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, -0.1745329F, 0F, 0F);
		Tentacle1 = new ModelRenderer(this, 60, 0);
		Tentacle1.addBox(0F, 0F, 0F, 1, 7, 1);
		Tentacle1.setRotationPoint(4F, -9F, 0F);
		Tentacle1.setTextureSize(64, 32);
		Tentacle1.mirror = true;
		setRotation(Tentacle1, 0F, 0F, 0F);
		Tentacle2 = new ModelRenderer(this, 60, 0);
		Tentacle2.addBox(0F, 0F, 0F, 1, 7, 1);
		Tentacle2.setRotationPoint(-5F, -9F, 0F);
		Tentacle2.setTextureSize(64, 32);
		Tentacle2.mirror = true;
		setRotation(Tentacle2, 0F, 0F, 0F);
		Tentacle3 = new ModelRenderer(this, 60, 0);
		Tentacle3.addBox(0F, 0F, 0F, 1, 6, 1);
		Tentacle3.setRotationPoint(-5F, -9F, -3F);
		Tentacle3.setTextureSize(64, 32);
		Tentacle3.mirror = true;
		setRotation(Tentacle3, 0F, 0F, 0F);
		Tentacle4 = new ModelRenderer(this, 60, 0);
		Tentacle4.addBox(0F, 0F, 0F, 1, 5, 1);
		Tentacle4.setRotationPoint(4F, -9F, -3F);
		Tentacle4.setTextureSize(64, 32);
		Tentacle4.mirror = true;
		setRotation(Tentacle4, 0F, 0F, 0F);
		Tentacle5 = new ModelRenderer(this, 60, 0);
		Tentacle5.addBox(0F, 0F, 0F, 1, 4, 1);
		Tentacle5.setRotationPoint(-3F, -9F, -5F);
		Tentacle5.setTextureSize(64, 32);
		Tentacle5.mirror = true;
		setRotation(Tentacle5, 0F, 0F, 0F);
		Tentacle6 = new ModelRenderer(this, 60, 0);
		Tentacle6.addBox(0F, 0F, 0F, 1, 4, 1);
		Tentacle6.setRotationPoint(2F, -9F, -5F);
		Tentacle6.setTextureSize(64, 32);
		Tentacle6.mirror = true;
		setRotation(Tentacle6, 0F, 0F, 0F);
		Tentacle7 = new ModelRenderer(this, 60, 0);
		Tentacle7.addBox(0F, 0F, 0F, 1, 8, 1);
		Tentacle7.setRotationPoint(1F, -9F, 4.133333F);
		Tentacle7.setTextureSize(64, 32);
		Tentacle7.mirror = true;
		setRotation(Tentacle7, 0F, 0F, 0F);
		Tentacle8 = new ModelRenderer(this, 60, 0);
		Tentacle8.addBox(0F, 0F, 0F, 1, 6, 1);
		Tentacle8.setRotationPoint(-2F, -9F, 4F);
		Tentacle8.setTextureSize(64, 32);
		Tentacle8.mirror = true;
		setRotation(Tentacle8, 0F, 0F, 0F);
		Skirt = new ModelRenderer(this, 24, 0);
		Skirt.addBox(-4F, 0F, -4F, 8, 1, 8);
		Skirt.setRotationPoint(0F, -9F, 0F);
		Skirt.setTextureSize(64, 32);
		Skirt.mirror = true;
		setRotation(Skirt, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape2.render(f5);
		Tentacle1.render(f5);
		Tentacle2.render(f5);
		Tentacle3.render(f5);
		Tentacle4.render(f5);
		Tentacle5.render(f5);
		Tentacle6.render(f5);
		Tentacle7.render(f5);
		Tentacle8.render(f5);
		Skirt.render(f5);
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
