package com.kageryo.realisticmarket;

import java.util.logging.Logger;

import com.kageryo.realisticmarket.commands.MainCommand;
import com.kageryo.realisticmarket.commands.TabCommand;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class RealisticMarket extends JavaPlugin {

    public static RealisticMarket realisticMarket;
    private static final Logger log = Logger.getLogger("Minecraft");


    @Override
    public void onDisable() {
        log.info(String.format("[%s] Disabled Version %s", getDescription().getName(), getDescription().getVersion()));
    }

    @Override
    public void onEnable() {
        realisticMarket = this;
        // getLogger info
        this.getLogger().info("RealisticMarket by K6Dev.");
        // vauitAPI setup
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            this.getLogger().info("未偵測到經濟系統，請安裝後再試。");
            // 禁用插件
            getServer().getPluginManager().disablePlugin(this);
            return;
        }else{
            this.getLogger().info("經濟系統已啟用。");
        }
        // commands
        Bukkit.getPluginCommand("realisticmarket").setExecutor(new MainCommand());
        Bukkit.getPluginCommand("realisticmarket").setTabCompleter(new TabCommand());
    }
}