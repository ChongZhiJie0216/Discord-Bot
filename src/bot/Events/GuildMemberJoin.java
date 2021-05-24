package bot.Events;

import java.awt.Color;
import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildMemberJoin extends ListenerAdapter {
	
	String[] messages = {
			"[member] joined. You must construct additional pylons.",
			"Never gonna give [member] up. Never let [member] down!",
			"Hey! Listen! [member] has joined!",
			"Ha! [member] has joined! You activated my trap card!",
			"We've been expecting you, [member].",
			"It's dangerous to go alone, take [member]!",
			"Swoooosh. [member] just landed.",
			"Brace yourselves. [member] just joined the server.",
			"A wild [member] appeared."
	};
	@Override
	public void onGuildMemberJoin(GuildMemberJoinEvent event) {
		Random rand = new Random();
		int number = rand.nextInt(messages.length);
		
		EmbedBuilder builder = new EmbedBuilder();
		builder.setColor(Color.decode("#00FFB2"));
		builder.setTitle("New Memebers join");
		builder.setDescription(messages[number].replace("[member]", event.getMember().getAsMention()));
	
		event.getGuild().getDefaultChannel().sendMessage(builder.build()).queue();
		
	}
}
