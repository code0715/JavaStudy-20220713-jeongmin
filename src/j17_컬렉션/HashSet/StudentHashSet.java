package j17_컬렉션.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import j15_스태틱.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		Student student1 = new Student("조문기");
		Student student2 = new Student("김호영");
		Student student3 = new Student("서재효");
		Student student4 = new Student("신승한");
		Student student5 = new Student("전나경");
		
		HashSet<Student> studentSet = new HashSet<Student>();
		Student[] students = {student1, student2, student3, student4, student5};
		//studentSet.addAll(Arrays.asList(students));
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		studentSet.add(student4);
		studentSet.add(student5);
		
		System.out.println(studentSet);
		
		studentSet.remove(student1);
		System.out.println(studentSet);
		
	}	
}
