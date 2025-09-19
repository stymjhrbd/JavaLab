package SumMethod;

import java.util.Set;

public interface SumMethod {

	static double sumMethod(Set<? extends Number> sets) {

		double sum = 0;
//		sets.forEach(num -> {
//			sum += num.doubleValue();
//		});

		for(Number n :sets) {
			sum+= n.doubleValue();
		}
		return sum;

	}

}
