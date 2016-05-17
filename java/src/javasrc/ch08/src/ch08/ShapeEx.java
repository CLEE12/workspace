package ch08;
    
public class ShapeEx {
	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Triangle();
		shape[1] = new Circle();
		shape[2] = new Rectangle();
		
		for(int i=0; i<shape.length; i++) {
			shape[i].draw();
			shape[i].calArea();
			
      /* 
       *for(Shape sh : shape) {
			sh.draw();
			sh.calArea();
			*/
		}
	}
}   
