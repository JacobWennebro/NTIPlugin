package me.jacobwennebro.ntiplugin.ntiplugin;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigurationSetup {

    private  static File file;
    private static FileConfiguration customFile;

    // Generates language.yml for configuration
    public static void setup(){
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("NTIPluginReworked").getDataFolder(), "language.yml");

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {

            }
        }
        customFile = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration get(){
        return customFile;
    }

    public static void save() {
        try {
            customFile.save(file);
        } catch (IOException e) {
            System.out.println("Failed to save language.yml config file");
        }
    }

    public static void reload() {
        customFile = YamlConfiguration.loadConfiguration(file);
    }
}
