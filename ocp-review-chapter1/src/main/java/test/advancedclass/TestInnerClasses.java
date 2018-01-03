package test.advancedclass;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class TestInnerClasses {
	public static void main(String[] args) {
		Deque d = new ArrayDeque<>();
		Queue q = new LinkedList<>();
		q.add(null);
		LocalDate date = LocalDate.now();
		Stream.of(1,2,3,4,5).max((a, b) -> a.compareTo(b));
		System.out.println(Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1)));
		System.out.println(Integer.max(2, 5));
	}
}
