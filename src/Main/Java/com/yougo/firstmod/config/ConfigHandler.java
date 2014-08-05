package com.yougo.firstmod.config;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigHandler {

    public static void init(File config) {

        Configuration configuration = new Configuration(config);

        try {
            configuration.load();

            boolean configVal = configuration.get(configuration.CATEGORY_GENERAL, "ConfigVal", true, "Hello :D").getBoolean(true);
        }
        catch (Exception e) {

        }
        finally {
            configuration.save();
        }
    }
}
