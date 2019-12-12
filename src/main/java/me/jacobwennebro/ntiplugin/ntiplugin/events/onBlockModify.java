package me.jacobwennebro.ntiplugin.ntiplugin.events;

import me.jacobwennebro.ntiplugin.ntiplugin.NTIPlugin;
import me.jacobwennebro.ntiplugin.ntiplugin.Utils;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class onBlockModify implements Listener {

    private NTIPlugin plugin;

    public onBlockModify(NTIPlugin plugin){
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onBreak(BlockBreakEvent e) {

        if(true) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Utils.FormatChat("&cDu måste välja din klass för att bygga. (/klass)"));
        }

    }

    @EventHandler
    public void onPlace(BlockPlaceEvent e) {

        if(true) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Utils.FormatChat("&cDu måste välja din klass för att bygga. (/klass)"));
        }

    }

}
