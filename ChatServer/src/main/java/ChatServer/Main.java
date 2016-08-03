package main.java.ChatServer;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {
	@Override
	public void onLoad() {
		this.getLogger().info("[ChatServer] Loaded..");
	}
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getLogger().info("[ChatServer] Enabled!");
	}
	
	@Override
	public void onDisable() {
		this.getLogger().info("[ChatServer] Disabled!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String args[]) {
		switch(command.getName()) {
			case "hello":
				String message = "";
				if(args.length == 0)
					sender.sendMessage("Please type a message /hello <msg>");
				if(args.length > 0) {
					for(int i = 0;i < args.length; i++) {
						message += args[i];
					}
					sender.sendMessage(sender.getName() + " " + message);
				}
			break;
		}
		return true;
	}
}