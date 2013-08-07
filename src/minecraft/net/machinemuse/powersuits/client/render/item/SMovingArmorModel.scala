package net.machinemuse.powersuits.client.render.item

import net.minecraft.src.ModelPlayer
import net.minecraft.entity.Entity

/**
 * Author: MachineMuse (Claire Semple)
 * Created: 9:23 PM, 11/07/13
 */
class SMovingArmorModel extends ModelPlayer(0) with ArmorModel {
  override def render(entity: Entity, par2: Float, par3: Float, par4: Float, par5: Float, par6: Float, scale: Float) {
    prep(entity, par2, par3, par4, par5, par6, scale)
    super.render(entity, par2, par3, par4, par5, par6, scale)
  }
}
