package com.yougo.firstmod.handler;

import com.yougo.firstmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigHandler {

    public static Configuration configuration;
    public static boolean testval = false;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {

        testval = configuration.getBoolean("configvalue", Configuration.CATEGORY_GENERAL, false, "Ha ha ha ha!");

        if (configuration.hasChanged()) configuration.save();
    }

    @SubscribeEvent
    public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event) {

        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) loadConfiguration();
    }
}

