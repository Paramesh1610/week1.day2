package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int addTwoNo = obj.addTwoNo(2, 4, 6);
		System.out.println(addTwoNo);
		
		int subTwoNo = obj.subTwoNo(4, 2);
		System.out.println(subTwoNo);
		
		double multiTwoNo = obj.multiTwoNo(20, 10);
		System.out.println(multiTwoNo);
		
		float divTwoNo = obj.divTwoNo(25, 2);
		System.out.println(divTwoNo);
		
	}

}
