package designPatterns.creational.singleton;

/**
 * We can throw exception because ,it is impossible that the static final
 * instance is null after class is loaded. i.e. the static modifier of the
 * “instance” variable will make sure that the singleton object is created
 * during class loading. But if someone changed the modifier of constructor to
 * public from private. And then invoked the constructor directly then if check
 * will pass and throw the RuntimeException
 * 
 * @author jtharakan
 *
 */

public class AvoidCreationByReflection {

	private static final AvoidCreationByReflection instance = new AvoidCreationByReflection();

	private AvoidCreationByReflection() {
		if (instance != null)
			throw new IllegalStateException("Creating second instance of this class.");
	}

	public static AvoidCreationByReflection getInstance() {
		return instance;
	}

}
