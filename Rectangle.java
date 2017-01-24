import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Rectangle extends SuperAbstract  {
      int length =0 ;
      int breadth = 0 ;
	//private static Scanner sc;
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
	   Rectangle r = new Rectangle();
      System.out.println("Enter the length of the rectangle");
      //sc = new Scanner(System.in);
      //int length = sc.nextInt();
      
      BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
       r.length = Integer.parseInt(br.readLine());
      System.out.println();
       System.out.println("Enter the breadth of the rectangle");
       br = new BufferedReader(new InputStreamReader(System.in));
       r.breadth = Integer.parseInt(br.readLine());
       int Area = r.getArea(r.length, r.breadth);
       
       System.out.println("Area of the rectangle is :"+Area);
       
       int Perimeter = r.getPerimeter(r.length , r.breadth);
       System.out.println("\n Perimeter of the rectangle is :" +Perimeter);
	}

	@Override
	int getArea(int length , int breadth) {
		// TODO Auto-generated method stub
	   return ((length*breadth));
	   }

	
	@Override
	int getPerimeter(int length, int breadth) {
		// TODO Auto-generated method stub
		return (2* ( length + breadth));
	}

}