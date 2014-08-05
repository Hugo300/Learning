package com.yougo.firstmod;
import com.yougo.firstmod.config.ConfigHandler;
import com.yougo.firstmod.proxy.*;
import com.yougo.firstmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class firstmod {

    @Mod.Instance(Reference.MOD_ID)
    public static firstmod instance;

    @SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent e) {

        ConfigHandler.init(e.getSuggestedConfigurationFile());

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

    }

    @Mod.EventHandler
    public void posinit(FMLPostInitializationEvent e) {

    }
}
