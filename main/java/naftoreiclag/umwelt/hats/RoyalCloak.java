package naftoreiclag.umwelt.hats;

import org.lwjgl.opengl.GL11;

import naftoreiclag.umwelt.hats.models.RoyalCloakModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

public class RoyalCloak extends Hat
{

	public RoyalCloak()
	{
		super(new RoyalCloakModel(), new ResourceLocation("umwelt:textures/models/hats/royalcloak.png"));
	}
	
	public void render(EntityPlayer player, float prt)
	{
		if(player.isInvisible())
		{
			return;
		}
		
		float sideToSide = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * prt - (player.prevRenderYawOffset + (player.renderYawOffset - player.prevRenderYawOffset) * prt);
		float lookUpAndDown = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * prt;

        GL11.glPushMatrix();
        double d3 = player.field_71091_bM + (player.field_71094_bP - player.field_71091_bM) * (double)prt - (player.prevPosX + (player.posX - player.prevPosX) * (double)prt);
        double d4 = player.field_71096_bN + (player.field_71095_bQ - player.field_71096_bN) * (double)prt - (player.prevPosY + (player.posY - player.prevPosY) * (double)prt);
        double d0 = player.field_71097_bO + (player.field_71085_bR - player.field_71097_bO) * (double)prt - (player.prevPosZ + (player.posZ - player.prevPosZ) * (double)prt);
        
        float f5 = player.prevRenderYawOffset + (player.renderYawOffset - player.prevRenderYawOffset) * prt;
        double d1 = (double)MathHelper.sin(f5 * (float)Math.PI / 180.0F);
        double d2 = (double)(-MathHelper.cos(f5 * (float)Math.PI / 180.0F));
        float f6 = (float)d4 * 10.0F;

        if (f6 < -6.0F)
        {
            f6 = -6.0F;
        }

        if (f6 > 32.0F)
        {
            f6 = 32.0F;
        }

        float f7 = (float)(d3 * d1 + d0 * d2) * 100.0F;
        float f8 = (float)(d3 * d2 - d0 * d1) * 100.0F;

        if (f7 < 0.0F)
        {
            f7 = 0.0F;
        }

        float f9 = player.prevCameraYaw + (player.cameraYaw - player.prevCameraYaw) * prt;
        f6 += MathHelper.sin((player.prevDistanceWalkedModified + (player.distanceWalkedModified - player.prevDistanceWalkedModified) * prt) * 6.0F) * 32.0F * f9;

        if (player.isSneaking())
        {
            f6 += 25.0F;
        }
		
		Minecraft.getMinecraft().renderEngine.bindTexture(textures);

        GL11.glRotatef(6.0F + f7 / 2.0F + f6, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(f8 / 2.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-f8 / 2.0F, 0.0F, 1.0F, 0.0F);
		this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
	}

}
