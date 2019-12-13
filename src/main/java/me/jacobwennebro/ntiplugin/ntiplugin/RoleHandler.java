package me.jacobwennebro.ntiplugin.ntiplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class RoleHandler {

    private static ScoreboardManager manager = Bukkit.getScoreboardManager();
    private static Scoreboard sb = manager.getNewScoreboard();

    public static void set(Player player, String klass) {

        player.sendMessage("Du gick med i klass "+klass);

        Team role;

        if(sb.getTeam(klass) != null) {
            role = sb.getTeam(klass);
        } else {
            role = sb.registerNewTeam(klass);
        }

        role.setPrefix(klass + " ");
        role.addEntry(player.getName());

        player.setScoreboard(sb);

        if(player.hasPotionEffect(PotionEffectType.INVISIBILITY)) {
            player.removePotionEffect(PotionEffectType.INVISIBILITY);
        }
    }

}
