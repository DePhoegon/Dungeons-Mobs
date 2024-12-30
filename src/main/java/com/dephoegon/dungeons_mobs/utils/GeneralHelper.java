package com.dephoegon.dungeons_mobs.utils;

import net.minecraft.resources.ResourceLocation;

import static com.dephoegon.dungeons_mobs.DungeonsMobs.MODID;

public class GeneralHelper {
    public static ResourceLocation modLoc(String resource) {
        return new ResourceLocation(MODID, resource);
    }
}
