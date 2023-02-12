package me.rajcepro.hellocommandplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class Hellocommandplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("kit").setExecutor(new CommandKit() {
            @Override
            public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
                return false;
            }
        });

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
