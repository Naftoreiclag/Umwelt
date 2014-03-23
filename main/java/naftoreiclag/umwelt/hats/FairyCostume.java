package naftoreiclag.umwelt.hats;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class FairyCostume extends Hat
{
	private final AngelWings aw;
	private final FairyHornsHat fhh;
	
	public FairyCostume()
	{
		super(null, null);
		
		aw = new AngelWings();
		fhh = new FairyHornsHat();
	}
	
	@Override
	public void render(EntityPlayer player, float prt)
	{
		aw.render(player, prt);
		fhh.render(player, prt);
	}
}
