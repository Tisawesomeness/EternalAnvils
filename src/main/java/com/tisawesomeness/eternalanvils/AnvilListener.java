package com.tisawesomeness.eternalanvils;

import com.destroystokyo.paper.event.block.AnvilDamagedEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class AnvilListener implements Listener {
    @EventHandler
    public void onAnvilDamage(AnvilDamagedEvent e) {
        if (e.getDamageState() == AnvilDamagedEvent.DamageState.BROKEN) {
            e.setBreaking(false);
        }
    }
}
