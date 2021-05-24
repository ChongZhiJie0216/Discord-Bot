package bot;

import javax.security.auth.login.LoginException;

import bot.command.basic.Clear;
import bot.command.basic.Help;
import bot.command.basic.Info;
import bot.command.basic.Ping;
import bot.command.basic.Test;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Main {
	public static void main(String[] args) throws LoginException, InterruptedException {
		JDABuilder builder = JDABuilder.createDefault("");// Token
		builder.addEventListeners(new Listener());
		builder.setActivity(Activity.playing("=help"));// Activity
		JDA jda = builder.build();
		jda.awaitReady();
		
		//Command
		jda.addEventListener(new Help());
		jda.addEventListener(new Clear());
		jda.addEventListener(new Ping());
		jda.addEventListener(new Test());
		jda.addEventListener(new Info());
		
		//Event
//		jda.addEventListener(new GuildMemberJoin());
//		jda.addEventListener(new GuildMemberLeave());
		
		//Minecraft
//		jda.addEventListener(new Minecraft());
		
		//MusicBot
//		jda.addEventListener(new JoinCommand());
	}	
}