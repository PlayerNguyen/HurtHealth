package com.playernguyen;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.playernguyen.cmds.HurtHealthCmd;
import com.playernguyen.listener.PlayerHurtEvent;

public class HurtHealth extends JavaPlugin {

	public void onEnable(){
		MessageManager.getMessage.log("[HurtHealth] Plugin enable......");
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerHurtEvent(), this);
		if(Bukkit.getServer().getPluginManager().getPlugin("HolographicDisplays") == null){
			MessageManager.getMessage.logError("[HurtHealth] Please install Holographic Displays!");
			MessageManager.getMessage.logError("[HurtHealth] Link: http://dev.bukkit.org/bukkit-plugins/holographic-displays/");
			MessageManager.getMessage.logError("[HurtHealth] Disable this plugin.");
			Bukkit.getServer().getPluginManager().disablePlugin(this);
			return;
		} else {
			MessageManager.getMessage.logInfo("[HurtHealth] Hook with Holographic Display.");
		}
		MessageManager.getMessage.log("[HurtHealth] Setup config.yml.");
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
		MessageManager.getMessage.log("[HurtHealth] Done.");
		// Set Command 
		getCommand("hurthealth").setExecutor(new HurtHealthCmd());
	}
	
	public static Plugin getHurtHealth(){
		return Bukkit.getServer().getPluginManager().getPlugin("HurtHealth");
	}
	
	
	
	
}
