
package net.mcreator.kitchen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.kitchen.init.KitchenModTabs;

public class RedDateBunItem extends Item {
	public RedDateBunItem() {
		super(new Item.Properties().tab(KitchenModTabs.TAB_KITCHEN_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(9).saturationMod(0.2f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
