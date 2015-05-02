package com.playernguyen.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.scheduler.BukkitRunnable;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import com.playernguyen.ConfigReturn;
import com.playernguyen.HurtHealth;

public class PlayerHurtEvent implements Listener {
	
	ConfigReturn cr;
	
	@EventHandler
	public void PlayerHurtEvent(final EntityDamageByEntityEvent e){
		double health = e.getDamage();		
		final Hologram holo  = HologramsAPI.createHologram(HurtHealth.getHurtHealth(), e.getEntity().getLocation());
		holo.appendTextLine(ConfigReturn.getConfigReturn().getFormat(health));
		new BukkitRunnable() {
			
			int tick;
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				tick++;
				holo.teleport(e.getEntity().getLocation().add(0, 2, 0));
				
				if(tick > ConfigReturn.getConfigReturn().getTimeShow()){ // In 2 Sec :3s
					holo.delete();
					cancel();
				}
				
			}
		}.runTaskTimer(HurtHealth.getHurtHealth(), 1L, 1L);
	}
	
}
