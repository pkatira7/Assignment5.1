import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle extends SuperAbstract {
          int length = 0 ; 
          int breadth = 0 ; 
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Triangle r = new Triangle();
		System.out.println("Enter the base of the triangle");
		
		
	    BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
	       r.length = Integer.parseInt(br.readLine());
	      System.out.println();
	       System.out.println("Enter the height of the triangle");
	       br = new BufferedReader(new InputStreamReader(System.in));
	       r.breadth = Integer.parseInt(br.readLine());
	       int Area = r.getArea(r.length, r.breadth);
	       
	       System.out.println("Area of the rectangle is :"+Area);
	       
	       int Perimeter = r.getPerimeter(r.length , r.breadth);
	       System.out.println("\n Perimeter of the rectangle is :" +Perimeter);
		}



	@Override
	int getArea(int length, int breadth) {
		
		
		double d = (0.5*(length * breadth));
		int x = (int) d;
		return x ;
	}

	@Override
	int getPerimeter(int length, int breadth) {
		int side1 =0 ;
		int side2 =0 ;
		int side3 =0 ;
	System.out.println("Enter the length of side 1 ");	
	BufferedReader br =new BufferedReader ( new InputStreamReader(System.in));
    
	try {
		side1 = Integer.parseInt(br.readLine());
	} catch (NumberFormatException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("Enter the length of side 2 ");	
	BufferedReader br1 =new BufferedReader ( new InputStreamReader(System.in));
	try {
		side2 = Integer.parseInt(br.readLine());
	} catch (NumberFormatException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("Enter the length of side 1 ");	
	BufferedReader br2 =new BufferedReader ( new InputStreamReader(System.in));
	try {
		side3 = Integer.parseInt(br.readLine());
	} catch (NumberFormatException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return (side1 + side2 + side3);
	}

}
