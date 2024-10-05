
public class Geometric_Parallelogram implements Geometric_Shape{ 
	
	private double h;
	private double w; // width and height private attributes 
	
	public Geometric_Parallelogram(double height, double width) throws whexception{
		if(width <=0 || height <= 0 ){ 
		    		throw new whexception("Invalid!"); 

		    
		}
		
		
		    this.w = width;
			this.h = height;

	}
	
	public double get_w(){
		return w;
	}
	public double get_h(){
		return h;
	}
	public void set_w(double width) throws whexception{
		if(width <= 0){
		      	throw new whexception("Invalid!");

			
		}
					      	this.w = width;


	}
	
	public void set_h(double height) throws whexception{
		if(height <= 0){
		    	        		    	throw new whexception("Invalid!");


		
		}
		
				    	        	this.h = height;


	}
	
	
	@Override
	public double shape_perimeter() { 
		return get_w()*2 + get_h()*2; 
	}
	
	@Override
	public String toString(){
		return "Geometric Parallelogram {width=" + get_w() + ", height=" + get_h() + "}" +
				" perimeter = " + shape_perimeter();
	}

}