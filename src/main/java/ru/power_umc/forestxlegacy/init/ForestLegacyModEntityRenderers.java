
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxlegacy.init;

import ru.power_umc.forestxlegacy.client.renderer.MummyRenderer;
import ru.power_umc.forestxlegacy.client.renderer.AshencowRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForestLegacyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ForestLegacyModEntities.ASHENCOW.get(), AshencowRenderer::new);
		event.registerEntityRenderer(ForestLegacyModEntities.MUMMY.get(), MummyRenderer::new);
	}
}
