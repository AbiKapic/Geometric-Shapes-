

public class Geometric_Triangle implements Geometric_Shape {
	private double side1;
	private double side2;
	private double side3; 
	
	
	public Geometric_Triangle(double s1, double s2, double s3) throws sideexcept{
		if(s1 <= 0 || s2 <= 0 || s3 <= 0 || (s1 + s2) <= s3){  
						throw new sideexcept("Invalid!");

			
		}
	        this.side1 = s1;
			this.side2 = s2;
			this.side3 = s3;
	}
	
	public double get_side1(){
		return side1;
	}
	public double get_side2(){
		return side2;
	}
	public double get_side3(){
		return side3;
	}
	public void set_side1(double s1) throws sideexcept{
		if(s1 <= 0){
		    			throw new sideexcept("Invalid!");


		}	
				    		this.side1 = s1;

		
	}
	public void set_side2(double s2) throws sideexcept{
		if(s2 <= 0){
		    			throw new sideexcept("Invalid!");

		}	
		        this.side2 = s2;

	}
	public void set_side3(double s3) throws sideexcept{
		if(s3 <= 0){
				    throw new sideexcept("Invalid!");

		
		}	
				    		    		this.side3 = s3;


	}
	


	@Override
	public double shape_perimeter() { // calculate perimeter for a triangle 
	
		return get_side1() + get_side2() + get_side3(); 
	}
	
	public String toString(){ // convert to string a triangle msg 
		return "Geometric Triangle {side 1 =" + get_side1() + ", side 2=" + get_side2() + ", side 3=" + get_side3() + "}" +
				" perimeter = " + shape_perimeter();
	}

}