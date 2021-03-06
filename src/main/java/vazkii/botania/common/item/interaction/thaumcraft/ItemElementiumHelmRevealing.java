/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 *
 * File Created @ [Jul 28, 2014, 6:16:24 PM (GMT)]
 */
package vazkii.botania.common.item.interaction.thaumcraft;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import vazkii.botania.client.lib.LibResources;
import vazkii.botania.common.core.handler.ConfigHandler;
import vazkii.botania.common.item.equipment.armor.elementium.ItemElementiumHelm;

public class ItemElementiumHelmRevealing extends ItemElementiumHelm {

	public ItemElementiumHelmRevealing(Properties props) {
		super(props);
	}

	@Override
	public String getArmorTextureAfterInk(ItemStack stack, EquipmentSlotType slot) {
		return ConfigHandler.CLIENT.enableArmorModels.get() ? LibResources.MODEL_ELEMENTIUM_NEW : LibResources.MODEL_ELEMENTIUM_2;
	}

}
