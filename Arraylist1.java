package arrayList_practice;

import java.util.ArrayList;
//import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) {
		//create an arraylist
		
		ArrayList<String> kutta = new ArrayList<>();
		//if u want to take integer value
		//ArrayList<Integer> number = new ArrayList<>();
		//add element
		kutta.add("badka kutta");
		kutta.add("lal kutta");
		kutta.add("chotka kutta");
		System.out.println("Types of kutta in arrayList: " + kutta );
		//access the element
		System.out.println("first element in arraylist: " + kutta.get(0) );
		//change the element
		kutta.set(0, "bilar kutta");
		System.out.println("ist element changed to : "+ kutta.get(0));
		//remove the element
		kutta.remove(1);
		System.out.println("now, types of kutta in arrayList is: "+ kutta);
		//size of the arrayList
		System.out.println("size of the arrayList is : "+ kutta.size());
		
		
		
		

	}

}
