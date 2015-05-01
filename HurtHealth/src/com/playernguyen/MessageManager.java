package com.playernguyen;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class MessageManager {

	public static MessageManager getMessage = new MessageManager();  
	
	public void log(String msg){
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA+msg);
	}
	
	public void logError(String msg){
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED+msg);
	}
	
	public void logInfo(String msg){
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW+msg);
	}
	
}
