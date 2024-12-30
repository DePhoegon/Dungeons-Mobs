package com.dephoegon.dungeons_mobs.mod;

import com.dephoegon.dungeons_mobs.items.BlueNethershroomItem;
import com.infamous.dungeons_libraries.DungeonsLibraries;
import com.infamous.dungeons_libraries.items.gearconfig.ArmorGear;
import com.infamous.dungeons_libraries.items.gearconfig.ArmorSet;
import com.dephoegon.dungeons_mobs.DungeonsMobs;
import com.infamous.dungeons_mobs.items.*;
import com.infamous.dungeons_mobs.items.shield.RoyalGuardShieldItem;
import com.dephoegon.dungeons_mobs.utils.GeneralHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.dephoegon.dungeons_mobs.DungeonsMobs.MODID;


public class ModItems {
    private static final ResourceLocation DEFAULT_ANIMATION_RESOURCE = new ResourceLocation(DungeonsLibraries.MODID, "animations/armor/armor_default.animation.json");
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final Map<ResourceLocation, RegistryObject<Item>> ARTIFACTS = new HashMap<>();

    public static final Item.Properties ARMOR_PROPERTIES = new Item.Properties().tab(DungeonsMobs.DUNGEONS_MOBS_ITEMS);
    public static final Map<ResourceLocation, RegistryObject<Item>> ARMORS = new HashMap<>();

    // SHIELD
    public static final RegistryObject<Item> ROYAL_GUARD_SHIELD = ITEMS.register("royal_guard_shield",
            () -> new RoyalGuardShieldItem(new Item.Properties().tab(DungeonsMobs.DUNGEONS_MOBS_ITEMS).durability(336)));

    public static final RegistryObject<Item> VANGUARD_SHIELD = ITEMS.register("vanguard_shield",
            () -> new VanguardShieldItem(new Item.Properties().tab(DungeonsMobs.DUNGEONS_MOBS_ITEMS).durability(336)));

    // HELMETS
    /*
    public static final RegistryObject<Item> GOLD_PILLAGER_HELMET = registerArmor("gold_pillager_helmet",
            () -> new ArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, null,
                    new ResourceLocation(MODID, "geo/armor/pillager_helmet.geo.json"),
                    new ResourceLocation(MODID, "textures/models/armor/gold_pillager_helmet.png"),
                    DEFAULT_ANIMATION_RESOURCE));

    public static final RegistryObject<Item> DIAMOND_PILLAGER_HELMET = ITEMS.register("diamond_pillager_helmet",
            () -> new ArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, null,
                    new ResourceLocation(MODID, "geo/armor/pillager_helmet.geo.json"),
                    new ResourceLocation(MODID, "textures/models/armor/diamond_pillager_helmet.png"),
                    DEFAULT_ANIMATION_RESOURCE));

    public static final RegistryObject<Item> GOLD_VINDICATOR_HELMET = ITEMS.register("gold_vindicator_helmet",
            () -> new ArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, null,
                    new ResourceLocation(MODID, "geo/armor/vindicator_helmet.geo.json"),
                    new ResourceLocation(MODID, "textures/models/armor/gold_vindicator_helmet.png"),
                    DEFAULT_ANIMATION_RESOURCE));

    public static final RegistryObject<Item> DIAMOND_VINDICATOR_HELMET = ITEMS.register("diamond_vindicator_helmet",
            () -> new ArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, null,
                    new ResourceLocation(MODID, "geo/armor/vindicator_helmet.geo.json"),
                    new ResourceLocation(MODID, "textures/models/armor/diamond_vindicator_helmet.png"),
                    DEFAULT_ANIMATION_RESOURCE));
    */

