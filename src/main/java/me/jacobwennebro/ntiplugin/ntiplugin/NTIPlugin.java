package me.jacobwennebro.ntiplugin.ntiplugin;

import me.jacobwennebro.ntiplugin.ntiplugin.commands.Klass;
import me.jacobwennebro.ntiplugin.ntiplugin.events.onBlockModify;
import me.jacobwennebro.ntiplugin.ntiplugin.events.onJoin;
import me.jacobwennebro.ntiplugin.ntiplugin.events.onMove;
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
        new onBlockModify(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
