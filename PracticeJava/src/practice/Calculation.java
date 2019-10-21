package practice;

public class Calculation {

	
	public static void getCalculation(int roses, int lillies, int jasmins)
	{
		FlowerFactory f1=new FlowerFactory();
		Flower rose = f1.getFlower("Rose");
		int roseCal = rose.getRate(roses);
		
		Flower lilly = f1.getFlower("Lilly");
		int lillyCal = lilly.getRate(lillies);
		
		Flower jasmin = f1.getFlower("Jasmin");
		int jasminCal = jasmin.getRate(jasmins);
		
		System.out.println(roseCal+lillyCal+jasminCal);
		
	}
	
	
	public static void main(String[] args) {
	getCalculation(5, 0, 0);

	}

}
