package com.playernguyen.utils;

import com.playernguyen.HurtHealth;

public class VersionUtils {

	private String link = "";
	
	public final String CurrentVersion(){
		return "1.1";
	}
	
	public VersionUtils(){
		
	}
	
	public void startUpdateCheck(){
		if(HurtHealth.getHurtHealth().getConfig().getBoolean("auto-update")){
			
		}
	}
}
