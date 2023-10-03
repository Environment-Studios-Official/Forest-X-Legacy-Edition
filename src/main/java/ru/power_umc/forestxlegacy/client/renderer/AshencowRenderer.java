
package ru.power_umc.forestxlegacy.client.renderer;

import ru.power_umc.forestxlegacy.entity.AshencowEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

public class AshencowRenderer extends MobRenderer<AshencowEntity, CowModel<AshencowEntity>> {
	public AshencowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AshencowEntity entity) {
		return new ResourceLocation("forest_legacy:textures/entities/ashen_cow.png");
	}
}
