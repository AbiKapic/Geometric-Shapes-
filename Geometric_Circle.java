

public class Geometric_Circle implements Geometric_Shape{
	
	private double r;
	
	//radius
	
	
	
	
	public Geometric_Circle(double radius) throws radius_except{
		if(radius <= 0) {
		    	   throw new radius_except("INVALID RADIUS");  

		}
		
		   this.r = radius;

	
	}
	
	
	public double get_r(){ // getter function to recieve radius
		return r;
	}
	
	//setter
	public void set_R(double radius) throws radius_except{
	
		if(radius <= 0) {
	   throw new radius_except("INVALID RADIUS");  

		}
				    		this.r = radius;

	
	}
	

	@Override
	public double shape_perimeter() { 
		return r * 2 * Math.PI ; 
	}
	
	@Override
	public String toString(){ 
		return "Geometric Circle {radius=" + this.r + "}" + " perimeter = " + shape_perimeter();
	}

}