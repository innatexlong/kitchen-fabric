
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
import net.mcreator.kitchen.item.TofuItem;
import net.mcreator.kitchen.item.ReedLeaveItem;
import net.mcreator.kitchen.item.RedDateItem;
import net.mcreator.kitchen.item.RedDateBunItem;
import net.mcreator.kitchen.item.RawmooncakeItem;
import net.mcreator.kitchen.item.MooncakeItem;
import net.mcreator.kitchen.item.KnifeItem;
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
	public static Item KNIFE;
	public static Item RED_DATE;
	public static Item RED_DATE_BUN;
	public static Item REED_LEAVE;
	public static Item STEAMER;
	public static Item TOFU;
	public static Item RICEPLANT_0;

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
		KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "knife"), new KnifeItem());
		RED_DATE = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "red_date"), new RedDateItem());
		RED_DATE_BUN = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "red_date_bun"), new RedDateBunItem());
		REED_LEAVE = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "reed_leave"), new ReedLeaveItem());
		STEAMER = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "steamer"),
				new BlockItem(KitchenModBlocks.STEAMER, new Item.Properties().tab(KitchenModTabs.TAB_KITCHEN_BLOCKS)));
		TOFU = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "tofu"), new TofuItem());
		RICEPLANT_0 = Registry.register(Registry.ITEM, new ResourceLocation(KitchenMod.MODID, "riceplant_0"),
				new BlockItem(KitchenModBlocks.RICEPLANT_0, new Item.Properties().tab(KitchenModTabs.TAB_KITCHEN_BLOCKS)));
	}
}
