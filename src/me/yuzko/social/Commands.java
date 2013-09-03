package me.yuzko.social;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import me.yuzko.social.*;

public class Commands implements CommandExecutor
{

	Social plugin;


	public Commands(Social plugin)
	{
		this.plugin = plugin;
	}


	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		String name = sender.getName();
		if(!(sender instanceof Player))
		{
			return false;
		}
		else
		{
			if(args.length == 2)
			{
				if(commandLabel.equalsIgnoreCase("social") || (commandLabel.equalsIgnoreCase("s")))
				{
					if(args[0].equalsIgnoreCase("add"))
					{
						if(args[1].equalsIgnoreCase("skype"))
						{
							if(plugin.getConfig().getString("Player.Skype.Name").contains(name))
							{
								sender.sendMessage(ChatColor.RED + "Your Skype account is already registered!");
							}
							else
							{
								plugin.getConfig().addDefault("Player.Skype.Name", name);
								plugin.getConfig().addDefault("Player.Skype.Name.Skype", args[2]);
							}
						}
					}
					else
					{
						if(args[0].equalsIgnoreCase("check"))
						{
							if(args[1].equalsIgnoreCase("skype"))
							{
								if(!(plugin.getConfig().getString("Player.Skype.Name")).contains(name))
								{
									sender.sendMessage(ChatColor.RED + "You have not registered your Skype Account!");
								}
								else
								{
									if((plugin.getConfig().getString("Player.Skype.Name.Skype") == null))
									{
										sender.sendMessage(ChatColor.RED + "You have not registered your Skype Account!");
									}
									else
									{
										sender.sendMessage(ChatColor.BLUE + "[" + ChatColor.AQUA + "Skype" + ChatColor.BLUE + "] " + plugin.getConfig().getString("Player.Skype.Name.Skype"));
									}
								}
							}
						}
					}
					return true;
				}
			}
			else
			{
				sender.sendMessage(ChatColor.RED + "Invalid command!");
			}
			return false;
		}
	}

}
