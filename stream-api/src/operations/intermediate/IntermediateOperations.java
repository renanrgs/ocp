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

		Stream<Integer> infiniteStream = Stream.iterate(1, (number) -> number * 2);
		infiniteStream.limit(31).forEach(System.out::println);
		
		// FlatMap test
		List<String> listNames = Arrays.asList("John", "Steve", "James");
		List<String> listNames2 = Arrays.asList("Mathew", "Luke", "Paul", "John");

		Stream<List<String>> listStream = Stream.of(listNames, listNames2);
		// listStream.flatMap(List::stream).forEach(System.out::println);

//		names.sorted(String::compareTo).forEach(System.out::println);
//		names.sorted((name1, name2) -> name1.compareTo(name2)).forEach(System.out::println);
	}
}

/*
 * Intermediate operations
 * 
 * 1 - distinct -> Takes no parameters and returns unique elements
 * 2 - filter -> Filter elements within a stream according to predicate expressions that is passed.
 * 3 - skip -> It skips an amount of elements according to the parameter used. The parameter is a long.
 * 4 - limit -> State a limit of elements that should be return from stream. It takes a long as parameter.
 * 5 - map -> It transforms each element within a stream. It takes a Function as parameter.
 * 6 - flatMap -> It brings the elements within a collection to the surface. It takes a Function as parameter that must return a stream.
 * 7 - sorted -> It has two versions. The first one does not take any parameter and the second one takes a Comparator as parameter. It sorts elements within a stream
 * 8 - peek -> It prints the track of the stream.   
 */