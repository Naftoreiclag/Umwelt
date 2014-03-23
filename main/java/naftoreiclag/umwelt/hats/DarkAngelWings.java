package naftoreiclag.umwelt.hats;

import org.lwjgl.opengl.GL11;

import naftoreiclag.umwelt.hats.models.AngelWingsModel;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class DarkAngelWings extends AngelWings
{
	public DarkAngelWings()
	{
		super(new ResourceLocation("umwelt:textures/models/hats/darkAngelWings.png"));
	}
}
