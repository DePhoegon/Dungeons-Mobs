package com.infamous.dungeons_mobs.items;

import com.infamous.dungeons_mobs.entities.projectiles.BlueNethershroomEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class BlueNethershroomItem extends Item {
   public BlueNethershroomItem(Item.Properties properties) {
      super(properties);
   }

   public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
      ItemStack itemstack = player.getItemInHand(hand);
      if (!world.isClientSide) {
         BlueNethershroomEntity blueNethershroom = new BlueNethershroomEntity(world, player);
         blueNethershroom.setItem(itemstack);
         blueNethershroom.shootFromRotation(player, player.xRot, player.yRot, -20.0F, 0.5F, 1.0F);
         world.addFreshEntity(blueNethershroom);
      }

      player.awardStat(Stats.ITEM_USED.get(this));
      if (!player.abilities.instabuild) {
         itemstack.shrink(1);
      }

      return ActionResult.sidedSuccess(itemstack, world.isClientSide());
   }
}