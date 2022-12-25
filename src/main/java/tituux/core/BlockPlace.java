package tituux.core;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace implements Listener {

    ConsoleCommandSender cmd = Bukkit.getConsoleSender();

    @EventHandler
    public void blockPlace(BlockPlaceEvent event) {
        cmd.sendMessage("A block has been placed");
    }
}
