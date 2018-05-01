package collection.arrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Capacity {


	
	public static void main(String args[]) throws Exception{
	   ArrayList list = new ArrayList (2);
	   int input []={1,2,3,4,5,6};
	   
	   for (int i = 0; i < input.length; i++) {
		   list.add(i);
		   System.out.println("Capacity = " + getCapacity(list)+" "+"Size = "+list.size());
	   }
	   System.out.println("Remove and check the size");
	   list.remove(5);
	   System.out.println("Capacity = " + getCapacity(list)+" "+"Size = "+list.size());
	   list.remove(4);
	   System.out.println("Capacity = " + getCapacity(list)+" "+"Size = "+list.size());
	   list.remove(3);
	   System.out.println("Capacity = " + getCapacity(list)+" "+"Size = "+list.size());
	   list.remove(2);
	   System.out.println("Capacity = " + getCapacity(list)+" "+"Size = "+list.size());
	   
	   list.trimToSize();
	   System.out.println("Using trim");
	   System.out.println("Capacity = " + getCapacity(list)+" "+"Size = "+list.size());
 	}

	static int getCapacity(ArrayList<?> list) throws Exception {
	        Field dataField = ArrayList.class.getDeclaredField("elementData");
	        dataField.setAccessible(true);
	        return ((Object[]) dataField.get(list)).length;
	}

}