    public static final RegistryObject<Item> NETHERITE_PIGLIN_HELMET = ITEMS.register("netherite_piglin_helmet",
            () -> new PiglinHelmetItem(CustomArmorMaterial.PURE_NETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(DungeonsMobs.DUNGEONS_MOBS_ITEMS)));
    public static final RegistryObject<Item> CRACKED_NETHERITE_PIGLIN_HELMET = ITEMS.register("cracked_netherite_piglin_helmet",
            () -> new PiglinHelmetItem(CustomArmorMaterial.PURE_NETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(DungeonsMobs.DUNGEONS_MOBS_ITEMS)));
    public static final RegistryObject<Item> GOLD_PIGLIN_HELMET = ITEMS.register("gold_piglin_helmet",
            () -> new PiglinHelmetItem(ArmorMaterials.GOLD, EquipmentSlot.HEAD, new Item.Properties().tab(DungeonsMobs.DUNGEONS_MOBS_ITEMS)));
    public static final RegistryObject<Item> CRACKED_GOLD_PIGLIN_HELMET = ITEMS.register("cracked_gold_piglin_helmet",
            () -> new PiglinHelmetItem(ArmorMaterials.GOLD, EquipmentSlot.HEAD, new Item.Properties().tab(DungeonsMobs.DUNGEONS_MOBS_ITEMS)));
    public static final ArmorSet DROWNED_NECROMANCER_ARMOR = registerArmorSetDrownedNecromancer("drowned_necromancer_armor", "drowned_necromancer_helmet", "drowned_necromancer_chestplate", "drowned_necromancer_leggings", null);
    public static final ArmorSet GEOMANCER_ARMOR = registerArmorSet("geomancer_armor", "geomancer_helmet", "geomancer_chestplate", null, null);
    public static final ArmorSet ICEOLOGER_ARMOR = registerArmorSetIceologer("iceologer_armor", "iceologer_helmet", "iceologer_chestplate", "iceologer_leggings", "iceologer_boots");
    public static final ArmorSet ILLUSIONER_ARMOR = registerArmorSetIllusioner("illusioner_armor", "illusioner_helmet", "illusioner_chestplate", "illusioner_leggings", "illusioner_boots");
    public static final ArmorSet NECROMANCER_ARMOR = registerArmorSetNecromancerArmor("necromancer_armor", "necromancer_helmet", "necromancer_chestplate", "necromancer_leggings", null);
    public static final ArmorSet NETHERPLATE_ARMOR = registerArmorSet("netherplate_armor", "netherplate_helmet", null, null, null);
    public static final ArmorSet ROYAL_GUARD_ARMOR = registerArmorSet("royal_guard_armor", "royal_guard_helmet", "royal_guard_chestplate", "royal_guard_leggings", "royal_guard_boots");
    public static final ArmorSet VANGUARD_ARMOR = registerArmorSet("vanguard_armor", "vanguard_helmet", "vanguard_chestplate", "vanguard_leggings", null);
    public static final ArmorSet WINDCALLER_ARMOR = registerArmorSetWindcaller("windcaller_armor", "windcaller_helmet", "windcaller_chestplate", null, null);
    public static final ArmorSet MOUNTAINEER_ARMOR = registerArmorSet("mountaineer_armor", "mountaineer_helmet", "mountaineer_chestplate", "mountaineer_leggings", "mountaineer_boots");
    public static final ArmorSet MAGE_ARMOR = registerArmorSetMage("mage_armor", "mage_helmet", "mage_chestplate", "mage_leggings", "mage_boots");



