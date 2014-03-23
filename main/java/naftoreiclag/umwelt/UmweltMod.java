package naftoreiclag.umwelt;

import java.util.Map;

import naftoreiclag.umwelt.hats.AngelCostume;
import naftoreiclag.umwelt.hats.HaloHat;
import naftoreiclag.umwelt.hats.HatRegistry;
import naftoreiclag.umwelt.hats.HellHornsHat;
import naftoreiclag.umwelt.hats.JellyfishHat;
import naftoreiclag.umwelt.hats.PlayerRenderListener;
import naftoreiclag.umwelt.hats.RoyalCloak;
import net.minecraft.launchwrapper.IClassTransformer;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.IFMLCallHook;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

@Mod(modid = "umwelt", name = "Umwelt Client Enhancement", version = "0.0.0")
public class UmweltMod implements IFMLLoadingPlugin, IClassTransformer, IFMLCallHook
{
	// Is this the obfuscated environment
	protected static boolean obfuscated;
	
	// Tell Forge that I'll be doing all of these things
	@Override
	public String[] getASMTransformerClass() { return new String[] { UmweltMod.class.getName() }; } // Transformer
	@Override
	public String getModContainerClass() { return null; } // Mod list entry
	@Override
	public String getSetupClass() { return UmweltMod.class.getName(); } // Super-early Initializer
	@Override
	public String getAccessTransformerClass() { return null; } // Except this one

	// What is this??? DO NOT GET RID OF IT
	@Override
	public Void call() { return null; }
	
	// Super-early Initialize
	@Override
	public void injectData(Map<String, Object> mcdata)
	{
		// Check if we are obfuscated
		
		Object o = mcdata.get("runtimeDeobfuscationEnabled");
		
		if(o == null)
		{
			obfuscated = false;
		}
		else
		{
			obfuscated = (Boolean) o;
		}
	}
	
	@Override
	public byte[] transform(String className, String _, byte[] basicClass)
	{
		/*
		if(className.equals("net.minecraft.client.renderer.entity.RenderPlayer"))
		{
			return Earsforme.apply(basicClass, false);
		}
		*/
		
		return basicClass;
	}
	
	// Pre Initialize
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		// Gotta have those hats
		
		MinecraftForge.EVENT_BUS.register(new PlayerRenderListener());
		
		HatRegistry.addHat("Reiclag", new JellyfishHat());
		HatRegistry.addHat("CutiePi", new AngelCostume());
		HatRegistry.addHat("TrinityKing_", new RoyalCloak());
		HatRegistry.addHat("NanoStar12", new HellHornsHat());
		
		System.out.println("pre init");
	}

	// Initialize
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		System.out.println("init");
	}

	// Post Initialize
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		System.out.println("post init");
	}
}
