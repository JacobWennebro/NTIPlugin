package me.jacobwennebro.ntiplugin.ntiplugin.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class NametagHandler {

    private static Team team;
    private static Scoreboard scoreboard;

    public static void changePlayerName(Player player, String prefix, String suffix) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard sb = manager.getNewScoreboard();

        Team team = sb.registerNewTeam(player.getName());


    }
}