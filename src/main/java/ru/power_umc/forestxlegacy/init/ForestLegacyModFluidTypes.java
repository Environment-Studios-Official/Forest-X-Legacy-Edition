
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxlegacy.init;

import ru.power_umc.forestxlegacy.fluid.types.QuicksandFluidType;
import ru.power_umc.forestxlegacy.ForestLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class ForestLegacyModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ForestLegacyMod.MODID);
	public static final RegistryObject<FluidType> QUICKSAND_TYPE = REGISTRY.register("quicksand", () -> new QuicksandFluidType());
}
