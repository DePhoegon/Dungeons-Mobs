package com.dephoegon.dungeons_mobs.worldgen;

import com.dephoegon.dungeons_mobs.entities.blaze.WildfireEntity;
import com.dephoegon.dungeons_mobs.entities.creepers.IcyCreeperEntity;
import com.dephoegon.dungeons_mobs.entities.ender.BlastlingEntity;
import com.dephoegon.dungeons_mobs.entities.ender.EndersentEntity;
import com.dephoegon.dungeons_mobs.entities.ender.SnarelingEntity;
import com.dephoegon.dungeons_mobs.entities.ender.WatchlingEntity;
import com.dephoegon.dungeons_mobs.entities.golem.SquallGolemEntity;
import com.dephoegon.dungeons_mobs.entities.illagers.*;
import com.dephoegon.dungeons_mobs.entities.undead.*;
import com.infamous.dungeons_mobs.entities.illagers.*;
import com.dephoegon.dungeons_mobs.entities.jungle.LeapleafEntity;
import com.dephoegon.dungeons_mobs.entities.jungle.PoisonQuillVineEntity;
import com.dephoegon.dungeons_mobs.entities.jungle.QuickGrowingVineEntity;
import com.dephoegon.dungeons_mobs.entities.jungle.WhispererEntity;
import com.dephoegon.dungeons_mobs.entities.redstone.RedstoneCubeEntity;
import com.dephoegon.dungeons_mobs.entities.redstone.RedstoneGolemEntity;
import com.dephoegon.dungeons_mobs.entities.slime.ConjuredSlimeEntity;
import com.dephoegon.dungeons_mobs.entities.summonables.GeomancerBombEntity;
import com.dephoegon.dungeons_mobs.entities.summonables.GeomancerWallEntity;
import com.infamous.dungeons_mobs.entities.undead.*;
import com.dephoegon.dungeons_mobs.entities.water.DrownedNecromancerEntity;
import com.dephoegon.dungeons_mobs.entities.water.PoisonAnemoneEntity;
import com.dephoegon.dungeons_mobs.entities.water.QuickGrowingKelpEntity;
import com.dephoegon.dungeons_mobs.entities.water.SunkenSkeletonEntity;
import com.dephoegon.dungeons_mobs.mod.ModEntityTypes;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.dephoegon.dungeons_mobs.DungeonsMobs.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityTypeAttributes {

    @SubscribeEvent
    public static void initEntityTypeAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.JUNGLE_ZOMBIE.get(), JungleZombieEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.FROZEN_ZOMBIE.get(), FrozenZombieEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.MOSSY_SKELETON.get(), MossySkeletonEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.SKELETON_VANGUARD.get(), SkeletonVanguardEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.NECROMANCER.get(), NecromancerEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.ROYAL_GUARD.get(), RoyalGuardEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.MOUNTAINEER.get(), MountaineerEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.ICEOLOGER.get(), IceologerEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.GEOMANCER.get(), GeomancerEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.ILLUSIONER.get(), DungeonsIllusionerEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.ILLUSIONER_CLONE.get(), IllusionerCloneEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.WINDCALLER.get(), WindcallerEntity.setCustomAttributes().build());
//        event.put(ModEntityTypes.ENCHANTER.get(), EnchanterEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.MAGE.get(), MageEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.MAGE_CLONE.get(), MageCloneEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.ICY_CREEPER.get(), IcyCreeperEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.WRAITH.get(), WraithEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.CONJURED_SLIME.get(), ConjuredSlimeEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.REDSTONE_CUBE.get(), RedstoneCubeEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.REDSTONE_GOLEM.get(), RedstoneGolemEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.WHISPERER.get(), WhispererEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.LEAPLEAF.get(), LeapleafEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.QUICK_GROWING_VINE.get(), QuickGrowingVineEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.POISON_QUILL_VINE.get(), PoisonQuillVineEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.SQUALL_GOLEM.get(), SquallGolemEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.GEOMANCER_WALL.get(), GeomancerWallEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.GEOMANCER_BOMB.get(), GeomancerBombEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.FUNGUS_THROWER.get(), Piglin.createAttributes().build());
        event.put(ModEntityTypes.ZOMBIFIED_FUNGUS_THROWER.get(), ZombifiedPiglin.createAttributes().build());

        event.put(ModEntityTypes.DROWNED_NECROMANCER.get(), DrownedNecromancerEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.SUNKEN_SKELETON.get(), SunkenSkeletonEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.WAVEWHISPERER.get(), WhispererEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.QUICK_GROWING_KELP.get(), QuickGrowingKelpEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.POISON_ANEMONE.get(), PoisonAnemoneEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.ENDERSENT.get(), EndersentEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.BLASTLING.get(), BlastlingEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.WATCHLING.get(), WatchlingEntity.setCustomAttributes().build());
        event.put(ModEntityTypes.SNARELING.get(), SnarelingEntity.setCustomAttributes().build());

        event.put(ModEntityTypes.WILDFIRE.get(), WildfireEntity.setCustomAttributes().build());

    }
}
