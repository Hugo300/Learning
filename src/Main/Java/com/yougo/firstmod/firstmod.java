package com.yougo.firstmod;
import com.yougo.firstmod.handler.ConfigHandler;
import com.yougo.firstmod.init.ModItems;
import com.yougo.firstmod.proxy.*;
import com.yougo.firstmod.reference.Reference;
import com.yougo.firstmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GuiFacoryClass)
public class firstmod {

    @Mod.Instance(Reference.MOD_ID)
    public static firstmod instance;

    @SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent e) {

        ConfigHandler.init(e.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        ModItems.init();
        LogHelper.info("Pre Initialization complete!");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        LogHelper.info("Initialization complete!");
    }

    @Mod.EventHandler
    public void posinit(FMLPostInitializationEvent e) {
        LogHelper.info("Post Initialization complete!");
    }
}
