package tituux.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (sender instanceof Player) {
            p.setHealth(20);
            p.setFoodLevel(20);
            p.sendMessage("Te has curado");
        } else {
            Bukkit.getConsoleSender().sendMessage("Sólo para jugadores");
        }
        return false;
    }
}
