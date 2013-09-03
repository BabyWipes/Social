package me.yuzko.social;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CCreate implements CommandExecutor
{
	private Social plugin;
	public CCreate(Social plugin)
	{
		this.plugin = plugin;
		plugin = pl;
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
			if(commandLabel.equalsIgnoreCase("social") || (commandLabel.equalsIgnoreCase("s")))
			{
				if(args[0].equalsIgnoreCase("add"))
				{
					if(args[1].equalsIgnoreCase("skype"))
					{
						
					}
				}
			}
			return true;
		}
	}
}
