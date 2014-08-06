package com.yougo.firstmod.client.gui;

import com.yougo.firstmod.handler.ConfigHandler;
import com.yougo.firstmod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class GuiConfiguration extends GuiConfig {

    public GuiConfiguration(GuiScreen guiScreen) {
        super(guiScreen, new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
    }
}
