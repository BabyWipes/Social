package me.yuzko.social;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Social extends JavaPlugin
{
	public static Logger logger = Logger.getLogger("Minecraft");
	public static Social plugin;
	
	public Social()
	{
	}
	
	@Override
	public void onEnable()
	{
		plugin = this;
		PluginDescriptionFile pdffile = this.getDescription();
		logger.info(pdffile.getName() + " Version " + pdffile.getVersion()
				+ " Has been enabled!");
	}
	
	@Override
	public void onDisable()
	{
		PluginDescriptionFile pdffile = this.getDescription();
		logger.info(pdffile.getName() + " Has been disabled!");
	}
}
