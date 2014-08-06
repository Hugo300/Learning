package com.yougo.firstmod.init;

import com.yougo.firstmod.item.ItemFM;
import com.yougo.firstmod.item.ItemMapleleaf;
import com.yougo.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemFM mapleleaf = new ItemMapleleaf();

    public static void init() {
        GameRegistry.registerItem(mapleleaf, "He he he");
    }
}
