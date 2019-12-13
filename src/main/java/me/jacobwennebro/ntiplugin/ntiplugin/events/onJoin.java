package me.jacobwennebro.ntiplugin.ntiplugin.events;

import me.jacobwennebro.ntiplugin.ntiplugin.NTIPlugin;
import me.jacobwennebro.ntiplugin.ntiplugin.Utils;
import me.jacobwennebro.ntiplugin.ntiplugin.guis.KlassGUI;
import org.bukkit.Bukkit;
import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class onJoin implements Listener {

    private NTIPlugin plugin;

    public onJoin(NTIPlugin plugin){
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        if(player.getScoreboard().getTeams().isEmpty()) {
            Configuration Config = plugin.getConfig();

            KlassGUI.open(player);

            List list = Config.getList("introduction");
            String message = Utils.FormatChat(String.join("\n", list));
            player.sendMessage(Utils.FormatCustomVariables(message, player));
            PotionEffect Invis = new PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 100, true);

            player.addPotionEffect(Invis);
        }
        else {
            if(player.hasPotionEffect(PotionEffectType.INVISIBILITY)) {
                player.removePotionEffect(PotionEffectType.INVISIBILITY);
            }
        }
    }
}
