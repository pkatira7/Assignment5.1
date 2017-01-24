import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle extends SuperAbstract{

	 int length; 
	 int breadth; 
	public static void main(String[] args) throws NumberFormatException, IOException {
System.out.println("Enter the radius of the circle");
		
		Circle r = new Circle();
	    BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
	       r.length = Integer.parseInt(br.readLine());
		int area = r.getArea(r.length, r.breadth);
		System.out.println("Area of the circle is:"+area );
		int perimeter = r.getPerimeter(r.length, r.breadth);
		System.out.println("Perimeter of the circle is:"+perimeter );		

	}

	@Override
	int getArea(int length, int breadth) {
	  double d = (22/7 *(length*length));
	  int i = (int) d;
		return i;
	}

	@Override
	int getPerimeter(int length, int breadth) {
		double d = (44/7 *(length));
		int i = (int)d;	
		return i;
	}

}
