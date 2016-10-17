
public class CallSingleton {
	public static void main(String[] args){
		Singleton s = Singleton.getInstance();
		System.out.println(s.getCount());
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.getCount());
	}
}
