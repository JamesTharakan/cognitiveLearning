package collection.arrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Capacity {

	public static void main(String args[]) throws Exception{
	   ArrayList <Integer>list = new ArrayList <Integer>(2);
	   
	   int input []=IntStream.range(1, 6).toArray();
	   
	   for (int i = 0; i < input.length; i++) {
		   list.add(i);
		   System.out.println("Capacity = " + getCapacity(list)+" "+"Size = "+list.size());
	   }
//	   If the size is full while adding , the ensureCapacity() increases the size by half 
//	   and copies the arraylist in the new ArrayList(Using Arrays.copyOf())
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
