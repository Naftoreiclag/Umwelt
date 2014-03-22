package naftoreiclag.umwelt;

import naftoreiclag.umwelt.hats.HaloHat;
import naftoreiclag.umwelt.hats.HatRegistry;
import naftoreiclag.umwelt.hats.JellyfishHat;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "aaaaaa", name = "ffewfewfewfsad", version = "0.0.0")
public class BasicMdo
{
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		HatRegistry.addHat("Reiclag", new JellyfishHat());
		HatRegistry.addHat("CutiePi", new HaloHat());
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		System.out.println("success");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
}
