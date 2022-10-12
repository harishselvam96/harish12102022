package org.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {
	public static void main(String[] args) {

		Set<Integer> s = new HashSet<>();// 10,20,30,40,50,60,70,80,90,10,20
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
		System.out.println("Random Order="+s);
		System.out.println();
		Set<Integer> a=new LinkedHashSet<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		a.add(10);
		a.add(20);
		System.out.println("Insentation Order="+a);
		System.out.println();
		Set<Integer> b=new TreeSet<>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(70);
		b.add(80);
		b.add(90);
		b.add(10);
		b.add(20);
		System.out.println("Ascending Order="+b);
		System.out.println("first command");
		
		
		
		
	}
}
