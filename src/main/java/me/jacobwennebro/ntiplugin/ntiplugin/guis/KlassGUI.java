package me.jacobwennebro.ntiplugin.ntiplugin.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class KlassGUI {

    private static ItemStack KlassIkon(String klass, ChatColor color, Material ikon) {
        ItemStack item = new ItemStack(ikon);
        ItemMeta item_meta = item.getItemMeta();

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "* Tryck här om du går i "+klass);

        item_meta.setDisplayName(color + "" + ChatColor.BOLD + klass);
        item_meta.setLore(lore);

        item.setItemMeta(item_meta);

        return item;
    }

    public static void open(Player player) {

        Inventory gui = Bukkit.createInventory(player, 54, "Välj din klass.");

        ItemStack Teknik = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
        ItemMeta Teknik_meta = Teknik.getItemMeta();
        Teknik_meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.UNDERLINE + "Teknikprogrammet");
        Teknik.setItemMeta(Teknik_meta);

        ItemStack El = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta El_meta = El.getItemMeta();
        El_meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.UNDERLINE + "El- och energiprogrammet");
        El.setItemMeta(El_meta);

        ItemStack Estet = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta Estet_meta = Estet.getItemMeta();
        Estet_meta.setDisplayName(ChatColor.RED + "" + ChatColor.UNDERLINE + "Estetprogrammet");
        Estet.setItemMeta(Estet_meta);

        ItemStack Handels = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta Handels_meta = Handels.getItemMeta();
        Handels_meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.UNDERLINE + "Handelsprogrammet");
        Handels.setItemMeta(Handels_meta);

        ItemStack TE19 = KlassIkon("TE19", ChatColor.LIGHT_PURPLE, Material.PINK_CONCRETE);
        ItemStack TE18 = KlassIkon("TE18", ChatColor.DARK_PURPLE, Material.MAGENTA_CONCRETE);
        ItemStack TE17 = KlassIkon("TE17", ChatColor.DARK_PURPLE, Material.PURPLE_CONCRETE);
        ItemStack TE4 = KlassIkon("TE4", ChatColor.YELLOW, Material.YELLOW_CONCRETE);

        ItemStack EE19 = KlassIkon("EE19", ChatColor.GREEN, Material.LIME_CONCRETE);
        ItemStack EE18 = KlassIkon("EE18", ChatColor.DARK_GREEN, Material.GREEN_CONCRETE);
        ItemStack EE17 = KlassIkon("EE17", ChatColor.DARK_GREEN, Material.GREEN_TERRACOTTA);

        ItemStack ES19 = KlassIkon("ES19", ChatColor.RED, Material.PINK_TERRACOTTA);
        ItemStack ES18 = KlassIkon("ES18", ChatColor.DARK_RED, Material.RED_TERRACOTTA);
        ItemStack ES17 = KlassIkon("ES17", ChatColor.DARK_RED, Material.RED_CONCRETE);

        ItemStack HA19 = KlassIkon("HA19", ChatColor.WHITE, Material.LIGHT_GRAY_CONCRETE);
        ItemStack HA17 = KlassIkon("HA17", ChatColor.DARK_AQUA, Material.CYAN_CONCRETE);

            /*
            ItemStack[] klasser = {
                    TE19, TE18, TE17, TE4,
                    EE19, EE18, EE17,
                    ES19, ES18, ES17,
                    HA19, HA17
            };
            */

        gui.setItem(10, Teknik);
        gui.setItem(19, El);
        gui.setItem(28, Estet);
        gui.setItem(37, Handels);

        gui.setItem(12, TE19);
        gui.setItem(13, TE18);
        gui.setItem(14, TE17);
        gui.setItem(15, TE4);

        gui.setItem(21, EE19);
        gui.setItem(22, EE18);
        gui.setItem(23, EE17);

        gui.setItem(30, ES19);
        gui.setItem(31, ES18);
        gui.setItem(32, ES17);

        gui.setItem(39, HA19);
        gui.setItem(40, HA17);

        player.openInventory(gui);
    }
}
