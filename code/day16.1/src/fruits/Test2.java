package fruits;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test2 {
 public static void main(String[] args) {
	 List<Apple> apples = new ArrayList<>();
	 apples.add(new Apple());
	 apples.add(new Apple());
	 apples.add(new Apple());
	 utils.displayTaste(apples);
	 
	 List<Mango> mango = new Vector<>();
	 mango.add(new Mango());
	 mango.add(new Kesar());
	 mango.add(new Alphonso());
	 utils.displayTaste(mango);
	 
	 List<Orange> oranges = new LinkedList<>();
	 oranges.add(new Orange());
	 oranges.add(new Orange());
	 oranges.add(new Orange());
	 utils.displayTaste(oranges);
 }
}
