package com.playernguyen.listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.scheduler.BukkitRunnable;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import com.playernguyen.HurtHealth;

public class PlayerHurtEvent implements Listener {
	
	@EventHandler
	public void PlayerHurtEvemt(final EntityDamageByEntityEvent e){
		double health = e.getDamage();		
		final Hologram holo  = HologramsAPI.createHologram(HurtHealth.getHurtHealth(), e.getEntity().getLocation());
		holo.appendTextLine(ChatColor.RED+""+ChatColor.BOLD+"♥"+String.valueOf(health));
		new BukkitRunnable() {
			
			int tick;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				tick++;
				holo.teleport(e.getEntity().getLocation().add(0, 2, 0));
				
				if(tick > 20){ // In 2 Sec :3
					holo.delete();
					cancel();
				}
				
			}
		}.runTaskTimer(HurtHealth.getHurtHealth(), 1L, 1L);
	}
	
}
