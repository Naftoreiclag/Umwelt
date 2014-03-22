package naftoreiclag.umwelt;

import naftoreiclag.umwelt.hats.HatRegistry;
import net.minecraftforge.client.event.RenderPlayerEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Blahblah
{
	@SubscribeEvent
	public void onRenderPlayer(RenderPlayerEvent.Specials.Post event)
	{
		HatRegistry.renderFor(event.entityPlayer, event.partialRenderTick);
	}
}
