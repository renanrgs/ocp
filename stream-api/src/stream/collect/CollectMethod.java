package stream.collect;

import java.util.Collection;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMethod {
	public static void main(String[] args) {
		Stream<String> animals = Stream.of("lions", "tigers", "bears");
//		Double average = animals.collect(Collectors.averagingDouble((animal) -> new Double(animal.length())));
//		Map<Boolean, List<String>> map = animals.collect(Collectors.groupingBy((animal)-> animal.length() % 2 == 0));
		
//		map.forEach((key, value)-> System.out.println(key + " " + value));
		//System.out.println(animals.collect(Collectors.joining(", ")));
		
		//animals.collect(Collectors.toCollection((ArrayList::new))).forEach(System.out::println);
		
		BiConsumer<Integer, String> printMap = (key, value)-> System.out.println(key + " " + value); 
		BiConsumer<Integer, Collection<String>> printMap2 = (key, value) -> System.out.println(key + " " + value);
		
//		animals.collect(Collectors.toMap((animal) -> animal.hashCode(), (animal) -> animal)).forEach(printMap);
		
//		animals.collect(Collectors.toMap((animal) -> animal.length(), (animal) -> animal, (animal1, animal2) -> animal1.concat(animal2))).forEach(printMap);
		
//		animals.collect(Collectors.toMap(String::length, String::toString, String::concat, HashMap::new)).forEach(printMap);
		//animals.collect(Collectors.toMap(String::length, String::toString)).forEach(printMap);
		
		animals.collect(Collectors.groupingBy(String::length, Collectors.toSet())).forEach(printMap2);
		animals.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
		
	}
}
