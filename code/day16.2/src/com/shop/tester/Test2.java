package com.shop.tester;

import static com.shop.utils.ShopUtils.populateProductList;
import static com.shop.utils.ShopUtils.populateProductMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {
		// get populated Map of products
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		/*
		 * New default method added in Map i/f public default void forEach(BiConsumer<?
		 * super K,? super V> action) BiConsumer<T,U> - functional i/f SAM - public void
		 * accept(T t,U u)
		 */
		// solve - display entries from the map.
//		productMap.forEach((pid, product) -> System.out.println("Key " + pid + " Value " + product));
//		productMap.values().removeIf(p->p.getProductCategory().equals(Category.BISCUITS));
//		System.out.println();
//		System.out.println();
//		System.out.println();
//
//		productMap.forEach((i,p)->{System.out.println("Key :"+i+" Val: "+p);});
//		
		Map<Integer, Product> productMapSorted = new TreeMap<>(productMap);
		
//		productMapSorted.forEach((i,p)->{System.out.println("Key :"+i+" Val: "+p);});
		
		ArrayList<Product> newArray = new ArrayList<>(productMap.values());
		Collections.sort(newArray,(p1,p2)->((Double)p1.getPrice()).compareTo(p2.getPrice()));
		
		newArray.forEach(p->System.out.println(p));
		
	}

}
