package random.simple;

import java.util.ArrayList;
import java.util.List;

public class NoPloymorphismInGenerics {

//	This no Polymorphism is to make sure only one Type of data exists in the list.
//	Just to avoid a third party from adding a different type of data
	public static void main(String[] args) {

//		List <Parent>myList1 = new ArrayList<Child>();   //this line also gives compiler error
		
		List <Object>myList = new ArrayList<Object>();   
		myList.add("abc"); 

	}

}



class Parent {}
class Child extends Parent{}
