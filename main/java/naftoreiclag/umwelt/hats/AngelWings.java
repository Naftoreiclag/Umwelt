package naftoreiclag.umwelt.hats;

import org.lwjgl.opengl.GL11;

import naftoreiclag.umwelt.hats.models.AngelWingsModel;
import naftoreiclag.umwelt.hats.models.HaloHatModel;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class AngelWings extends Hat
{
	double flappy;
	long lastTime;
	
	public AngelWings()
	{
		super(new AngelWingsModel(), new ResourceLocation("umwelt:textures/models/hats/angelWings.png"));
	
		lastTime = Minecraft.getSystemTime();
	}
	
	public void render(EntityPlayer player, float prt)
	{
		if(player.isInvisible())
		{
			return;
		}
		
		boolean flying = player.capabilities.isFlying;
		
		double diff = Minecraft.getSystemTime() - lastTime;
		lastTime = Minecraft.getSystemTime();
		
		diff /= 120d;
		
		if(flying)
		{
			flappy = (flappy + diff) % (Math.PI * 2);
		}
		else
		{
			flappy = flappy * 0.9d;
		}
		
		
		Minecraft.getMinecraft().renderEngine.bindTexture(textures);

		renderAWing(flying, false);
		renderAWing(flying, true);
	}
	
	private void renderAWing(boolean flying, boolean otherWing)
	{
		GL11.glPushMatrix();
		
		if(otherWing)
		{
	        GL11.glRotatef(180f, 0.0f, 1.0f, 0.0F);
	        GL11.glTranslatef(0.0f, -0.125f, -0.625F);
		}
		
		if(otherWing)
		{
	        GL11.glRotatef(-15f, 1.0F, 0.0F, 0.0F);
		}
		else
		{
	        GL11.glRotatef(15f, 1.0F, 0.0F, 0.0F);
		}
		
		if(otherWing)
		{
			GL11.glTranslatef(0.0f, 0.0f, 0.125F);
		}
		else
		{
			GL11.glTranslatef(0.0f, 0.0f, -0.125F);
		}
		
        GL11.glRotatef(-30f + ((float) (30d * Math.cos(flappy))), 0.0F, 0.0F, 1.0F);
        
        
		this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
	}
}
