package naftoreiclag.umwelt;

import java.util.Arrays;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class UmweltModInfo extends DummyModContainer
{
	public UmweltModInfo()
	{
		super(new ModMetadata());
		ModMetadata data = super.getMetadata();
		data.modId = "umwelt";
		data.name = "Umwelt Client Enhancement";
		data.description = "desc";
		data.version = "0.1.0";
		data.url = "";
		data.updateUrl = "";
		data.authorList = Arrays.asList("Naftoreiclag");
		data.credits = "Naftoreiclag";
		data.logoFile = "";
	}

	@Override
	public boolean registerBus(EventBus eventBus, LoadController _)
	{
		//System.out.println("something event bus");
		
		//MinecraftForge.EVENT_BUS.register(new Blahblah());
		
		eventBus.register(this);
		//MinecraftForge.EVENT_BUS.register(this);
		//FMLCommonHandler.instance().bus().register(this);
		
		//eventBus.register(new Blahblah());
		
		return true;
	}

	

	@Subscribe
	public void preInit(FMLPreInitializationEvent e)
	{
		System.out.println("pre init");
	}

	@Subscribe
	public void init(FMLInitializationEvent e)
	{
		System.out.println("init");
	}

	@Subscribe
	public void postInit(FMLPostInitializationEvent e)
	{
		System.out.println("post init");
	}
}
