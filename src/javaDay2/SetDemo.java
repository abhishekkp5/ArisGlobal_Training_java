package javaDay2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

class priQue{
	PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	void in(ArrayList<Integer> a) {
		q.addAll(a);
	}
	void display() {
		System.out.println(q);
		}	
}
class hash{
	HashSet<Integer> q = new HashSet<Integer>();
	void in(priQue a) {
		q.addAll(a.q);
	}
	void display() {
		System.out.println(q);		
	}	
}
class Linked{
	LinkedHashSet<Integer> q = new LinkedHashSet<Integer>();
	void in(hash a) {
		q.addAll(a.q);
	}
	void in(priQue a) {
		q.addAll(a.q);
	}
	void display() {
		System.out.println(q);		
	}	
}

public class SetDemo {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(4);
		ar.add(3);

		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(23);
		hash.add(45);
		hash.add(1);
		hash.add(2);
		hash.add(50);
		hash.add(20);
		Iterator<Integer> itr = hash.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println(i+" ");
		}
		System.out.println(hash);
		
		TreeSet<Integer> thash = new TreeSet<Integer>();
		thash.add(100);
		thash.add(23);
		thash.add(45);
		thash.add(3);
		System.out.println(thash);
		
		priQue p = new priQue();
		p.in(ar);
		p.display();
		hash h = new hash();
		h.in(p);
		h.display();
		Linked l = new Linked();
		l.in(h);		
		l.display();
		l.in(p);
		l.display();
		
		
	}

}
