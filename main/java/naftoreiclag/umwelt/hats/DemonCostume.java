package naftoreiclag.umwelt.hats;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class DemonCostume extends Hat
{
	private final DarkAngelWings daw;
	private final HellHornsHat hhh;
	
	public DemonCostume()
	{
		super(null, null);
		
		daw = new DarkAngelWings();
		hhh = new HellHornsHat();
	}
	
	@Override
	public void render(EntityPlayer player, float prt)
	{
		daw.render(player, prt);
		hhh.render(player, prt);
	}
}
