package streams.operations;

import java.util.List;
import java.util.Optional;

//filter returns a stream. 
//We have a collect using collect(Collectors.toList())
//or find one item and get an Optional object
public class Filter {

	public static void main(String[] args) {
		
		List<String> names = List.of("Alice", "Bob", "Charlie", "Cherry","David", "Eve");

        Optional<String> result = names.stream()
        								.filter(name -> name.startsWith("C"))
        								.findAny();
       

        if (result.isPresent()) {
            System.out.println("Found a name: " + result.get());
        } else {
            System.out.println("No name starting with 'F' found.");
        }
	}

}
