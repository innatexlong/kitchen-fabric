
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class KitchenModTabs {
	public static CreativeModeTab TAB_KITCHEN_FOOD;
	public static CreativeModeTab TAB_KITCHEN_BLOCKS;
	public static CreativeModeTab TAB_KITCHEN_TOOLS;
	public static CreativeModeTab TAB_KITCHEN_OTHER;

	public static void load() {
		TAB_KITCHEN_FOOD = FabricItemGroupBuilder.create(new ResourceLocation("kitchen", "kitchen_food"))
				.icon(() -> new ItemStack(KitchenModBlocks.FRYPAN)).build();
		TAB_KITCHEN_BLOCKS = FabricItemGroupBuilder.create(new ResourceLocation("kitchen", "kitchen_blocks"))
				.icon(() -> new ItemStack(KitchenModBlocks.RICE_PLANT_4)).build();
		TAB_KITCHEN_TOOLS = FabricItemGroupBuilder.create(new ResourceLocation("kitchen", "kitchen_tools"))
				.icon(() -> new ItemStack(Items.DIAMOND_SWORD)).build();
		TAB_KITCHEN_OTHER = FabricItemGroupBuilder.create(new ResourceLocation("kitchen", "kitchen_other"))
				.icon(() -> new ItemStack(KitchenModItems.UNHUSKED_RICE)).build();
	}
}
