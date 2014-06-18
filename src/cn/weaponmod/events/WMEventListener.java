/** 
 * Copyright (c) Lambda Innovation Team, 2013
 * 版权许可：LambdaCraft 制作小组， 2013.
 * http://lambdacraft.cn/
 * 
 * The mod is open-source. It is distributed under the terms of the
 * Lambda Innovation Open Source License. It grants rights to read, modify, compile
 * or run the code. It does *NOT* grant the right to redistribute this software
 * or its modifications in any form, binary or source, except if expressively
 * granted by the copyright holder.
 *
 * 本Mod是完全开源的，你允许参考、使用、引用其中的任何代码段，但不允许将其用于商业用途，在引用的时候，必须注明原作者。
 */
package cn.weaponmod.events;

import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import cn.weaponmod.api.weapon.WeaponGeneral;

/**
 * @author WeAthFolD
 *
 */
public class WMEventListener {

	  @ForgeSubscribe
	  public void onInteract(EntityInteractEvent event)
	  {
		  ItemStack curItem = event.entityPlayer.getCurrentEquippedItem();
		  if(curItem == null)
			  return;
		  if(curItem.getItem() instanceof WeaponGeneral) {
                if(((WeaponGeneral)curItem.getItem()).doesAbortAnim(curItem, event.entityPlayer))
              	  event.setCanceled(true);
		  }
	  }
	
}