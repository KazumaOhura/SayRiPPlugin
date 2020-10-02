package net.kasmin.sayrip;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public final class SayRip extends JavaPlugin implements Listener {

    /**
     * Call this plugin enabled
     */
    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("SayRiP Plugin is enabled.");
    }

    /**
     * Call this plugin disabled
     */
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("SayRiP Plugin is disabled.");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, Command cmd, @NotNull String commandLabel, String[] args){
        if(cmd.getName().equalsIgnoreCase("test")){
            getLogger().info("test");
            return true;
        }
        return false;
    }

    /*
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage( event.getPlayer().getName() + "さんこんにちは！" );
    }
    */

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        event.setKeepInventory(true);
        event.setDeathMessage("RiP:" + event.getEntity().getName());
    }

}
