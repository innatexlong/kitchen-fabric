package net.mcreator.kitchen.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.kitchen.init.KitchenModBlocks;
import net.mcreator.kitchen.KitchenMod;

import java.util.Map;

public class Riceplant0GengXinYouXiKeProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				KitchenMod.LOGGER.warn("Failed to load dependency world for procedure Riceplant0GengXinYouXiKe!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				KitchenMod.LOGGER.warn("Failed to load dependency x for procedure Riceplant0GengXinYouXiKe!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				KitchenMod.LOGGER.warn("Failed to load dependency y for procedure Riceplant0GengXinYouXiKe!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				KitchenMod.LOGGER.warn("Failed to load dependency z for procedure Riceplant0GengXinYouXiKe!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) > 7) {
			if (Math.random() < 0.3) {
				world.setBlock(new BlockPos(x, y, z), KitchenModBlocks.RICE_PLANT_4.defaultBlockState(), 3);
			}
		} else {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
