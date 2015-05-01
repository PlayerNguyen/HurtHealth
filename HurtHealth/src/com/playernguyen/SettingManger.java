package com.playernguyen;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;

public class SettingManger {

	private File file = new File(HurtHealth.getHurtHealth().getDataFolder(), "config.yml");
	
	private FileConfiguration config;
	
	private SettingManger sm = new SettingManger();
	
	public SettingManger getSetting(){
		return sm;
	}
	
	public void setup(){
		if(!file.exists()){
			try {
				config.save(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public FileConfiguration getConfig(){
		return config;
	}
	
	public void save(){
		try {
			config.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
