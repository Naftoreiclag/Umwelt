package naftoreiclag.umwelt;

import org.lwjgl.opengl.GL11;

import naftoreiclag.umwelt.hats.HatRegistry;
import naftoreiclag.umwelt.hats.models.JellyfishHatModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Blahblah
{
	ResourceLocation textures;
	ModelBase potato;
	
	public Blahblah()
	{
		textures = (new ResourceLocation("umwelt:textures/models/jelly.png"));
		potato = new JellyfishHatModel();
		
		System.out.println("new blaha blahadfad");
	}
	
	@SubscribeEvent
	public void onRenderPlayer(RenderPlayerEvent.Specials.Post event)
	{
		HatRegistry.renderFor(event.entityPlayer, event.partialRenderTick);
		/*
		
		EntityPlayer player = event.entityPlayer;
		float something = event.partialRenderTick;

		float sideToSide = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * something - (player.prevRenderYawOffset + (player.renderYawOffset - player.prevRenderYawOffset) * something);
		float lookUpAndDown = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * something;

		Minecraft.getMinecraft().renderEngine.bindTexture(textures);

		GL11.glPushMatrix();

		GL11.glRotatef(sideToSide, 0.0F, 1.0F, 0.0F); // this works for the head moving side-to-side
		GL11.glRotatef(lookUpAndDown, 1.0F, 0.0F, 0.0F); // this works for the head moving up/down

        //GL11.glTranslatef(0.0F, -0.25F, 0.0F);
        
		this.potato.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
		*/
	}
	/*
	@SubscribeEvent
	public void onRenderPlayer(RenderPlayerEvent.Specials.Post e)
	{
		EntityPlayer par1AbstractClientPlayer = e.entityPlayer;
		float par2 = e.partialRenderTick;
		
        float f10 = par1AbstractClientPlayer.prevRotationYaw + (par1AbstractClientPlayer.rotationYaw - par1AbstractClientPlayer.prevRotationYaw) * par2 - (par1AbstractClientPlayer.prevRenderYawOffset + (par1AbstractClientPlayer.renderYawOffset - par1AbstractClientPlayer.prevRenderYawOffset) * par2);
        float f2 = par1AbstractClientPlayer.prevRotationPitch + (par1AbstractClientPlayer.rotationPitch - par1AbstractClientPlayer.prevRotationPitch) * par2;

        Minecraft.getMinecraft().renderEngine.bindTexture(textures);
        
        GL11.glPushMatrix();
        GL11.glRotatef(f10, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(f2, 1.0F, 0.0F, 0.0F);
        GL11.glTranslatef(0.0F, -0.375F, 0.0F);
        GL11.glRotatef(-f2, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(-f10, 0.0F, 1.0F, 0.0F);
        float f3 = 1.3333334F;
        GL11.glScalef(f3, f3, f3);
        this.potato.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
	}
	*/
}
