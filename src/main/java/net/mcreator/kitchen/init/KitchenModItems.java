
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.kitchen.item.WheatFlourItem;
import net.mcreator.kitchen.item.UnhuskedRiceItem;
import net.mcreator.kitchen.item.RawmooncakeItem;
import net.mcreator.kitchen.item.MooncakeItem;
import net.mcreator.kitchen.item.DumplingItem;
import net.mcreator.kitchen.item.DoughItem;
import net.mcreator.kitchen.item.AlcoholItem;
import net.mcreator.kitchen.item.ABowlOfRiceItem;
import net.mcreator.kitchen.KitchenMod;

public class KitchenModItems {
	public static Item FRYPAN;
	public static Item RAWMOONCAKE;
	public static Item MOONCAKE;
	public static Item DOUGH;
	public static Item WHEAT_FLOUR;
	public static Item ALCOHOL;
	public static Item DUMPLING;
	public static Item A_BOWL_OF_RICE;
	public static Item RICE_PLANT_4;
	public static Item UNHUSKED_RICE;

	public static void load() {
		FRYPAN = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "frypan"),
				new BlockItem(KitchenModBlocks.FRYPAN, new Item.Properties().tab(KitchenModTabs.TAB_KITCHEN_BLOCKS)));
		RAWMOONCAKE = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "rawmooncake"), new RawmooncakeItem());
		MOONCAKE = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "mooncake"), new MooncakeItem());
		DOUGH = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "dough"), new DoughItem());
		WHEAT_FLOUR = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "wheat_flour"), new WheatFlourItem());
		ALCOHOL = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "alcohol"), new AlcoholItem());
		DUMPLING = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "dumpling"), new DumplingItem());
		A_BOWL_OF_RICE = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "a_bowl_of_rice"), new ABowlOfRiceItem());
		RICE_PLANT_4 = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "rice_plant_4"),
				new BlockItem(KitchenModBlocks.RICE_PLANT_4, new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
		UNHUSKED_RICE = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "unhusked_rice"), new UnhuskedRiceItem());
	}
}
