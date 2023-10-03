package ru.power_umc.forestxlegacy.procedures;

import ru.power_umc.forestxlegacy.init.ForestLegacyModItems;
import ru.power_umc.forestxlegacy.init.ForestLegacyModBlocks;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class Blackberrybush1PriNazhatiiPravoiKnopkiMyshiNaRastieniiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(ForestLegacyModItems.BLACKBERRY.get());
			_setstack.setCount(4);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		world.setBlock(BlockPos.containing(x, y, z), ForestLegacyModBlocks.BLACKBERRYBUSH_0.get().defaultBlockState(), 3);
	}
}
