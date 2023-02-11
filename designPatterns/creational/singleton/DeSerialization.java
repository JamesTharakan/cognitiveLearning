package designPatterns.creational.singleton;

import java.io.Serializable;

public class DeSerialization implements Serializable{

	private static DeSerialization instance = new DeSerialization();

	public static DeSerialization Instance() {
		return instance;
	}

	private DeSerialization() {
		System.out.println("DeSerialization");
	}

	/**
	 * The readResolve method is called when ObjectInputStream has read an object
	 * from the stream and is preparing to return it to the caller.
	 * ObjectInputStream checks whether the class of the object defines the
	 * readResolve method. If the method is defined, the readResolve method is
	 * called to allow the object in the stream to designate the object to be
	 * returned. The object returned should be of a type that is compatible with all
	 * uses. If it is not compatible, a ClassCastException will be thrown when the
	 * type mismatch is discovered.
	 * 
	 * @return
	 */
	protected Object readResolve() {
		return instance;
	}

}
