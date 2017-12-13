package test.enums;

import java.util.Arrays;

public enum Seasons {
	SUMMER("Summer"), WINTER("Winter"), FALL("Fall"), SPRING("Spring");
	
	public void method() {}
	
	
	
	private String season;

	private Seasons(String season) {
		this.season = season;
	}
	
	public String getSeason() {
		return this.season;
	}
}

class TestEnum {
	public static void main(String[] args) {
		Arrays.asList(Seasons.values()).stream().forEach(System.out::println);
		System.out.println(Seasons.SPRING.getSeason());
	}
}
