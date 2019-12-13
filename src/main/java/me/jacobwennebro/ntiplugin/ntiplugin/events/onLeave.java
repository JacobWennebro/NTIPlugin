package me.jacobwennebro.ntiplugin.ntiplugin.events;

import me.jacobwennebro.ntiplugin.ntiplugin.NTIPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onLeave implements Listener {

    private NTIPlugin plugin;

    public onLeave(NTIPlugin plugin){
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();

        player.getScoreboard().getTeams().clear();
    }

}
