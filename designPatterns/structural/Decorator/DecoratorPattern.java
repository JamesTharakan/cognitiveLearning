package designPatterns.structural.Decorator;

/*
There are 3 entites in Decorator pattern.
1. The basic Interface.
2. One or many concrete Class that provide the basic functionalities.
3. Decorator Class/Classes that takes/wraps the concrete class(as a construtor argument) and provides the addition functionalities. 
   The Decorator class should implement the basic interface too(Why---It wil be easy to Use the basic Interface reference and call the operations)

This pattern allows addition of responsibilities to an object at runtime without affecting other instance of the same class

The complexity in decorating the objects can be reduced by other means .Like, using decorator-builder

DrawBacks:
all methods in the decorated interface must be implemented in the decorator class.Can this drawback be solved by combining the command pattern. i.e the Decorators should implement command pattern. May be possible in specific case.

It provides an alternative for inhertance.

The decorator pattern-- add behaviour dynamically at runtime. 
Inheritance adds behaviour at compile time.

Single Responsibility Principle.
Open-Closed Principle
Dependency Inversion

Ex:  FileReader, BufferedReader
 */
interface Candidate {

	String getSpecialization();

}

class JavaCandidate implements Candidate {
	
	public String getSpecialization() {
		return " Basic Java";
	}

}

class DotNetCandidate implements Candidate {
	
	public String getSpecialization() {
		return " Basic .Net";
	}

}
/**
 *Decorator should take the basic Object  
 *And Each decorator should add their feature 
 */

/*
 * It is better to have a abstract class with all or most methods implementation because
 * 1. The subclass of abstract don't have to override unnecessary
 * 2. 
 */
  abstract class Specialization implements  Candidate{
	  String specialization;

	  Specialization(Candidate cadi){
		  specialization =cadi.getSpecialization();
	  }
	 
	  
 }
  
  class CollectionSpecialization extends Specialization{

	CollectionSpecialization(Candidate cadi) {
		super(cadi);
		
	}

	public String getSpecialization() {
		return specialization = specialization+" Collection ";
	}
	  
  }
  
  class ThreadSpecialization extends Specialization{

	  ThreadSpecialization(Candidate cadi) {
			super(cadi);
			
		}

	public String getSpecialization() {
		return specialization = specialization+ " Threads";
	}
		
	 }
  
  class ScriptSpecialization extends Specialization{

	  ScriptSpecialization(Candidate cadi) {
			super(cadi);
		}

	public String getSpecialization() {
		return specialization = specialization+ " Scripting";
	}
		
	 }

public class DecoratorPattern {

	public static void main(String[] args) {
		Candidate candidateOne =new ThreadSpecialization(new ScriptSpecialization(new JavaCandidate()));
		String temp=candidateOne.getSpecialization();
		System.out.println(temp);
		
		Candidate candidateTwo = new ThreadSpecialization(new ScriptSpecialization(new CollectionSpecialization(new DotNetCandidate())));
		temp=candidateTwo.getSpecialization();
		System.out.println(temp);
//		
//		Candidate candidateThree =new JavaCandidate();
//		temp=candidateThree.getSpecialization();
//		System.out.println(temp);
		
	}
	

}
