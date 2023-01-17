package net.mcreator.kitchen.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.kitchen.init.KitchenModItems;
import net.mcreator.kitchen.init.KitchenModBlocks;
import net.mcreator.kitchen.KitchenMod;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;

import java.util.Map;
import java.util.HashMap;

public class UnhuskedRiceDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhiProcedure {
	public UnhuskedRiceDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhiProcedure() {
		UseBlockCallback.EVENT.register((player, level, hand, hitResult) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("world", level);
			dependencies.put("entity", player);
			dependencies.put("x", hitResult.getBlockPos().getX());
			dependencies.put("y", hitResult.getBlockPos().getY());
			dependencies.put("z", hitResult.getBlockPos().getZ());
			dependencies.put("blockstate", level.getBlockState(hitResult.getBlockPos()));
			dependencies.put("direction", hitResult.getDirection());
			execute(dependencies);
			return InteractionResult.PASS;
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				KitchenMod.LOGGER.warn("Failed to load dependency world for procedure UnhuskedRiceDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				KitchenMod.LOGGER.warn("Failed to load dependency x for procedure UnhuskedRiceDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				KitchenMod.LOGGER.warn("Failed to load dependency y for procedure UnhuskedRiceDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				KitchenMod.LOGGER.warn("Failed to load dependency z for procedure UnhuskedRiceDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				KitchenMod.LOGGER.warn("Failed to load dependency entity for procedure UnhuskedRiceDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhi!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == KitchenModItems.UNHUSKED_RICE
				&& (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(KitchenModItems.UNHUSKED_RICE))
						: false)) {
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.FARMLAND
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRASS_BLOCK)
					&& world.isEmptyBlock(new BlockPos(x, y + 1, z))) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				world.setBlock(new BlockPos(x, y + 1, z), KitchenModBlocks.RICE_PLANT_4.defaultBlockState(), 3);
				if (!(new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft
									.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity) && (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false))) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
			}
		}
	}
}
