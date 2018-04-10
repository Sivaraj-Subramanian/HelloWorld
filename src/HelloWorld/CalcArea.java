package HelloWorld;

public class CalcArea {

	
	public double calcSquare(double radius){
		
		double pi = 3.14;
	
		double areaOfCircle = pi * radius * radius;
		
		System.out.println("Area Of Circle with radius " + radius + " is: " + areaOfCircle);
		
		return areaOfCircle;
						
	}
	
	public double calcVolume(double radius){
		
		double pi = 3.14;
	
		double volumeOfCircle = pi * radius * radius * radius;
		
		System.out.println("Volume Of Circle with radius " + radius + " is: " +volumeOfCircle);
		
		System.out.println("--------------------");
		
		return volumeOfCircle;
						
	}
	

}
