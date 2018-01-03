package operations.intermediate;

import java.util.stream.Stream;

public class IntermediateOperations {
	public static void main(String[] args) {
		Stream<String> names = Stream.of("John", "Steve", "James", "Mathew", "Luke", "Paul");
		
		names.filter((name) -> name.startsWith("J")).forEach(System.out::println);
	}
}
