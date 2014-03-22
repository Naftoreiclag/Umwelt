package naftoreiclag.umwelt;

import java.util.Map;

import naftoreiclag.umwelt.patches.ChickenLureFixPatcher;
import naftoreiclag.umwelt.patches.Earsforme;
import net.minecraft.launchwrapper.IClassTransformer;
import net.minecraftforge.client.event.RenderPlayerEvent;

import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.IFMLCallHook;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

public class UmweltMod implements IFMLLoadingPlugin, IClassTransformer, IFMLCallHook
{
	protected static boolean obfuscated;
	
	// Tell Forge that I'll be doing all of these things
	@Override
	public String[] getASMTransformerClass() { return new String[] { UmweltMod.class.getName() }; } // Transformer
	@Override
	public String getModContainerClass() { return UmweltModInfo.class.getName(); } // Mod list entry
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
}
