package stream.primitives;

import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToDoubleFunction;
import java.util.stream.IntStream;

public class PrimitiveStream {
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 6);
		// OptionalDouble average = stream.average();
		// System.out.println(average.orElse(0));

		OptionalInt optionalInt = OptionalInt.empty();
		OptionalLong optionalLong = OptionalLong.empty();

		stream.mapToDouble((intNumber) -> intNumber * 2).forEach(System.out::println);
		// stream.forEach(action);

		IntFunction f = (intNumber) -> 1;
		IntUnaryOperator intUnaryOperator = (intNumber) -> 1;
		IntConsumer intConsumer = (intNumber) -> System.out.println(1);
		IntPredicate intPredicate = (intNumber) -> true;
		IntSupplier intSupply = () -> 1;

		IntToDoubleFunction intToDoubleFunction = (intNumber) -> 2.0;
		IntToLongFunction intToLongFunction = (intNumber) -> 1L;

		
		ToDoubleFunction<String> toDoubleFunction = (string) -> Double.valueOf(string);

	}
}
