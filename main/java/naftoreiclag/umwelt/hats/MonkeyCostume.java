package naftoreiclag.umwelt.hats;

import net.minecraft.entity.player.EntityPlayer;

public class MonkeyCostume extends Hat
{
	private final MonkeyEars me;
	
	public MonkeyCostume()
	{
		super(null, null);
		
		me = new MonkeyEars();
	}
	
	@Override
	public void render(EntityPlayer player, float prt)
	{
		me.render(player, prt);
	}
}
