package me.yuzko.social;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
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
		
		final FileConfiguration config = this.getConfig();
		config.addDefault("Message.to.send", "Hello, this is our message to send");
		config.options().copyDefaults(true);
		saveConfig();
		
		getCommand("social").setExecutor(new Commands(this));
	}
	
	@Override
	public void onDisable()
	{
		PluginDescriptionFile pdffile = this.getDescription();
		logger.info(pdffile.getName() + " Has been disabled!");
	}
}
