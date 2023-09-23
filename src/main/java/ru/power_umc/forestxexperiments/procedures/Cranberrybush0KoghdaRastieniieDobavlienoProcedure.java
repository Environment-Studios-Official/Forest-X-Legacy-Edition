package ru.power_umc.forestxexperiments.procedures;

import ru.power_umc.forestxexperiments.init.ForestLegacyModBlocks;
import ru.power_umc.forestxexperiments.ForestLegacyMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Cranberrybush0KoghdaRastieniieDobavlienoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ForestLegacyMod.queueServerWork(200, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestLegacyModBlocks.CRANBERRYBUSH_0.get()) {
				world.setBlock(BlockPos.containing(x, y, z), ForestLegacyModBlocks.CRANBERRYBUSH_1.get().defaultBlockState(), 3);
			}
		});
	}
}
