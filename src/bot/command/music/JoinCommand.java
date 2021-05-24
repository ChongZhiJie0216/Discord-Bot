package bot.command.music;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class JoinCommand extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		event.getMessage().getContentRaw().split("\\s+");
	}
}