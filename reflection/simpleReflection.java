package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class simpleReflection {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, ClassNotFoundException {
		
		Class<?> clazz= Class.forName("reflection.testReflection");
//case 1		
		Constructor ctr = clazz.getDeclaredConstructor();
		testReflection testRef = (testReflection)ctr.newInstance();
		
		testRef.testReflectionMethod();
		
//case 2		
		Method method[]=clazz.getDeclaredMethods();
		for(Method met : method) {
			if(Modifier.isPrivate(met.getModifiers())) {
				met.setAccessible(true);
				met.invoke(testRef);
			}
		}
		
//case 3		
		Method secretMethod = clazz.getDeclaredMethod("secretMethod");
        secretMethod.setAccessible(true); // Bypass private access
        secretMethod.invoke(testRef);  // Output: Secret message!

	}
}