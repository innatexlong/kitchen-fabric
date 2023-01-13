
package net.mcreator.kitchen.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.kitchen.procedures.UnhuskedRiceDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhiProcedure;
import net.mcreator.kitchen.init.KitchenModTabs;

public class UnhuskedRiceItem extends Item {
	public UnhuskedRiceItem() {
		super(new Item.Properties().tab(KitchenModTabs.TAB_KITCHEN_OTHER).durability(7).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		UnhuskedRiceDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhiProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder()
				.put("world", context.getLevel()).put("x", context.getClickedPos().getX()).put("y", context.getClickedPos().getY())
				.put("z", context.getClickedPos().getZ()).put("entity", context.getPlayer()).build());
		return retval;
	}
}
