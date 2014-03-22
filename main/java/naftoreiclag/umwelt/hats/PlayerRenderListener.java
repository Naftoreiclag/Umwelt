package naftoreiclag.umwelt.hats;

import net.minecraftforge.client.event.RenderPlayerEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PlayerRenderListener
{
	@SubscribeEvent
	public void onRenderPlayer(RenderPlayerEvent.Specials.Post event)
	{
		HatRegistry.renderFor(event.entityPlayer, event.partialRenderTick);
	}
}
