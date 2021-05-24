package bot.command.basic;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Info extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		event.getMessage().getContentRaw().split("\\s+");
		if (event.getMessage().getContentRaw().equalsIgnoreCase(Help.prefixString + "Info")) { // Information Command
			EmbedBuilder builder = new EmbedBuilder();
			builder.setColor(Color.decode("#00FFB2"));
			builder.setTitle("🥚4-Bot Information");
			builder.setDescription("Complete useless information about a useless 🥚4-Bot Information");
			builder.setFooter("Created by ChongZhiJie-04#9603", event.getMember().getUser().getAvatarUrl());
			event.getChannel().sendMessage(builder.build()).queue();
		}
	}
}