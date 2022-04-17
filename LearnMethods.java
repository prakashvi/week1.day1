package week1.days2;

public class LearnMethods {

	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		obj.printCarName();
		int carRegNumber = obj.carRegNumber1();
		System.out.println(carRegNumber);
		String carVarient1 = obj.getCarVarient();
		System.out.println(carVarient1);
		float multipleTwoNumber1 = obj.multipleTwoNumber();
		System.out.println(multipleTwoNumber1);
	}

	public void printCarName() {
		System.out.println("BMW");
	}

	public int carRegNumber1() {
		int reg = 1234;
		return reg;
	}

	public String getCarVarient() {
		String var = "steering";
		return var;
	}

	public float multipleTwoNumber() {
		int in = 2;
		float f=(float) 2.5;
		return(in*f);
	}

	
}
