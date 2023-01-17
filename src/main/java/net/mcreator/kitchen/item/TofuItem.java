
package net.mcreator.kitchen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.kitchen.init.KitchenModTabs;

public class TofuItem extends Item {
	public TofuItem() {
		super(new Item.Properties().tab(KitchenModTabs.TAB_KITCHEN_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.3f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
