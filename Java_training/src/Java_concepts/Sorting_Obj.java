package Java_concepts;

import java.time.LocalDate;
import java.util.*;

public class Sorting_Obj {
	public static void main(String[] args) {
		List<Employee> library = new ArrayList<Employee>();
		library.add(new Employee("Yogesh", 22, "2022-11-09"));
		library.add(new Employee("Ram", 21, "2022-11-08"));
		library.add(new Employee("XYZ", 25, "2021-11-10"));

		// Sorting Employees by date of joining using Comparable
		Collections.sort(library);

		System.out.println("\nSorted list of employees by date of joining using Comparable:");
		for (Employee employee : library) {
			System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getDoj());
		}

		// Sorting Employees by age using Comparator
		Collections.sort(library, Comparator.comparing(Employee::getAge));

		System.out.println("\nSorted list of employees by age using Comparator:");
		for (Employee employee : library) {
			System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getDoj());
		}
	}
}

class Employee implements Comparable<Employee> {
	private String name;
	private int age;
	private LocalDate doj;

	public Employee(String name, int age, String doj) {
		this.name = name;
		this.age = age;
		this.doj = LocalDate.parse(doj);

	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public LocalDate getDoj() {
		return this.doj;
	}

	// compareTo method for sorting by date of joining using Comparable
	@Override
	public int compareTo(Employee other) {
		return this.doj.compareTo(other.doj);
	}
}
