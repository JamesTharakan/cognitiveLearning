package designPatterns.structural.Decorator;

/*Basically we create concrete classes. And add decorators. 

programming wise: We pass a concrete classes to each decorator.
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
		
		Candidate candidateTwo =new ScriptSpecialization(new CollectionSpecialization(new DotNetCandidate()));
		
		 temp=candidateTwo.getSpecialization();
		
		System.out.println(temp);
	}

}
