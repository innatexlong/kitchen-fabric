
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.kitchen.world.features.plants.RicePlant4Feature;
import net.mcreator.kitchen.KitchenMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class KitchenModFeatures {
	public static void load() {
		register("rice_plant_4", RicePlant4Feature.feature(), RicePlant4Feature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(KitchenMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep,
				ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(KitchenMod.MODID, registryName)));
	}
}
