package concepts;

public class FindClassLoader {

	public static void main(String[] args) {
		Class myClass = null;
		
		myClass = getClassObject("java.lang.String");
		System.out.println("BootStrap Classloader is ::" + myClass.getClassLoader()); // null because it is non java class :bootstrap loader

		myClass = getClassObject("concepts.FindClassLoader");
		System.out.println("Application Classloader is ::" + myClass.getClassLoader()); 
		
		myClass = getClassObject("sun.security.pkcs11.SunPKCS11");
		System.out.println("Classloader is ::" + myClass.getClassLoader());
		
	}

	public static Class getClassObject(String qulifiedName) {

		try {
			return Class.forName(qulifiedName);
		} catch (ClassNotFoundException e) {
			System.out.println("FindClassLoader.check() :: some exception");
		}
	return null;	
	}

}