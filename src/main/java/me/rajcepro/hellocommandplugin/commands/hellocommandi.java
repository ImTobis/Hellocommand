package me.rajcepro.hellocommandplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public interface hellocommandi {
    boolean onCommand(CommandSender sender, Command command, String label, String[] args);
}
