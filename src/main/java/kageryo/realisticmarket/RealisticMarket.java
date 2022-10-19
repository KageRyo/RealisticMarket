package kageryo.realisticmarket;

import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.plugin.java.JavaPlugin;

public class RealisticMarket extends JavaPlugin {
    public static RealisticMarket realisticMarket;
    public static Economy econ = null;
    public static Permission perms = null;
    public static Chat chat = null;

    @Override
    public void onEnable() {
        // Plugin startup logic
        realisticMarket = this;
        this.getLogger().info("RealisticMarket Plugin By.K6Dev@DreamFuture-Studio"); // 插件歡迎訊息(檢查是否運作用)

        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            this.getLogger().info("未偵測到經濟系統，請安裝後再試。");
            // 禁用插件
            getServer().getPluginManager().disablePlugin(this);
            return;
        }else{
            this.getLogger().info("經濟系統已啟用。");
        }
    }
}