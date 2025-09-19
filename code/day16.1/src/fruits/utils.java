package fruits;

import java.util.List;

public interface utils {

	static void displayTaste(List<? extends Fruit> list) {
		list.forEach(p -> p.taste());
	}

	static void addMango(List<? super Mango> list, Mango... mangoes) {
		for(Mango man : mangoes) {
			list.add(man);
		}
	}

}
