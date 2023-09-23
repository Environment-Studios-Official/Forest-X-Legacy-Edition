package ru.power_umc.forestxexperiments.procedures;

import ru.power_umc.forestxexperiments.init.ForestLegacyModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CranberryKoghdaNazhataPKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 1, z), ForestLegacyModBlocks.CRANBERRYBUSH_0.get().defaultBlockState(), 3);
	}
}
