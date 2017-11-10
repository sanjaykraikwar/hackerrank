package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		List<Animal> animals=new ArrayList<Animal>();
		
		List<Animal> listAnimals=new ArrayList<Animal>();
	
		

			Animal animal1=new Animal("ABC",1);
			Animal animal2=new Animal("BCD",2);
			Animal animal3=new Animal("BCE",3);
			Animal animal4=new Animal("ABD",4);
			
			Animal animal5=new Animal("BCE",5);
			Animal animal6=new Animal("ABD",6);
				
		
			animals.add(animal1);
			animals.add(animal2);
			animals.add(animal3);
			animals.add(animal4);
			
			listAnimals.add(animal5);
			listAnimals.add(animal6);
			
			//animals.forEach(System.out::println);
			
			
			//animals.forEach(a->System.out.println(a));
			
		   //animals.stream().filter(a->a.getName().equals("ABC")).forEach(a->System.out.println(a));
		 //  animals.stream().filter(a->a.getName().startsWith("A")).forEach(a->System.out.println(a));
		//	animals.stream().map(Animal::getName).forEach(System.out::println);
			//int sum=animals.stream().collect(Collectors.summingInt(Animal::getLegs));
			//animals.stream().sorted().forEach(System.out::println);
		
			//Animal a[]= (Animal[])animals.stream().toArray();
		   
		  // animals.forEach();
			
			
		//	animals.stream().flatMap(a->listAnimals.stream()).forEach(System.out::println);;
			
			List<Integer> l1 =Arrays.asList(1,2,3);
			List<Integer> l2 =Arrays.asList(4,5);
			
	 Stream.of(l1,l2) // Stream of List<Integer>
			           // .flatMap(List::stream)
			   
			            .collect(Collectors.toList()).forEach(System.out::println);

		
	}

}
	
	class Animal implements Comparable<Animal>{
		
	String name;
	int legs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public Animal(String name, int legs) {
		super();
		this.name = name;
		this.legs = legs;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", legs=" + legs + "]";
	}
	@Override
	public int compareTo(Animal animal) {
		// TODO Auto-generated method stub
		return this.name.compareTo(animal.getName());
	}
	
}