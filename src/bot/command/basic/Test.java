package bot.command.basic;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Test extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		event.getMessage().getContentRaw().split("\\s+");
		if (event.getMessage().getContentRaw().equalsIgnoreCase(Help.prefixString + "Test")) { // Test Command
			EmbedBuilder builder = new EmbedBuilder();
			builder.setColor(Color.decode("#00FFB2"));
			builder.appendDescription("I am Here");
			event.getChannel().sendMessage(builder.build()).queue();
		}
	}
}