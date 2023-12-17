package MapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import ListConcept.Employee;

public class HashMapConcept {
	
	//Map is interface- HashMap and HashTable implements Map
	//Map store values on basis of key pair
	//Key always unique
	//HashMap non synchronized- not thread safe
	//more than 1 thread can access Map object
	//HashMap is fast
	//It gives concurrent modification exception
	//can store one null key and value
	

	public static void main(String[] args) {
		
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		hm.put(1, "selenium");
		hm.put(2, "java");
		hm.put(3, "qtp");
		hm.put(4, "qtp");
		hm.put(null, "qtp");
		hm.put(null, "");
		
		System.out.println(hm);
		
		System.out.println(hm.get(1));
		
		
		for(Map.Entry<Integer, String> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	
		hm.remove(3);
		System.out.println(hm);
		
		Employee e1=new Employee("deepak", 37, "QA");
		Employee e2=new Employee("bhawna", 37, "QA");
		Employee e3=new Employee("naveen", 37, "QA");
		
		HashMap<Integer, Employee> emp=new HashMap<Integer, Employee>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for (Map.Entry<Integer, Employee> m:emp.entrySet())
		{
			int key=m.getKey();
			Employee e=m.getValue();
			System.out.println("Key id "+  key);
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}
	}

}
