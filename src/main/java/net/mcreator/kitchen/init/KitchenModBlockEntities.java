
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.kitchen.block.entity.SteamerBlockEntity;
import net.mcreator.kitchen.block.entity.Riceplant0BlockEntity;
import net.mcreator.kitchen.block.entity.FrypanBlockEntity;
import net.mcreator.kitchen.KitchenMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class KitchenModBlockEntities {
	public static BlockEntityType<?> FRYPAN;
	public static BlockEntityType<?> STEAMER;
	public static BlockEntityType<?> RICEPLANT_0;

	public static void load() {
		FRYPAN = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(KitchenMod.MODID, "frypan"),
				FabricBlockEntityTypeBuilder.create(FrypanBlockEntity::new, KitchenModBlocks.FRYPAN).build(null));
		STEAMER = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(KitchenMod.MODID, "steamer"),
				FabricBlockEntityTypeBuilder.create(SteamerBlockEntity::new, KitchenModBlocks.STEAMER).build(null));
		RICEPLANT_0 = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(KitchenMod.MODID, "riceplant_0"),
				FabricBlockEntityTypeBuilder.create(Riceplant0BlockEntity::new, KitchenModBlocks.RICEPLANT_0).build(null));
	}
}
