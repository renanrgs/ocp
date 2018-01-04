package operations.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
	public static void main(String[] args) {
		Stream<String> names = Stream.of("John", "Steve", "James", "Mathew", "Luke", "Paul", "John");

		// names.filter((name) -> name.startsWith("J")).forEach(System.out::println);
		// names.distinct().forEach(System.out::println);
		// names.limit(3).forEach(System.out::println);
		// names.skip(2).forEach(System.out::println);

		// names.map(String::toUpperCase).forEach(System.out::println);

		// FlatMap test
		List<String> listNames = Arrays.asList("John", "Steve", "James");
		List<String> listNames2 = Arrays.asList("Mathew", "Luke", "Paul", "John");

		Stream<List<String>> listStream = Stream.of(listNames, listNames2);
		// listStream.flatMap(List::stream).forEach(System.out::println);

		names.sorted(String::compareTo).forEach(System.out::println);
//		names.sorted((name1, name2) -> name1.compareTo(name2)).forEach(System.out::println);

	}
}
