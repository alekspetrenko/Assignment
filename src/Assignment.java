
public class Assignment {

	public static void main(String[] args) {
		Elephant a1 = new Elephant();
		Elephant a2 = new Elephant();
		a1.run = 3.14f;
		a2.run = 2.54f;
		System.out.println("1: a1.run:" + a1.run + ", a2.run:" + a2.run);
		a1 = a2;
		System.out.println("1: a1.run:" + a1.run + ", a2.run:" + a2.run);
		a2.run = 4.76f;
		System.out.println("1: a1.run:" + a1.run + ", a2.run:" + a2.run);
		
		

	}

}
