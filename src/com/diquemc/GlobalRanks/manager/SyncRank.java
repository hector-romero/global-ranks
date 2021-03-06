package com.diquemc.GlobalRanks.manager;

import com.diquemc.GlobalRanks.GlobalRanks;
import org.bukkit.entity.Player;

public class SyncRank implements Runnable {
    GlobalRanks plugin;

    public SyncRank(GlobalRanks p) {
        plugin = p;
    }

    @Override
    @SuppressWarnings("deprecation")
    public void run() {
        Player[] pl = plugin.getServer().getOnlinePlayers();
        for (Player player : pl) {
            plugin.getRankManager().checkRanks(player);
        }
    }
}
