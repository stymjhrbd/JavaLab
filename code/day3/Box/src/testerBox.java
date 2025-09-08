
import java.util.Scanner;
public class testerBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter w h l");
//		Box b1;
//		b1 = new Box(sc.nextDouble(), sc.nextDouble(),sc.nextDouble());
		System.out.println("enter array length");
		Box[] boxes = new Box[sc.nextInt()];
		
		for(int i=0;i<boxes.length;i++) {
			System.out.println("Enter values");
			boxes[i] = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		
		for( Box b: boxes) {
			System.out.println(b.getVolume());
		}
		
		
		sc.close();
	}

}
