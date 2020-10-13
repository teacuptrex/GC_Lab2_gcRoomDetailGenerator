package gcRoomDetailGenerator;
import java.util.*;


public class RoomDetailGenerator {

	public static void main(String[] args) {
		double length;
		double width;
		double area;
		double perimeter;
		String cont = "y";
		
		Scanner scn = new Scanner(System.in);

		while (cont.equals("y")) {
			System.out.print("What is the length of the classroom? (ft) ");
			length = scn.nextDouble();
			System.out.print("What is the width of the classroom? (ft) ");
			width = scn.nextDouble();
			area = width * length;
			perimeter = (2 * width) + (2 * length);
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			
			System.out.print("Continue? (y/n) ");
			cont = scn.next();
		} 
		scn.close();

	}

}
