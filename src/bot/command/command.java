package bot.command;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class command extends ListenerAdapter {
	String prefixString = "=";
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		if (e.getMessage().getContentRaw().equalsIgnoreCase(prefixString + "help")) { //Help Command List
			EmbedBuilder builder = new EmbedBuilder();
			builder.setColor(Color.decode("#00FFB2"));
			builder.setTitle("Help Command");
			builder.appendDescription(prefixString + "help - A help command\n");
			builder.appendDescription(prefixString + "ping -Ping Command\n");
			e.getChannel().sendMessage(builder.build()).queue();
		
		} else if (e.getMessage().getContentRaw().equalsIgnoreCase(prefixString + "ping")) { //Ping Command API????
			long Restping = e.getJDA().getRestPing().complete();
			long ping = e.getJDA().getGatewayPing();
			EmbedBuilder builder = new EmbedBuilder();
			builder.setColor(getColorByPing(ping));
			builder.setTitle("Pong");
			builder.appendDescription("\n Responding Ping : " + Restping );
			builder.appendDescription("\n Gateway Ping : " + ping);
			e.getChannel().sendMessage(builder.build()).queue();
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