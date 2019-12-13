package me.jacobwennebro.ntiplugin.ntiplugin.events;

import me.jacobwennebro.ntiplugin.ntiplugin.NTIPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class onChat implements Listener {

    private NTIPlugin plugin;

    public onChat(NTIPlugin plugin){
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();

        e.setFormat(player.getName() + ": " + e.getMessage());
    }
}
