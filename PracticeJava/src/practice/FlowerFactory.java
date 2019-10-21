package practice;

public class FlowerFactory {

	
	public Flower getFlower(String flowerName)
	{
		try {
			if (flowerName.equals(null)) {
				return null;
			}
			if (flowerName.equalsIgnoreCase("Rose")) {
				return new Rose();
			}
			else if (flowerName.equalsIgnoreCase("Lilly")) {
				return new Lilly();
			}
			else if (flowerName.equalsIgnoreCase("Jasmin")) {
				return new Jasmin();
			}
			
		} catch (Exception e) {
			
		}
		
		return null;
		
	}

}
