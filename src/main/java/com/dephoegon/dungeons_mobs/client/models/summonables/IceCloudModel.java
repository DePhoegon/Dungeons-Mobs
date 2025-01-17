package com.dephoegon.dungeons_mobs.client.models.summonables;

import com.dephoegon.dungeons_mobs.DungeonsMobs;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceCloudModel extends AnimatedGeoModel {

    @Override
    public ResourceLocation getAnimationResource(Object entity) {
        return new ResourceLocation(DungeonsMobs.MODID, "animations/ice_chunk.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(Object entity) {
        return new ResourceLocation(DungeonsMobs.MODID, "geo/ice_chunk.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Object entity) {
        return new ResourceLocation(DungeonsMobs.MODID, "textures/entity/ice_chunk.png");
    }
}