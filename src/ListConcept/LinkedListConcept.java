package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("selenium");
		ll.add("java");
		ll.add("automation");
		
		System.out.println(ll);
		
		ll.addFirst("deepak");
		System.out.println(ll);
		ll.addLast("bhawna");
		System.out.println(ll);
		
		ll.remove(2);
		System.out.println(ll);
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		ll.set(0, "hem");
		System.out.println(ll);
		
		Iterator<String>it=ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
