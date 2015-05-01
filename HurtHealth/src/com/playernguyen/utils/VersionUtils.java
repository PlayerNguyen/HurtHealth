package com.playernguyen.utils;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.bukkit.craftbukkit.libs.jline.internal.InputStreamReader;

import com.playernguyen.HurtHealth;

public class VersionUtils {

	private String link = "https://raw.githubusercontent.com/PlayerNguyen/HurtHealth/master/version";
	
	public final String CurrentVersion(){
		return "1.1";
	}
	
	public VersionUtils(){
		
	}
	
	public void startUpdateCheck(){
		if(HurtHealth.getHurtHealth().getConfig().getBoolean("auto-update")){
			try {
				URL url = new URL(link);
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				String line;
				while ((str = br.readLine()) != null) {
					String line = str;
					if (line.charAt(0) == '1' && line.charAt(2) == '3') {}
					
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
