
package net.mcreator.kitchen.block;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.kitchen.procedures.Riceplant0GengXinYouXiKeProcedure;
import net.mcreator.kitchen.procedures.Riceplant0DangZhiWuBeiYouJianDianJiShiProcedure;
import net.mcreator.kitchen.init.KitchenModBlocks;
import net.mcreator.kitchen.block.entity.Riceplant0BlockEntity;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class Riceplant0Block extends FlowerBlock implements EntityBlock {
	public Riceplant0Block() {
		super(MobEffects.MOVEMENT_SPEED, 100,
				BlockBehaviour.Properties.of(Material.PLANT).randomTicks().sound(SoundType.GRASS).instabreak().noCollission());
		FlammableBlockRegistry.getDefaultInstance().add(this, 100, 60);
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(Blocks.WATER) || groundState.is(Blocks.WATER) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(Blocks.FARMLAND);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		Riceplant0GengXinYouXiKeProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("x", pos.getX())
				.put("y", pos.getY()).put("z", pos.getZ()).put("world", world).build());
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		Riceplant0DangZhiWuBeiYouJianDianJiShiProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("x", pos.getX())
				.put("y", pos.getY()).put("z", pos.getZ()).put("world", world).put("entity", entity).build());
		return InteractionResult.SUCCESS;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new Riceplant0BlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(KitchenModBlocks.RICEPLANT_0, RenderType.cutoutMipped());
	}
}
