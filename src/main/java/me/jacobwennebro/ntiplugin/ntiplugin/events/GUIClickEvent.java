package me.jacobwennebro.ntiplugin.ntiplugin.events;

import me.jacobwennebro.ntiplugin.ntiplugin.NTIPlugin;
import me.jacobwennebro.ntiplugin.ntiplugin.RoleHandler;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
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
        Player player = (Player) e.getWhoClicked();

        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_GRAY + "Välj din klass.")) {
            Material ItemType = e.getCurrentItem().getType();
            if(ItemType == Material.RED_STAINED_GLASS_PANE || ItemType == Material.LIME_STAINED_GLASS_PANE || ItemType == Material.PURPLE_STAINED_GLASS_PANE || ItemType == Material.GRAY_STAINED_GLASS_PANE) {
                e.setCancelled(true);
            } else {
                RoleHandler.set(player, e.getCurrentItem().getItemMeta().getDisplayName());

                player.setWalkSpeed(0.2F);

                player.closeInventory();
                e.setCancelled(true);
            }
        }
    }
}
