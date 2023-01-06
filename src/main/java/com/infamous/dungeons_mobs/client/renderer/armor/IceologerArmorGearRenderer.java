package com.infamous.dungeons_mobs.client.renderer.armor;

import com.infamous.dungeons_libraries.client.renderer.gearconfig.ArmorGearRenderer;
import com.infamous.dungeons_mobs.client.models.armor.IceologerArmorGearModel;
import com.infamous.dungeons_mobs.items.armor.IceologerArmorGear;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceologerArmorGearRenderer extends ArmorGearRenderer<IceologerArmorGear> {

    public IceologerArmorGearRenderer() {
        super(new IceologerArmorGearModel<>());
    }

    @Override
    public void render(float partialTicks, PoseStack stack, VertexConsumer bufferIn, int packedLightIn) {

        AnimatedGeoModel<IceologerArmorGear> geoModelProvider = getGeoModelProvider();
        if(geoModelProvider instanceof IceologerArmorGearModel){
            ((IceologerArmorGearModel<IceologerArmorGear>) geoModelProvider).setWearer(this.entityLiving);
        }
        super.render(partialTicks, stack, bufferIn, packedLightIn);
    }
}
