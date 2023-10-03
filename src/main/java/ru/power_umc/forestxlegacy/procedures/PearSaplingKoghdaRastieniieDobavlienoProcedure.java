package ru.power_umc.forestxlegacy.procedures;

import ru.power_umc.forestxlegacy.init.ForestLegacyModBlocks;
import ru.power_umc.forestxlegacy.ForestLegacyMod;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PearSaplingKoghdaRastieniieDobavlienoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ForestLegacyMod.queueServerWork(1000, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestLegacyModBlocks.PEAR_SAPLING.get()) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forest_legacy", "cherry_tree_fix"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y, z - 4), BlockPos.containing(x - 6, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		});
	}
}
