package designPatterns.creational.singleton;

public class DisableRelection extends SecurityManager {

	/**
	 * This method first gets a list of restricted packages by obtaining a
	 * comma-separated list from a call to
	 * java.security.Security.getProperty("package.access"), and checks to see if
	 * pkg starts with or equals any of the restricted packages. If it does, then
	 * checkPermission gets called with the
	 * RuntimePermission("accessClassInPackage."+pkg) permission.
	 */
	public void checkPackageAccess(String pkg) {

		super.checkPackageAccess(pkg);

		// don't allow the use of the reflection package
		if (pkg.equals("java.lang.reflect")) {
			throw new SecurityException("Reflection is not allowed!");
		}
	}

}
