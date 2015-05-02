package com.playernguyen;

import org.bukkit.ChatColor;

public class ConfigReturn {

	private static ConfigReturn cr = new ConfigReturn();
	
	public static ConfigReturn getConfigReturn(){
		return cr;
	}
	
	public int getTimeShow(){
		int time = HurtHealth.getHurtHealth().getConfig(). getInt("time-delay");
		return (time*20);
	}
	
	public String getFormat(double health){
		String s = HurtHealth.getHurtHealth().getConfig(). getString("format");
		switch (s) {
			case "%red_love_health%": return ChatColor.RED+""+ChatColor.BOLD+"♥"+String.valueOf(health);
			case "%blue_love_health%": return ChatColor.BLUE+""+ChatColor.BOLD+"♥"+String.valueOf(health);
			case "%blue_health%" : return ChatColor.BLUE+""+ChatColor.BOLD+String.valueOf(health);
			case "%red_health%" : return ChatColor.RED+""+ChatColor.BOLD+String.valueOf(health);
			case "%green_health%" : return ChatColor.GREEN+""+ChatColor.BOLD+String.valueOf(health);
			case "%green_love_health%" : return ChatColor.GREEN+""+ChatColor.BOLD+"♥"+String.valueOf(health);
			case "%yellow_love_health%" : return ChatColor.YELLOW+""+ChatColor.BOLD+"♥"+String.valueOf(health);
			case "%yellow_health%" : return ChatColor.YELLOW+""+ChatColor.BOLD+""+String.valueOf(health);
			case "%gold_love_health%" : return ChatColor.GOLD+""+ChatColor.BOLD+"♥"+String.valueOf(health);
			case "%gold_health%" : return ChatColor.GOLD+""+ChatColor.BOLD+""+String.valueOf(health);
			case "%purple_love_health%" : return ChatColor.DARK_PURPLE+""+ChatColor.BOLD+"♥"+String.valueOf(health);
			case "%purple_health%" : return ChatColor.DARK_PURPLE+""+ChatColor.BOLD+""+String.valueOf(health);
			case "%aqua_health%" : return ChatColor.AQUA+""+ChatColor.BOLD+""+String.valueOf(health);
			case "%aqua_love_health%" : return ChatColor.AQUA+""+ChatColor.BOLD+""+String.valueOf(health);
			case "%darkaqua_love_health%" : return ChatColor.DARK_AQUA+""+ChatColor.BOLD+""+String.valueOf(health);
			case "%darkaqua_health%" : return ChatColor.DARK_AQUA+""+ChatColor.BOLD+""+String.valueOf(health);
			default: return null;
		}
	}
	
}
