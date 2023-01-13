/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.kitchen;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.kitchen.init.KitchenModTabs;
import net.mcreator.kitchen.init.KitchenModProcedures;
import net.mcreator.kitchen.init.KitchenModMenus;
import net.mcreator.kitchen.init.KitchenModItems;
import net.mcreator.kitchen.init.KitchenModItemExtensions;
import net.mcreator.kitchen.init.KitchenModFeatures;
import net.mcreator.kitchen.init.KitchenModBlocks;
import net.mcreator.kitchen.init.KitchenModBlockEntities;

import net.fabricmc.api.ModInitializer;

public class KitchenMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "kitchen";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing KitchenMod");
		KitchenModTabs.load();

		KitchenModBlocks.load();
		KitchenModItems.load();
		KitchenModBlockEntities.load();

		KitchenModFeatures.load();

		KitchenModProcedures.load();

		KitchenModItemExtensions.load();
		KitchenModMenus.load();

	}
}