    private static ArmorSet registerArmorSet(String armorSetId, String helmetId, String chestId, String legsId, String bootsId, boolean animated) {
        ResourceLocation armorSet = new ResourceLocation(MODID, armorSetId);
        ResourceLocation modelLocation = new ResourceLocation(MODID, "geo/armor/" + armorSetId + ".geo.json");
        ResourceLocation textureLocation = new ResourceLocation(MODID, "textures/models/armor/" + armorSetId + ".png");
        ResourceLocation animationFileLocation = animated ? new ResourceLocation(MODID, "animations/armor/" + armorSetId + ".animation.json") : DEFAULT_ANIMATION_RESOURCE;
        return new ArmorSet(
                armorSet,
                registerArmor(helmetId, () -> new ArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(chestId, () -> new ArmorGear(EquipmentSlot.CHEST, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(legsId, () -> new ArmorGear(EquipmentSlot.LEGS, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(bootsId, () -> new ArmorGear(EquipmentSlot.FEET, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation))
        );
    }

    private static ArmorSet registerArmorSet(String armorSetId, String helmetId, String chestId, String legsId, String bootsId, ResourceLocation animationFileLocation) {
        ResourceLocation armorSet = new ResourceLocation(MODID, armorSetId);
        ResourceLocation modelLocation = new ResourceLocation(MODID, "geo/armor/" + armorSetId + ".geo.json");
        ResourceLocation textureLocation = new ResourceLocation(MODID, "textures/models/armor/" + armorSetId + ".png");
        return new ArmorSet(
                armorSet,
                registerArmor(helmetId, () -> new ArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(chestId, () -> new ArmorGear(EquipmentSlot.CHEST, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(legsId, () -> new ArmorGear(EquipmentSlot.LEGS, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(bootsId, () -> new ArmorGear(EquipmentSlot.FEET, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation))
        );
    }

    private static ArmorSet registerArmorSet(String armorSetId, String helmetId, String chestId, String legsId, String bootsId) {
        return registerArmorSet(armorSetId, helmetId, chestId, legsId, bootsId, false);
    }

    private static ArmorSet registerArmorSetMage(String armorSetId, String helmetId, String chestId, String legsId, String bootsId) {
        ResourceLocation armorSet = new ResourceLocation(MODID, armorSetId);
        ResourceLocation modelLocation = new ResourceLocation(MODID, "geo/armor/" + armorSetId + ".geo.json");
        ResourceLocation textureLocation = new ResourceLocation(MODID, "textures/models/armor/" + armorSetId + ".png");
        ResourceLocation animationFileLocation = new ResourceLocation(MODID, "animations/armor/cloaked_armor.animation.json");
        return new ArmorSet(
                armorSet,
                registerArmor(helmetId, () -> new MageArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(chestId, () -> new MageArmorGear(EquipmentSlot.CHEST, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(legsId, () -> new MageArmorGear(EquipmentSlot.LEGS, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(bootsId, () -> new MageArmorGear(EquipmentSlot.FEET, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation))
        );
    }

    private static ArmorSet registerArmorSetWindcaller(String armorSetId, String helmetId, String chestId, String legsId, String bootsId) {
        ResourceLocation armorSet = new ResourceLocation(MODID, armorSetId);
        ResourceLocation modelLocation = new ResourceLocation(MODID, "geo/armor/" + armorSetId + ".geo.json");
        ResourceLocation textureLocation = new ResourceLocation(MODID, "textures/models/armor/" + armorSetId + ".png");
        ResourceLocation animationFileLocation = new ResourceLocation(MODID, "animations/armor/cloaked_armor.animation.json");
        return new ArmorSet(
                armorSet,
                registerArmor(helmetId, () -> new WindcallerArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(chestId, () -> new WindcallerArmorGear(EquipmentSlot.CHEST, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(legsId, () -> new WindcallerArmorGear(EquipmentSlot.LEGS, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(bootsId, () -> new WindcallerArmorGear(EquipmentSlot.FEET, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation))
        );
    }

    private static ArmorSet registerArmorSetIceologer(String armorSetId, String helmetId, String chestId, String legsId, String bootsId) {
        ResourceLocation armorSet = new ResourceLocation(MODID, armorSetId);
        ResourceLocation modelLocation = new ResourceLocation(MODID, "geo/armor/" + armorSetId + ".geo.json");
        ResourceLocation textureLocation = new ResourceLocation(MODID, "textures/models/armor/" + armorSetId + ".png");
        ResourceLocation animationFileLocation = new ResourceLocation(MODID, "animations/armor/cloaked_armor.animation.json");
        return new ArmorSet(
                armorSet,
                registerArmor(helmetId, () -> new IceologerArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(chestId, () -> new IceologerArmorGear(EquipmentSlot.CHEST, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(legsId, () -> new IceologerArmorGear(EquipmentSlot.LEGS, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(bootsId, () -> new IceologerArmorGear(EquipmentSlot.FEET, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation))
        );
    }

    private static ArmorSet registerArmorSetIllusioner(String armorSetId, String helmetId, String chestId, String legsId, String bootsId) {
        ResourceLocation armorSet = new ResourceLocation(MODID, armorSetId);
        ResourceLocation modelLocation = new ResourceLocation(MODID, "geo/armor/" + armorSetId + ".geo.json");
        ResourceLocation textureLocation = new ResourceLocation(MODID, "textures/models/armor/" + armorSetId + ".png");
        ResourceLocation animationFileLocation = new ResourceLocation(MODID, "animations/armor/cloaked_armor.animation.json");
        return new ArmorSet(
                armorSet,
                registerArmor(helmetId, () -> new IllusionerArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(chestId, () -> new IllusionerArmorGear(EquipmentSlot.CHEST, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(legsId, () -> new IllusionerArmorGear(EquipmentSlot.LEGS, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(bootsId, () -> new IllusionerArmorGear(EquipmentSlot.FEET, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation))
        );
    }

    private static ArmorSet registerArmorSetDrownedNecromancer(String armorSetId, String helmetId, String chestId, String legsId, String bootsId) {
        ResourceLocation armorSet = new ResourceLocation(MODID, armorSetId);
        ResourceLocation modelLocation = new ResourceLocation(MODID, "geo/armor/" + armorSetId + ".geo.json");
        ResourceLocation textureLocation = new ResourceLocation(MODID, "textures/models/armor/" + armorSetId + ".png");
        ResourceLocation animationFileLocation = new ResourceLocation(MODID, "animations/armor/cloaked_armor.animation.json");
        return new ArmorSet(
                armorSet,
                registerArmor(helmetId, () -> new DrownedNecromancerArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(chestId, () -> new DrownedNecromancerArmorGear(EquipmentSlot.CHEST, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(legsId, () -> new DrownedNecromancerArmorGear(EquipmentSlot.LEGS, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                null
        );
    }

    private static ArmorSet registerArmorSetNecromancerArmor(String armorSetId, String helmetId, String chestId, String legsId, String bootsId) {
        ResourceLocation armorSet = new ResourceLocation(MODID, armorSetId);
        ResourceLocation modelLocation = new ResourceLocation(MODID, "geo/armor/" + armorSetId + ".geo.json");
        ResourceLocation textureLocation = new ResourceLocation(MODID, "textures/models/armor/" + armorSetId + ".png");
        ResourceLocation animationFileLocation = new ResourceLocation(MODID, "animations/armor/cloaked_armor.animation.json");
        return new ArmorSet(
                armorSet,
                registerArmor(helmetId, () -> new NecromancerArmorGear(EquipmentSlot.HEAD, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(chestId, () -> new NecromancerArmorGear(EquipmentSlot.CHEST, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                registerArmor(legsId, () -> new NecromancerArmorGear(EquipmentSlot.LEGS, ARMOR_PROPERTIES, armorSet, modelLocation, textureLocation, animationFileLocation)),
                null
        );
    }

    private static RegistryObject<Item> registerArmor(String armorId, Supplier<Item> itemSupplier) {
        if (armorId == null) return null;
        RegistryObject<Item> register = ITEMS.register(armorId, itemSupplier);
        ARMORS.put(GeneralHelper.modLoc(armorId), register);
        return register;
    }

    private static RegistryObject<Item> registerArtifact(String meleeWeaponId, Supplier<Item> itemSupplier) {
        RegistryObject<Item> register = ITEMS.register(meleeWeaponId, itemSupplier);
        ARTIFACTS.put(GeneralHelper.modLoc(meleeWeaponId), register);
        return register;
    }
}
