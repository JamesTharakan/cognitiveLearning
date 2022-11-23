package simple;



class Base {
    int id = 1000; //Line n1
  
    Base() {
    	System.out.println("Base.Base()");
    	Base();
    }
  
    void Base() { //Line n3
        System.out.println("Orange : "+ ++id); //Line n4
    }
}
  
class Derived extends Base {
    int id = 2000; //Line n5
  
    Derived() {
    	System.out.println("Derived.Derived()");
    } //Line n6
  
    void Base() { //Line n7
        System.out.println("Apple : "+--id); //Line n8
    }
}
  
public class Construct {
    public static void main(String[] args) {
        Base base = new Derived(); //Line n9
    }
}