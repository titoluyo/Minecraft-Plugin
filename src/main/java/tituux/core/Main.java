package tituux.core;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import tituux.commands.Heal;

public final class Main extends JavaPlugin {

    ConsoleCommandSender cmd = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        PluginDescriptionFile pdf = this.getDescription();
        cmd.sendMessage("§aEl Tituux Plugin ha sido iniciado - " + pdf.getVersion());
        getCommand("heal").setExecutor(new Heal());
        getServer().getPluginManager().registerEvents(new BlockBreak(), this);
        getServer().getPluginManager().registerEvents(new BlockPlace(), this);
    }

    @Override
    public void onDisable() {
        cmd.sendMessage("§cEl Tituux Plugin ha sido desactivado");
    }
}
