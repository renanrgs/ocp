package operations.terminal;

import java.util.stream.Stream;

public class TerminalOperations {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
//		System.out.println("Number of elements within the stream: " + stream.count());
//		System.out.println("The lowest element within the stream: " + stream.min((a, b) -> a.compareTo(b)).orElseGet(() -> 0));
//		System.out.println("The lowest element within the stream: " + stream.max(Integer::compareTo).orElseGet(() -> 0));
//		System.out.println(stream.findAny().orElseGet(() -> 0));
//		stream.findFirst().orElse(0);
//		System.out.println(stream.allMatch((number) -> number > 0));
//		System.out.println(stream.reduce((number1, number2) -> number1 * number2).orElse(0));
//		System.out.println(stream.reduce(0, (number1, number2) -> number1 * number2));
//		System.out.println(stream.reduce("Renan ", (number1, number2) -> number1 + number2, (number1, number2) -> number1.concat(number2)));
		Stream<String> s = Stream.of("w","o","l","f");
		
		System.out.println(s.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append));
	}
	

}

/*
 * Terminal operations
 * 
 * 1 - Count -> It returns a long value that means the amount of elements within the stream
 * 2 - Min -> It returns a optional value that means the minimum value within the array. It takes a Comparator as parameter. It is a reduce function
 * 3 - Max -> It return the highest optional value within the stream. It is a reduce function because it will look at all elements within the stream.
 * 4 - findAny -> Return an element of the stream. It works fine for infinite streams. It returns an optional value. Doesn't take any parameter.
 * 5 - findFirst -> It returns the first element of the stream. It returns an optional value. Doesn't take any parameter. 
 * 6 - anyMtach -> It returns a boolean value if the predicate expression that has taken as parameter returns true. It takes a predicate expression as parameter. 
 * 7 - noneMatch -> It returns a boolean value if the predicate expression returns true.
 * 8 - allMtach
 * 9 - forEach -> Iterate over the stream. It takes a Consumer as parameter
 * 10 - reduce -> It reduces the stream to one element. It has three versions. Tne first one take a BinaryOperator as a parameter, the second one takes an Identity and a BinaryOperator as parameter, the third one takes three parameters: an Identity value, an BiFunction and BinaryOperator
 * 11 - Collect
 * */
