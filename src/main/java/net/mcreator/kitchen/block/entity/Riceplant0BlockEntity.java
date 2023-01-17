package net.mcreator.kitchen.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.kitchen.init.KitchenModBlockEntities;

public class Riceplant0BlockEntity extends BlockEntity {
	public Riceplant0BlockEntity(BlockPos pos, BlockState state) {
		super(KitchenModBlockEntities.RICEPLANT_0, pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithoutMetadata();
	}
}
