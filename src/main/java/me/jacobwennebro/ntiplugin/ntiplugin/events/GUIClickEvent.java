package me.jacobwennebro.ntiplugin.ntiplugin.events;

import me.jacobwennebro.ntiplugin.ntiplugin.NTIPlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIClickEvent implements Listener {

    private NTIPlugin plugin;

    public GUIClickEvent(NTIPlugin plugin){
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void ClickEvent(InventoryClickEvent e) {

        e.setCancelled(true);
    }
}
