package simple;

import java.util.ArrayList;
import java.util.List;

public class SizeZero {

	public static void main(String[] args) {
		List<Object> objs = new ArrayList<Object>(10);

		System.out.println("isEmpty :" + objs.isEmpty()+ "\nSize :"+objs.size());

		for (int i = 0; i < objs.size(); i++) {
			System.out.println("EmptyArrayList");
		}
		System.out.println("EmptyArrayList:: out ");

	}

}
