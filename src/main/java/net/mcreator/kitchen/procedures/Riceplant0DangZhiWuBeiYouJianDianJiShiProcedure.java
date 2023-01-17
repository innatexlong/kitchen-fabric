package net.mcreator.kitchen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import net.mcreator.kitchen.init.KitchenModBlocks;
import net.mcreator.kitchen.KitchenMod;

import java.util.Map;

public class Riceplant0DangZhiWuBeiYouJianDianJiShiProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				KitchenMod.LOGGER.warn("Failed to load dependency world for procedure Riceplant0DangZhiWuBeiYouJianDianJiShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				KitchenMod.LOGGER.warn("Failed to load dependency x for procedure Riceplant0DangZhiWuBeiYouJianDianJiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				KitchenMod.LOGGER.warn("Failed to load dependency y for procedure Riceplant0DangZhiWuBeiYouJianDianJiShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				KitchenMod.LOGGER.warn("Failed to load dependency z for procedure Riceplant0DangZhiWuBeiYouJianDianJiShi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				KitchenMod.LOGGER.warn("Failed to load dependency entity for procedure Riceplant0DangZhiWuBeiYouJianDianJiShi!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (Math.random() < 0.3) {
				world.setBlock(new BlockPos(x, y, z), KitchenModBlocks.RICE_PLANT_4.defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y, z), KitchenModBlocks.STEAMER.defaultBlockState(), 3);
			}
		}
	}
}
