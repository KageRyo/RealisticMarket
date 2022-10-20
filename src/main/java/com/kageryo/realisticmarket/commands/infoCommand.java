package com.kageryo.realisticmarket.commands;

import com.kageryo.realisticmarket.RealisticMarket;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class infoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(args.length==1){
            if(args[0].equals("info")){
                String Message1="此插件由 KageRyo 與他的神奇蹦蹦團隊 CodeRyo 共同設計規劃開發。";
                String Message2="有任何建議與疑問歡迎至 github.com/KageRyo 反應回饋！";
                RealisticMarket.realisticMarket.getLogger().info(Message1);
                RealisticMarket.realisticMarket.getLogger().info(Message2);
                if(sender instanceof Player){
                    Player player = (Player) sender;
                    player.sendMessage(Message1);
                    player.sendMessage(Message2);
                }
            }
        }
        return false;
    }
}
