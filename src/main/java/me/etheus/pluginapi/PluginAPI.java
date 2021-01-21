package me.etheus.pluginapi;

import me.etheus.pluginapi.inventory.gui.GUIListener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Made by Ethan Richards
 * August 02, 2020
 */
public class PluginAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GUIListener(), this);
    }
}
