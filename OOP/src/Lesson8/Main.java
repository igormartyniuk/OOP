package Lesson8;

import java.net.StandardSocketOptions;

public class Main {

	public static void main(String[] args) {

		Car simple = new Car();
		
		System.out.println(simple.fuelOfTank);
		
		Car miniven = new Car("bmw", 60, 10);
		
		Car sportCar = new Car("McLaren", 70, 15);
		
		
		miniven.range();
		sportCar.range();
		
		double totalRange = miniven.range1() * 0.97;
		
		double totalRange1 = sportCar.range1() * 0.97;
		
		System.out.println(totalRange);
		
		System.out.println(totalRange1);
		
		System.out.println(miniven.totalRange(0.97));
		
		
	}

}
