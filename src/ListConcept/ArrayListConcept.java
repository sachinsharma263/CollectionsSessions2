package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
	
		//array list is dynamic array
		//size increase dynamically
		//in static array size is fixed and data type is also fixed -to overcome this problem we use dynamic array
		//array list is most popular dynamic array where size increase dynamic and we can store different types of values i.e data type
		//when we add value size increase automatic.. n number of value can be store
		
		//array list default class which we have to import from java.util package
		
		ArrayList ar=new ArrayList();
		
		ar.add(5);//stored at index 0
		ar.add(45);//index 1
		ar.add(435);//index at 2
		//index in array and array list always start from 0.
		//lowest index=0 hightes index=n size=highest index+1 
		
		System.out.println(ar.size());//size method to give size
		//it maintains insertion order
		//not synchrozed
		//stored duplicate values
		
		ar.add(45);
		System.out.println(ar.size());
		//aloows randome acess to fetch any value bcz value stored at index
		
		System.out.println(ar.get(3));
		
		//print all values from array list
		//any collection in java either array or array list we use for loop because loop we can acess index
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(i+" "+ar.get(i));
		}
		
		//Generic available after jdk1.5
		//warning line yellow says raw type array list that we can add any type of value in array list
		//warning tell us plz define what type of data we can store -please tell us what type of values so we use generics to tell what type of values we are using

		ArrayList<Integer> ar1=new ArrayList<Integer>();//only int value we can store in this array list we have to use wrapper class Integer
		ar1.add(234);
		//ar1.add("Selenium"); not allowed now by using generics 
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Selenium");
		//ar2.add(432);
		
		//pass E if we are nt sure about type of data
		//ArrayList<E> ar3=new ArrayList<E>();

		//user defined class object we can stored in array list

		//stored onject in array list
	
		Employee e1=new Employee("naveen", 32, "QA");
		Employee e2=new Employee("sachin", 32, "QA");
		Employee e3=new Employee("deepak", 32, "QA");
		
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator is used to traverse object in array list
		
		//implementing iterator on array list
		//iteraor doesnt work on basis on index
		
		Iterator<Employee>it=ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.print(emp.name+" ");
			System.out.print(emp.age+" ");
			System.out.print(emp.dept+" ");
			System.out.println();
		}
		
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("Selenium");
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("Selenium2");
		
		ar5.addAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		System.out.println("************");
		ArrayList<String>ar9=new ArrayList<String>();
		ar9.add("selenium");
		ar9.add("test");
		
		ArrayList<String>ar10=new ArrayList<>();
		ar10.add("selenium");
		ar10.add("test");
		
		ar9.addAll(ar10);
		for (int i = 0; i < ar9.size(); i++) {
			System.out.println(ar9.get(i));
		}
		//removeall
		System.out.println("removeall");
		ar9.removeAll(ar10);
		for (int i = 0; i < ar9.size(); i++) {
			System.out.println(ar9.get(i));	
		}
		
		System.out.println("************");
		//retainAll
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("Selenium");
		ar7.add("test");
		
		ArrayList<String> ar8=new ArrayList<String>();
		ar8.add("Selenium2");
		ar8.add("test");
		
		ar7.retainAll(ar8);
		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
		
	}

}
