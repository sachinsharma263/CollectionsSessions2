package MapConcept;

import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//hashtable is similar to hashmap but synchronized
		//stores the value on basis of key and value
		//key specify as object and object has unique hash code
		//java object number- hash code number 32 bit integer number
		//jvm will give hash code for object
		//no null key and null value
		
		Hashtable h1=new Hashtable();
		h1.put(1, "selenium");
		h1.put(2, "java");
		
		Hashtable h2=new Hashtable();
		h2=(Hashtable) h1.clone();
		
		System.out.println(h1);
		System.out.println(h2);
		
	//	h1.clear();
		System.out.println(h1);
		System.out.println(h2);
		
		Hashtable h3=new Hashtable();
		h3.put(1, "selenium");
		h3.put(2, "java");
		
		if (h3.contains("selenium")) {
			System.out.println("value is found");
			
			h3.put(3, "selenium2");
			System.out.println(h3);
			
		}
		
		Set s=h3.entrySet();
		System.out.println(s);
		
		System.out.println(h3.get(1));
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
		if (h1.equals(h2)) {
			System.out.println("object are equal");
		}
		
	}

}
