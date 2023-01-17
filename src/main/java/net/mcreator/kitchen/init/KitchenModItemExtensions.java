
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraft.world.level.block.ComposterBlock;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class KitchenModItemExtensions {
	public static void load() {
		FuelRegistry.INSTANCE.add(KitchenModBlocks.RICE_PLANT_4.asItem(), 360);
		ComposterBlock.COMPOSTABLES.put(KitchenModBlocks.RICE_PLANT_4.asItem(), 0.45f);
		FuelRegistry.INSTANCE.add(KitchenModItems.REED_LEAVE, 200);
		ComposterBlock.COMPOSTABLES.put(KitchenModItems.REED_LEAVE, 0.25f);
	}
}
