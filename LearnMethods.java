package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {
		//ClassName objectName = new ClassName();
		LearnMethods obj = new LearnMethods();
		//obj.methodName();
		obj.printCarname();
		
		int Carregno = obj.getCarregno();
		System.out.println(Carregno);
		
		String Carvarient = obj.getCarvarient();
		System.out.println(Carvarient);
		
		int multiply = obj.multiply(5, 2);
		System.out.println(multiply);
	}
public void printCarname() {
	System.out.println("Polo");
}
public int getCarregno() {
	int Carregno = 2434;
	return Carregno;
}
public String getCarvarient() {
	return "petrol";
}
public int multiply(int a, int b) {
	return a*b;
}

}
