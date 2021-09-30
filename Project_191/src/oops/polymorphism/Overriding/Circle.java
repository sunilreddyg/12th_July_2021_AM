package oops.polymorphism.Overriding;

public class Circle extends Shape
{
	
	public void draw()
	{
		System.out.println("Child class method");
	}
	
	public static void main(String args[])
	{
		
		Circle obj=new Circle();
		obj.draw();
		
		Shape ref=new Circle();
		ref.draw();
		
		Shape sh=new Shape();
		sh.draw();
		
	}

}
