package bot.command.basic;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Help extends ListenerAdapter {
	public static String prefixString = "=";

	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		if (event.getMessage().getContentRaw().equalsIgnoreCase(prefixString + "help")) { // Help Command List
			EmbedBuilder builder = new EmbedBuilder();
			builder.setColor(Color.decode("#00FFB2"));
			builder.setTitle("Help Command");
			builder.appendDescription("`" +prefixString + "help` - A help command\n");
			builder.appendDescription("`" +prefixString + "Ping` -Ping Command\n");
			builder.appendDescription("`" +prefixString + "Test` -Tested Bot\n");
			builder.appendDescription("`" +prefixString + "Info` -Bot Information\n");
			builder.appendDescription("`" +prefixString + "Clear` -Clear a Message\n");
			builder.setFooter("Created by ChongZhiJie-04#9603", event.getMember().getUser().getAvatarUrl());
			event.getChannel().sendMessage(builder.build()).queue();
		}
	}

	public TextChannel getChannel() {
		// TODO Auto-generated method stub
		return null;
	}
}