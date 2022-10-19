package com.kageryo.realisticmarket.commands;

import com.kageryo.realisticmarket.RealisticMarket;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MainCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(args.length==1){
            if(args[0].equals("test")){
                String testMessage="測試訊息";
                RealisticMarket.realisticMarket.getLogger().info(testMessage);
                if(sender instanceof Player){
                    Player player = (Player) sender;
                    player.sendMessage(testMessage);
                }
            }
        }
        return false;
    }
}
