package naftoreiclag.umwelt.hats;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;

public class HatRegistry
{
	private static Map<String, Hat> hats = new HashMap<String, Hat>();
	
	public static void addHat(String username, Hat hat)
	{
		hats.put(username, hat);
	}
	
	public static void renderFor(EntityPlayer player, float prt)
	{
		Hat h = hats.get(player.getCommandSenderName());
		
		if(h != null)
		{
			h.render(player, prt);
		}
	}
}
