package designPatterns.creational.singleton;

/**
 * Unfortunately, double-checked locking causes problems. What are they
 * @author jtharakan
 *
 */
public class DoubleCheck {

	private static DoubleCheck instance = null;

	public static DoubleCheck getInstance() {
		
		if (instance == null) {
			synchronized (DoubleCheck.class) {
				if (instance == null) {
					instance = new DoubleCheck();
				}
			}
		}
		
		return instance;
	}

}
