package me.jacobwennebro.ntiplugin.ntiplugin;

import me.jacobwennebro.ntiplugin.ntiplugin.commands.Klass;
import me.jacobwennebro.ntiplugin.ntiplugin.events.*;
import org.bukkit.plugin.java.JavaPlugin;


public class NTIPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        saveDefaultConfig();

        // Register Commands
        getCommand("klass").setExecutor(new Klass());

        // Register Events
        new onMove(this);
        new onJoin(this);
        new onLeave(this);
        new onBlockModify(this);
        new GUIClickEvent(this);
        new onChat(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
