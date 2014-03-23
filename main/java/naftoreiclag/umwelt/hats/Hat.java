package naftoreiclag.umwelt.hats;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public abstract class Hat
{
	protected final ModelBase model;
	protected final ResourceLocation textures;
	
	public Hat(ModelBase model, ResourceLocation textures)
	{
		this.model = model;
		this.textures = textures;
	}
	
	public void render(EntityPlayer player, float prt)
	{
		if(player.isInvisible())
		{
			return;
		}
		
		float sideToSide = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * prt - (player.prevRenderYawOffset + (player.renderYawOffset - player.prevRenderYawOffset) * prt);
		float lookUpAndDown = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * prt;

		Minecraft.getMinecraft().renderEngine.bindTexture(textures);

		GL11.glPushMatrix();

		GL11.glRotatef(sideToSide, 0.0F, 1.0F, 0.0F); // this works for the head moving side-to-side
		GL11.glRotatef(lookUpAndDown, 1.0F, 0.0F, 0.0F); // this works for the head moving up/down
        
		this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
	}
}
