package tituux.core;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {

    ConsoleCommandSender cmd = Bukkit.getConsoleSender();

    @EventHandler
    public void blockBreak(BlockBreakEvent event) {
        cmd.sendMessage("A block has been broken!");

        Block block = event.getBlock();
        if (block.getType() == Material.ZOMBIE_HEAD) {
            block.setType(Material.DIRT);
            event.setCancelled(true);
        } else {
            Player player = event.getPlayer();
            String name = player.getName();
            // player.sendMessage("$aHola " + name);
        }
    }
}
