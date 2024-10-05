
public class Geometric_Rectangle extends Geometric_Parallelogram { //subclass
	public Geometric_Rectangle(double width, double height) throws whexception {
	    
			super(width, height); //call superclass's constructor
	}
	
	@Override
	public String toString(){ 
	    
		return "Geometric Rectangle {width=" + get_w() + ", height=" + get_h() + "}" +
				" perimeter = " + shape_perimeter();
	}
}