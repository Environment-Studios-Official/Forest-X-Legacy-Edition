
package ru.power_umc.forestxlegacy.fluid;

import ru.power_umc.forestxlegacy.init.ForestLegacyModItems;
import ru.power_umc.forestxlegacy.init.ForestLegacyModFluids;
import ru.power_umc.forestxlegacy.init.ForestLegacyModFluidTypes;
import ru.power_umc.forestxlegacy.init.ForestLegacyModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class QuicksandFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ForestLegacyModFluidTypes.QUICKSAND_TYPE.get(), () -> ForestLegacyModFluids.QUICKSAND.get(), () -> ForestLegacyModFluids.FLOWING_QUICKSAND.get())
			.explosionResistance(100f).tickRate(120).levelDecreasePerBlock(5).slopeFindDistance(1).bucket(() -> ForestLegacyModItems.QUICKSAND_BUCKET.get()).block(() -> (LiquidBlock) ForestLegacyModBlocks.QUICKSAND.get());

	private QuicksandFluid() {
		super(PROPERTIES);
	}

	public static class Source extends QuicksandFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends QuicksandFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
