package com.tisawesomeness.eternalanvils;

import org.bukkit.plugin.java.JavaPlugin;

public class EternalAnvils extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new AnvilListener(), this);
    }
}
