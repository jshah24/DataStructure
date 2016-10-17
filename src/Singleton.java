
public class Singleton {
	private static Singleton instance;
	private int count;
	private Singleton(){
		instance = new Singleton();
		instance.count = 12;
	}
	
	public static Singleton getInstance(){
		return instance;
	}

	public int getCount() {
		return count;
	}
	
}
