package HelloWorld;

import org.junit.Test;

public class Circle {
  
  private double radius;
  
  public Circle(double radius) {
	  this.radius = radius;
  }
  
  public Circle() {
	  this.radius=10;
  }
  
    public double getRadius() {
	  return radius;
  }
  
  public void setRadius(double radius) {
	  this.radius = radius;
  }

	public double area() {
		double Carea = 3.14 * (this.radius) * (this.radius);
		return Carea;
	}
	
	public double volume() {
		double Cvolume = 3.14 * (this.radius) * (this.radius);
		return Cvolume;
	}

	
	public String toString() {
		return "Circle Properties: " + "\n" + "Radius=" + this.getRadius() + "\n" + "Area = " + this.area() + "\n" 
				+ "Volume is:" + this.volume() + "\n" + "-------------------";
	}
	
	
	@Test
	
	public void testCircle() {
		Circle circle1 = new Circle();
		
		circle1.setRadius(25);
		
	//	double area1 = circle1.area();
		
		circle1.toString();
		
	}
	
  
}


