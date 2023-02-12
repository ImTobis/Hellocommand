package me.rajcepro.hellocommandplugin.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class hellocommand implements hellocommandi {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
 if (sender instanceof Player) {
 Player player = (Player) sender;
     ItemStack stones = new ItemStack(Material.STONE);

     ItemStack dirt = new ItemStack(Material.DIRT);

             stones.setAmount(6);
     player.getInventory().addItem(stones, dirt);
 }

        return true;
    }
}
