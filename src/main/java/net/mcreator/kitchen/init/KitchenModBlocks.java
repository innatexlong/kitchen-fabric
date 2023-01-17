
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.kitchen.block.SteamerBlock;
import net.mcreator.kitchen.block.Riceplant0Block;
import net.mcreator.kitchen.block.RicePlant4Block;
import net.mcreator.kitchen.block.FrypanBlock;
import net.mcreator.kitchen.KitchenMod;

public class KitchenModBlocks {
	public static Block FRYPAN;
	public static Block RICE_PLANT_4;
	public static Block STEAMER;
	public static Block RICEPLANT_0;

	public static void load() {
		FRYPAN = Registry.register(Registry.BLOCK, new ResourceLocation(KitchenMod.MODID, "frypan"), new FrypanBlock());
		RICE_PLANT_4 = Registry.register(Registry.BLOCK, new ResourceLocation(KitchenMod.MODID, "rice_plant_4"), new RicePlant4Block());
		STEAMER = Registry.register(Registry.BLOCK, new ResourceLocation(KitchenMod.MODID, "steamer"), new SteamerBlock());
		RICEPLANT_0 = Registry.register(Registry.BLOCK, new ResourceLocation(KitchenMod.MODID, "riceplant_0"), new Riceplant0Block());
	}

	public static void clientLoad() {
		FrypanBlock.clientInit();
		RicePlant4Block.clientInit();
		SteamerBlock.clientInit();
		Riceplant0Block.clientInit();
	}
}
