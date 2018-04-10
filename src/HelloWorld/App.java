package HelloWorld;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Circle> circles = new ArrayList<Circle>();
        
		for (double i=1; i<5; i++ )
		{
		circles.add(new Circle(i));
		}
		
		for (Circle circle:circles)
		{
			System.out.println(circle);
		}

		
        
	}

}
