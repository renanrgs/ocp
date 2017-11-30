package test.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class TestSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Animal animal = new Animal("Julie", 10, 12, LocalDate.now());
		try (ObjectOutputStream outputStream = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("files/Animal")))) {
			outputStream.writeObject(animal);
			outputStream.flush();
		}

		ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("files/Animal")));
		Animal a = (Animal) objectInputStream.readObject();
		System.out.println(a);
	}
}

class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private static Integer age;
	private Integer weight;
	private transient LocalDate birthDay;

	public Animal(String name, Integer age, Integer weight, LocalDate birthDay) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + ", birthDay=" + birthDay + "]";
	}

}
