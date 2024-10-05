
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Main
{
	public static void main(String[] args) {
		Geometric_Shape[] geometric_shapes_arr = new Geometric_Shape[12]; 
		int ind = 0;
		
	
		//read a file
		try (BufferedReader breader = new BufferedReader(new FileReader("geoshapes.txt"))) { 
			String line;
			while ((line = breader.readLine()) != null) {
				
				String[] t = line.split(",");
					if( t.length == 2 && t[0].equals("Geometric_Circle")){ 
						try{
						    
							double radius = Double.parseDouble(t[1]); 
							geometric_shapes_arr[ind] = new Geometric_Circle(radius); 
						
							ind++;
						}catch(radius_except msg){
							System.out.println(msg.getMessage());
						}
					}
					else if( t.length == 4 && t[0].equals("Geometric_Triangle") ){
						try{
							double side1 = Double.parseDouble(t[1]); 
							double side2 = Double.parseDouble(t[2]);
							double side3 = Double.parseDouble(t[3]);
							geometric_shapes_arr[ind] = new Geometric_Triangle(side1, side2, side3);
							ind++;
						}catch(sideexcept msg){
							System.out.println(msg.getMessage());
						}
					}else if( t.length == 3 && t[0].equals("Geometric_Parallelogram")){
						try{
							double height = Double.parseDouble(t[1]);
							double width = Double.parseDouble(t[2]);
							geometric_shapes_arr[ind] = new Geometric_Parallelogram(height, width);
							ind++;
						}catch(whexception msg){
							System.out.println(msg.getMessage());
						}
					}else if( t.length == 3 && t[0].equals("Geometric_Rectangle")){
						try{
							double side1 = Double.parseDouble(t[1]);
							double side2 = Double.parseDouble(t[2]);
							geometric_shapes_arr[ind] = new Geometric_Rectangle(side1, side2); 
							ind++;
						}catch(whexception msg){
							System.out.println(msg.getMessage());
						}
					}else if( t.length == 2 && t[0].equals("Geometric_Square") ){
						try{
							double side = Double.parseDouble(t[1]);
							geometric_shapes_arr[ind] = new Geometric_Square(side); 
							
							ind++;
						} catch(whexception msg){ 
							System.out.println(msg.getMessage());
						}
					}else{
						continue;
					}
			}
				
		} catch (IOException msg) {
			System.out.println(msg.getMessage());
		} finally {
			System.out.println();
			System.out.println(ind+1 + " shapes were created:");
		
			for(Geometric_Shape shape : geometric_shapes_arr){ 
				if(shape == null)
					break;
				System.out.println(shape.toString());
			}
			
		}
		
		

}

}
