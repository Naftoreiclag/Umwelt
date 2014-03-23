package naftoreiclag.umwelt.hats;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class AngelCostume extends Hat
{
	private final AngelWings aw;
	private final HaloHat hh;
	
	public AngelCostume()
	{
		super(null, null);
		
		aw = new AngelWings();
		hh = new HaloHat();
	}
	
	@Override
	public void render(EntityPlayer player, float prt)
	{
		aw.render(player, prt);
		hh.render(player, prt);
	}
}
