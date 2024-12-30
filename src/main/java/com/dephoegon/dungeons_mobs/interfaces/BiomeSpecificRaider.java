package com.dephoegon.dungeons_mobs.interfaces;

import com.dephoegon.dungeons_mobs.mod.ModEntityTypes;
import com.dephoegon.dungeons_mobs.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.level.biome.Biome;

public enum BiomeSpecificRaider {
    MOUNTAINEER(
            ModEntityTypes.MOUNTAINEER.get(),
            EntityType.VINDICATOR,
            BiomeTags.MOUNTAINEEER_RAIDS_IN),
    ICEOLOGER(
            ModEntityTypes.ICEOLOGER.get(),
            EntityType.EVOKER,
            BiomeTags.ICEOLOGER_RAIDS_IN),
    WINDCALLER(
            ModEntityTypes.WINDCALLER.get(),
            EntityType.EVOKER,
            BiomeTags.WINDCALLER_RAIDS_IN),
    SQUALL_GOLEM(
            ModEntityTypes.SQUALL_GOLEM.get(),
            EntityType.RAVAGER,
            BiomeTags.SQUALL_GOLEM_RAIDS_IN),

    /*,
    ILLUSIONER(
            EntityType.ILLUSIONER,
            EntityType.ILLUSIONER,
            DungeonsMobsConfig.COMMON.ILLUSIONER_BIOME_TYPES.get())
     */;

    private final EntityType<? extends Raider> entityType;
    private final EntityType<? extends Raider> equivalentType;
    private final TagKey<Biome> biomeTag;

    BiomeSpecificRaider(EntityType<? extends Raider> entityTypeIn, EntityType<? extends Raider> equivalentTypeIn, TagKey<Biome> biomeTag) {
        this.entityType = entityTypeIn;
        this.equivalentType = equivalentTypeIn;
        this.biomeTag = biomeTag;
    }

    public EntityType<? extends Raider> getType() {
        return this.entityType;
    }

    public EntityType<? extends Raider> getEquivalentType() {
        return this.equivalentType;
    }

    public TagKey<Biome> getBiomeTag() {
        return biomeTag;
    }
}
