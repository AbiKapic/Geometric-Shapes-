
public class Geometric_Square extends Geometric_Rectangle{
	public Geometric_Square(double side) throws whexception{
		super(side,side); // call super class constructor
	}
	
	@Override
	public String toString(){ 
		return "Geometric Square {side=" + get_h() + "}" +
				" perimeter = " + shape_perimeter();
	}
}