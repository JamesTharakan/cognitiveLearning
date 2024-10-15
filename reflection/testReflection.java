package reflection;

public class testReflection extends SecurityManager {

	private String name = "James";

	protected String getname() {
		return name;
	}
	
	public void testReflectionMethod() {
		System.out.println("public method");
	}
	
	private void secretMethod() {
		System.out.println("secretMethod");
	}
	
	
	/*
	 * by overriding this method of securityManager(deprecated in Java 17)
	 * if the security manager is configured at JVM level 
	 * we can block reflection to this package and throw exception
	 */
	public void checkPackageAccess(String pkg){
		super.checkPackageAccess(pkg);		//This line is a MUST HAVE CODE.
		 if(pkg.equals("reflection")){
		        throw new SecurityException("Reflection is not allowed!");
		    }
		}

}