package streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("Alice", "Bob"), Arrays.asList("Charlie", "David"),
				Arrays.asList("Eve", "Frank"));

		listOfLists.stream().map(list -> list.stream()) // Returns a Stream<Stream<String>>
				.forEach(System.out::println); // Outputs individual streams, not the actual elements

		listOfLists.stream().flatMap(list -> list.stream()) // Flattens the structure
				.forEach(System.out::println); // Outputs actual elements: Alice, Bob, Charlie...
		

//Example 2		
		List<String> sentences = Arrays.asList("Hello James", "How are you James", "we are fine James");

		
		System.out.println("Total words :"+(sentences.stream()
												        .flatMap(sentence -> Arrays.stream(sentence.split(" "))) 
												        .count()));
		
		Stream<String>  str = sentences.stream()
						.flatMap(sentence -> Arrays.stream(sentence.split(" ")))
						.distinct();

		System.out.println("Different words : "+str.count());
		
		
//Example 

		List<UserEmail> users = Arrays.asList(
		    new UserEmail("Alice", Arrays.asList("alice@example.com", "alice@yahoo.com")),
		    new UserEmail("Bob", Arrays.asList("bob@gmail.com")),
		    new UserEmail("Charlie", Arrays.asList("charlie@hotmail.com", "charlie@gmail.com"))
		);

			users.stream()
		    .flatMap(user -> user.getEmails().stream())  // Flattens the list of emails
		    .forEach(System.out::println);
	}

}


class UserEmail {
    private String name;
    private List<String> emails;
    
    public UserEmail(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }

    public List<String> getEmails() {
        return emails;
    }
}
