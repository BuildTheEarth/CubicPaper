package net.buildtheearth.cubicpaper.notsocubic;

import org.bukkit.plugin.java.JavaPlugin;

public final class NotSoCubic extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getLogger().info("Your paper is now cubic!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
