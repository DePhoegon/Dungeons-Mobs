package com.dephoegon.dungeons_mobs.client.renderer.water;

import com.dephoegon.dungeons_mobs.DungeonsMobs;
import com.dephoegon.dungeons_mobs.client.models.jungle.PoisonQuillVineModel;
import com.dephoegon.dungeons_mobs.client.renderer.jungle.AbstractVineRenderer;
import com.dephoegon.dungeons_mobs.client.renderer.layers.GeoEyeLayer;
import com.dephoegon.dungeons_mobs.entities.jungle.AbstractVineEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import static com.dephoegon.dungeons_mobs.DungeonsMobs.MODID;

@OnlyIn(Dist.CLIENT)
public class PoisonAnemoneRenderer extends AbstractVineRenderer {

    private static final ResourceLocation POISON_ANEMONE_TEXTURE = new ResourceLocation(MODID, "textures/entity/ocean/poison_anemone.png");

    @SuppressWarnings("unchecked")
    public PoisonAnemoneRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PoisonQuillVineModel());
        this.addLayer(new GeoEyeLayer(this, new ResourceLocation(DungeonsMobs.MODID, "textures/entity/ocean/quick_growing_kelp_glow.png")));
    }

    @Override
    public ResourceLocation getTextureLocation(AbstractVineEntity entity) {
        return POISON_ANEMONE_TEXTURE;
    }
}