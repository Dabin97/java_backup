package object;

import java.util.Objects;

public class Dog {
	private String breed;
	private int age;

	public Dog(String breed, int age) {
		super();
		this.breed = breed;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", age=" + age + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, breed);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//타입비교 instanceof
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(breed, other.breed);
//		return breed.equals(temp.breed) && age == temp.age;  
	}
	//shift + Alt + S하고 h누르면 자동완성
	
	
	
}//class
