
package net.mcreator.kitchen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.kitchen.init.KitchenModTabs;

public class WheatFlourItem extends Item {
	public WheatFlourItem() {
		super(new Item.Properties().tab(KitchenModTabs.TAB_KITCHEN_FOOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
