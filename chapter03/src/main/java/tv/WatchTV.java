package tv;

public class WatchTV {

	public static void main( String[] args ) {

		TV tv = new TV(255, 20, true);

		tv.status();

		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();

		tv.channel(0);
		tv.status();

		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();

		tv.power(false);
		tv.status();

		}

}
