package com.coderyo.realisticmarket.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class TabCommand implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args){
        List<String> commandList = new ArrayList<>();
        if(args.length == 1){
            commandList.add("test");
        }
        return commandList;
    }
}
