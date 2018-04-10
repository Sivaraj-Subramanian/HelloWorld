package HelloWorld;

public class DownCasting {
	
//Down Casting and InstanceOf operator
	
  
	static class Dog3 extends Animal {

		static void method(Animal a) {
			if (a instanceof Dog3) {
				Dog3 d = (Dog3) a;   //downcasting
				System.out.println("ok downcasting performed");
				System.out.println("Value of Object d is: " + d);
			}
		}
   
	  public static void main (String [] args) {  
	    Animal a=new Dog3();  
	    Dog3.method(a);  
	  }  
	    
	 }  
	
}
