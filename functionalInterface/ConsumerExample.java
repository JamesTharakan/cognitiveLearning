package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class simpleConsumerImpl implements Consumer <Integer>{
	public void accept(Integer n) {
		System.out.println("Otherwise : "+ n * 2);
	}
}	
public class ConsumerExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>(List.of("Alice","Bob","Charlie"));
        
//Example 1
		simpleConsumerImpl ow = new simpleConsumerImpl();
		ow.accept(2);
		
//Example 2
		Consumer<String> nameProcessor = s -> System.out.println(s + " by nameProcessor");
        names.forEach(nameProcessor);

//Example 3
        Consumer <List<String>> processor = list->{
        	for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) + " - Processed");
            }
        };

        // Applying the Consumer which also updates the message
        processor.accept(names);
        names.forEach(System.out::println);
        
//Example 4 
        Consumer <String> test = str -> {str = str +" understood";};
        test.accept("James");

        names.forEach(test);
    }

}