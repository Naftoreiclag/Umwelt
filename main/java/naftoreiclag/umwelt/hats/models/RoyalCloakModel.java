package naftoreiclag.umwelt.hats.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class RoyalCloakModel extends ModelBase
{
	// fields
	ModelRenderer drag1;
	ModelRenderer drag2;
	ModelRenderer drag3;
	//ModelRenderer drag4;
	ModelRenderer leftplane;
	ModelRenderer rightplane;

	public RoyalCloakModel()
	{
		textureWidth = 64;
		textureHeight = 64;

		drag1 = new ModelRenderer(this, 0, 0);
		drag1.addBox(-7F, 0F, 0F, 14, 10, 1);
		drag1.setRotationPoint(0F, 0F, 2F);
		drag1.setTextureSize(64, 64);
		drag1.mirror = true;
		setRotation(drag1, 0.2617994F, 0F, 0F);
		drag2 = new ModelRenderer(this, 0, 10);
		drag2.addBox(-7F, 0F, 0F, 14, 10, 1);
		drag2.setRotationPoint(0F, 9.5F, 4.5F);
		drag2.setTextureSize(64, 64);
		drag2.mirror = true;
		setRotation(drag2, 0.5235988F, 0F, 0F);
		drag3 = new ModelRenderer(this, 0, 20);
		drag3.addBox(-7F, 0F, 0F, 14, 9, 1);
		drag3.setRotationPoint(0F, 18F, 9.5F);
		drag3.setTextureSize(64, 64);
		drag3.mirror = true;
		setRotation(drag3, 0.7853982F, 0F, 0F);
		/*drag4 = new ModelRenderer(this, 0, 29);
		drag4.addBox(-7F, 0F, 0F, 14, 10, 1);
		drag4.setRotationPoint(0F, 24F, 16F);
		drag4.setTextureSize(64, 64);
		drag4.mirror = true;
		setRotation(drag4, 1.570796F, 0F, 0F);*/
		leftplane = new ModelRenderer(this, 0, 26);
		leftplane.addBox(0F, 0F, 0F, 0, 24, 14);
		leftplane.setRotationPoint(-7F, 0F, 2F);
		leftplane.setTextureSize(64, 64);
		leftplane.mirror = true;
		setRotation(leftplane, 0F, 0F, 0F);
		rightplane = new ModelRenderer(this, 28, 26);
		rightplane.addBox(7F, 0F, 0F, 0, 24, 14);
		rightplane.setRotationPoint(0F, 0F, 2F);
		rightplane.setTextureSize(64, 64);
		rightplane.mirror = true;
		setRotation(rightplane, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		drag1.render(f5);
		drag2.render(f5);
		drag3.render(f5);
		//drag4.render(f5);
		leftplane.render(f5);
		rightplane.render(f5);
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
