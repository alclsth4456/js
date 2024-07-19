package test3;

abstract class Shape{
	public abstract void draw();
}

class Triangle extends Shape{

	@Override
	public void draw() {

		System.out.println("draw Triangle");
	}
	
}

class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("draw Circle");
		
	}
	
}


public class Test9 {

	public static void main(String[] args) {

		Test9 here = new Test9();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw(Shape obj) {
		obj.draw();
	}

	
}
