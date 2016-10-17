
public class Person extends AbstractHuman implements Pagal1, Pagal2 {

	String name;
	int SSN;
	int height;
	String address;
	int phone;
	
	
	public void walk()

	{
		System.out.println("Waling "+this.name+" fasts");
	}
	
	public void talk()
	{
		System.out.println("Person "+this.name+" talk");
	}
	
	@Override
	public void goMad() {
		// TODO Auto-generated method stub
		System.out.println("Person is mad "+ name);
	}
	
	@Override
	public void goDie(){
		System.out.println("Person dies "+name);
	}
	
	
	public static void main(String args[])
	{
		Person p=new Person();
		p.name="ABC";
		p.SSN=122445;
		p.walk();
		Person p2 = new Person();
		p2.name="Jaduuu";
		p2.talk();
		p2.goMad();
		p2.goJump();
		p2.goDie();
		Human h = new Human ();
		h.pray();
		System.out.println(p.a);
		System.out.println(p2.a);
	}

	@Override
	public void goRun() {
		// TODO Auto-generated method stub
		
	}

	
	
}
