package opeartions.source;

import java.util.Optional;
import java.util.stream.Stream;

public class CreateParallelStream {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
		Stream<Integer> parallelStream = Stream.of(1,2,3,4,5,6).parallel();

		Optional<Integer> number = parallelStream.findFirst();
		System.out.println(number.orElse(0));
	}
}
/*
 * 
 * There are two way to create a parallel streams
 * 
 * 1 - The first one id from Collections
 * 2 - The second one from parallel's method
 * 
 */
