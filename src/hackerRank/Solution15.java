package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

	Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.
	
	Input Format
	
	The first line of input contains an integer N, representing the total number of students. The next N lines contains a list of student information in the following structure:
	
	ID Name CGPA
	Constraints
	
	The name contains only lowercase English letters. The Id contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.
	
	Output Format
	
	After rearranging the students according to the above rules, print the first name of each student on a separate line.
	
	Sample Input
	
	5
	33 Rumpa 3.68
	85 Ashis 3.85
	56 Samiha 3.75
	19 Samara 3.75
	22 Fahim 3.76
	
	Sample Output
	
	Ashis
	Fahim
	Samara
	Samiha
	Rumpa
 */

class Student implements Comparable<Student> {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	public int compareTo(Student student) {
		int ordre = ((Double) student.getCgpa()).compareTo(this.getCgpa());
		ordre = (ordre != 0) ? ordre : this.getFname().compareTo(student.getFname());
		ordre = (ordre != 0) ? ordre : ((Integer) this.getId()).compareTo(student.getId());
		return ordre;
	}

	/*
	 * private static final Comparator<Student> comp =
	 * Comparator.comparingDouble(Student::getCgpa).reversed()
	 * .thenComparing(Student::getFname) .thenComparingInt(Student::getId); // ...
	 * 
	 * @Override public int compareTo(final Student other) { return
	 * comp.compare(this, other); }
	 */
}

//Complete the code
public class Solution15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = scanner.nextInt();
			String fname = scanner.next();
			double cgpa = scanner.nextDouble();

			Student student = new Student(id, fname, cgpa);
			studentList.add(student);

			testCases--;
		}

		Collections.sort(studentList);
		for (Student student : studentList) {
			System.out.println(student.getFname());
		}

		scanner.close();
	}
}
