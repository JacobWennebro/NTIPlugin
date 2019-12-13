package me.jacobwennebro.ntiplugin.ntiplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Utils {

    public static String FormatChat (String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static String FormatCustomVariables (String message, Player player) {

        message = message.replace("[player]", player.getName());
        message = message.replace("[newline]", "\n"+ChatColor.WHITE+"\n");

        return message;
    }
}
