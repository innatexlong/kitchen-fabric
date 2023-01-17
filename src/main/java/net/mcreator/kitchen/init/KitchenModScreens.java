
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.mcreator.kitchen.client.gui.SteamerGuiScreen;
import net.mcreator.kitchen.client.gui.FrypanGuiScreen;

import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class KitchenModScreens {
	public static void load() {
		ScreenRegistry.register(KitchenModMenus.FRYPAN_GUI, FrypanGuiScreen::new);
		ScreenRegistry.register(KitchenModMenus.STEAMER_GUI, SteamerGuiScreen::new);
	}
}
