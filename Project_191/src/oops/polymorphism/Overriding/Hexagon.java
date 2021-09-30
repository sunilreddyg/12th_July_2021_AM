package oops.polymorphism.Overriding;

public class Hexagon extends Shape
{
	@Override  //This syntax will findout the method is really overriden or not
	public void draw()
	{
		super.draw();   //This keyword call parent class method
		System.out.println("Hexagon draw method");
	}
	
	

	public static void main(String[] args) {
		
		
		Shape s=new Hexagon();
		s.draw();
		
		

	}

}
