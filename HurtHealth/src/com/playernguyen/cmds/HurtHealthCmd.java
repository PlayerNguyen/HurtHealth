package com.playernguyen.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.playernguyen.HurtHealth;

public class HurtHealthCmd implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		if(args.length == 0){
			if(sender.hasPermission("hurthealth.cmd")||sender.hasPermission("hurthealth.*")){
				sender.sendMessage(ChatColor.RED+"Hurt Health version 1.1 beta.");
				sender.sendMessage(ChatColor.RED+"Use /hurthealth help to get help.");
				return true;
			} else {
				sender.sendMessage(ChatColor.RED+"You don't have permissions to this command.");
				return true;
			}
		}
		
		if(args[0].equalsIgnoreCase("help")){
			if(sender.hasPermission("hurthealth.help")||sender.hasPermission("hurthealth.*")){
				sender.sendMessage(ChatColor.YELLOW+"/hurthealth reload : Reload config");
				sender.sendMessage(ChatColor.YELLOW+"/hurthealth info : Check info.");
				return true;
			} else {
				sender.sendMessage(ChatColor.RED+"You don't have permissions to this command.");
				return true;
			}
		}
		
		if(args[0].equalsIgnoreCase("reload")){
			if(sender.hasPermission("hurthealth.reload") || sender.hasPermission("hurthealth.*")){
				HurtHealth.getHurtHealth().reloadConfig();
				sender.sendMessage(ChatColor.GRAY+"["+ChatColor.GREEN+"RELOAD HURT HEALTH CONFIG DONE"+ChatColor.GRAY+"].");
				return true;
			} else {
				sender.sendMessage(ChatColor.RED+"You don't have permissions to this command.");
				return true;
			}
		}
		
		if(args[0].equalsIgnoreCase("info")){
			if(sender.hasPermission("hurthealth.info")|| sender.hasPermission("hurthealth.*")){
				sender.sendMessage(ChatColor.RED+"Hurt Health version 1.1 beta. Make by Player Nguyen.");
			} else {
				sender.sendMessage(ChatColor.RED+"You don't have permissions to this command.");
				return true;
			}
		}
		
		return true;
		
	}

}
