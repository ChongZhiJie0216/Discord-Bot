package bot.command.basic;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Ping extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		event.getMessage().getContentRaw().split("\\s+");
		if (event.getMessage().getContentRaw().equalsIgnoreCase(Help.prefixString + "ping")) { // Ping Command															// API????
			long Restping = event.getJDA().getRestPing().complete();
			long ping = event.getJDA().getGatewayPing();
			EmbedBuilder builder = new EmbedBuilder();
			builder.setColor(getColorByPing(ping));
			builder.setTitle("Pong");
			builder.appendDescription("\n Responding Ping : " + Restping);
			builder.appendDescription("\n Gateway Ping : " + ping);
			event.getChannel().sendMessage(builder.build()).queue();
		}
	}
	private Color getColorByPing(long ping) {
		if (ping < 100)
			return Color.cyan;
		if (ping < 400)
			return Color.green;
		if (ping < 700)
			return Color.yellow;
		if (ping < 1000)
			return Color.orange;
		return Color.red;
	}
}