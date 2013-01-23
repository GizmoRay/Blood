package com.gizmoray.blood;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Blood extends JavaPlugin {
	public final Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PluginListener(), this);
		PluginDescriptionFile pdfFile = this.getDescription();
		this.log.info(pdfFile.getName() + " " + " v" + pdfFile.getVersion()
				+ " : Has been enabled");
	}
}