package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class simpleReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		
		Class clazz= Class.forName("reflection.testReflection");
		
		//Below is reflection pacakage 
		
		Constructor ctr = clazz.getDeclaredConstructor();
		
		testReflection tR = (testReflection)ctr.newInstance();
		
		System.out.println(tR.getname());
	}

}