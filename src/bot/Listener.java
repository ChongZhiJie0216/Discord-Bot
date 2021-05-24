package bot;

import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter{
	
	@Override
	public void onReady(ReadyEvent event) {
		System.out.printf("%#s is Ready",event.getJDA().getSelfUser());
	}
}
	