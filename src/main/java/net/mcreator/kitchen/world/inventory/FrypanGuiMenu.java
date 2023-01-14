
package net.mcreator.kitchen.world.inventory;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.Container;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.kitchen.init.KitchenModMenus;

import java.util.HashMap;

public class FrypanGuiMenu extends AbstractContainerMenu {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private BlockPos pos;
	private final Container inventory;
	private boolean bound = false;

	public FrypanGuiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		this(id, inv, new SimpleContainer(11));
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
	}

	public FrypanGuiMenu(int id, Inventory inv, Container container) {
		super(KitchenModMenus.FRYPAN_GUI, id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.inventory = container;
		this.addSlot(new Slot(inventory, 0, 43, 26) {
		});
		this.addSlot(new Slot(inventory, 1, 61, 26) {
		});
		this.addSlot(new Slot(inventory, 2, 79, 26) {
		});
		this.addSlot(new Slot(inventory, 3, 43, 44) {
		});
		this.addSlot(new Slot(inventory, 4, 61, 44) {
		});
		this.addSlot(new Slot(inventory, 5, 79, 44) {
		});
		this.addSlot(new Slot(inventory, 6, 43, 62) {
		});
		this.addSlot(new Slot(inventory, 7, 61, 62) {
		});
		this.addSlot(new Slot(inventory, 8, 79, 62) {
		});
		this.addSlot(new Slot(inventory, 9, 115, 44) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		});
		this.addSlot(new Slot(inventory, 10, 16, 44) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.FLINT_AND_STEEL == stack.getItem());
			}
		});
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 0 + 8 + sj * 18, 0 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 0 + 8 + si * 18, 0 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		return this.inventory.stillValid(player);
	}

	@Override
	public ItemStack quickMoveStack(Player player, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 11) {
				if (!this.moveItemStackTo(itemstack1, 11, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 11, false)) {
				if (index < 11 + 27) {
					if (!this.moveItemStackTo(itemstack1, 11 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 11, 11 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.isEmpty())
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(player, itemstack1);
		}
		return itemstack;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
	}
}
