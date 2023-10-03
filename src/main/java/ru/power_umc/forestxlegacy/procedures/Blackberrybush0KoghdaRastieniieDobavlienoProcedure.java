package ru.power_umc.forestxlegacy.procedures;

import ru.power_umc.forestxlegacy.init.ForestLegacyModBlocks;
import ru.power_umc.forestxlegacy.ForestLegacyMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Blackberrybush0KoghdaRastieniieDobavlienoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ForestLegacyMod.queueServerWork(200, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestLegacyModBlocks.BLACKBERRYBUSH_0.get()) {
				world.setBlock(BlockPos.containing(x, y, z), ForestLegacyModBlocks.BLACKBERRYBUSH_1.get().defaultBlockState(), 3);
			}
		});
	}
}
