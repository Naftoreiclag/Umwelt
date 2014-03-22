package naftoreiclag.umwelt;

import java.util.Map;

import naftoreiclag.umwelt.hats.HaloHat;
import naftoreiclag.umwelt.hats.HatRegistry;
import naftoreiclag.umwelt.hats.JellyfishHat;
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

	// ???
	@Override
	public Void call() { return null; }
	
	// Super-early Initialize
	@Override
	public void injectData(Map<String, Object> mcdata)
	{
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
		}*/
		
		return basicClass;
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		MinecraftForge.EVENT_BUS.register(new Blahblah());
		
		HatRegistry.addHat("Reiclag", new JellyfishHat());
		HatRegistry.addHat("CutiePi", new HaloHat());
		
		System.out.println("pre init");
	}

	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		System.out.println("init");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		System.out.println("post init");
	}
}
