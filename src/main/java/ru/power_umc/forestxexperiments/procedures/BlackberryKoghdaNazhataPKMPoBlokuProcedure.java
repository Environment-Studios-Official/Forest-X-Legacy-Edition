package ru.power_umc.forestxexperiments.procedures;

import ru.power_umc.forestxexperiments.init.ForestLegacyModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BlackberryKoghdaNazhataPKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 1, z), ForestLegacyModBlocks.BLACKBERRYBUSH_0.get().defaultBlockState(), 3);
	}
}
