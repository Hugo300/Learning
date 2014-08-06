package com.yougo.firstmod.init;

import com.yougo.firstmod.block.BlockFM;
import com.yougo.firstmod.block.BlockMapleWood;
import com.yougo.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockFM MapleWood = new BlockMapleWood();

    public static void init() {
        GameRegistry.registerBlock(MapleWood, "MapleWood");
    }

}
