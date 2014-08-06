package com.yougo.firstmod.init;

import com.yougo.firstmod.item.ItemFM;
import com.yougo.firstmod.item.ItemMapleleaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemFM mapleleaf = new ItemMapleleaf();


    public static void init() {
        GameRegistry.registerItem(mapleleaf, "He he he");
    }
}
