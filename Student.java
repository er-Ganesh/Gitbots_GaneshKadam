package Giboats;

public class Student implements Comparable<Student>{

	private String name;
	private int age;
	private int marks;
	public static int sum=0;

	
	public Student(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
	
		
		
		sum=sum+o.getMarks();
		
		
		return sum;
		
	}
	
		
	
}
