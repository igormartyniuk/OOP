package Lesson8;

public class Car {

	String brend;
	int fuelOfTank;
	int kmPerLits;
	
	public Car(){
		
	}
	
	
	public Car(String brend, int fuelOfTank, int kmPerLits) {
		this.brend = brend;
		this.fuelOfTank = fuelOfTank;
		this.kmPerLits = kmPerLits;
	}


	public void drive(){
		System.out.println("drive");
	}
	
	public void stop(){
		System.out.println("stop");
	}
	
	public Car(int fuelOfTank, int kmPerLits) {
		this.fuelOfTank = fuelOfTank;
		this.kmPerLits = kmPerLits;
	}


	public void parking(){
		System.out.println("parking");
	}
	
	
	public void range(){
		System.out.println(brend + " can range "+fuelOfTank * kmPerLits);
	}
	
	public int range1(){
		int range = fuelOfTank * kmPerLits;
		System.out.println(brend + " can range "+range);
		
		return range;
	}
	
	public String totalRange(double percentOfPeople){
		int range = fuelOfTank * kmPerLits;
		double totalRange = range * percentOfPeople;
		
		String res = brend + " can range "+totalRange;
		
		return res;
	}
	
	
	
	
	
	
	
	
	
}
