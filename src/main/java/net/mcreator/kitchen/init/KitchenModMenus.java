
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.kitchen.world.inventory.FrypanGuiMenu;
import net.mcreator.kitchen.client.gui.FrypanGuiScreen;
import net.mcreator.kitchen.KitchenMod;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;

public class KitchenModMenus {
	public static MenuType<FrypanGuiMenu> FRYPAN_GUI;

	public static void load() {
		FRYPAN_GUI = ScreenHandlerRegistry.registerExtended(new ResourceLocation(KitchenMod.MODID, "frypan_gui"), FrypanGuiMenu::new);
		FrypanGuiScreen.screenInit();
	}
}
