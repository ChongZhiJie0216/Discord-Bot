package bot;

import javax.security.auth.login.LoginException;

import bot.command.command;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Main {
	public static void main(String[] args) throws LoginException, InterruptedException {
		JDABuilder builder = JDABuilder.createDefault("");// Token
		builder.setActivity(Activity.watching("=help"));// Activity
		JDA jda = builder.build();
		jda.addEventListener(new command());
		jda.awaitReady();
		System.out.println("Bot is Start");
	}
}
