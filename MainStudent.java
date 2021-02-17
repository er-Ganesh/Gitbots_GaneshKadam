package Giboats;

import java.util.*;





public class MainStudent {

	public static void main(String[] args) {
		
		
		ArrayList<Student> obj = new ArrayList<Student>(); 


		obj.add(new Student("Ajinkya",25,80));
		obj.add(new Student("Krishna",23,90));
		obj.add(new Student("Ananta",28,100));
		obj.add(new Student("Pruthvi",24,120));

		Collections.sort(obj, new AgeComparator());
		

		for(Student o:obj)
			System.out.println(o);
		
		Collections.sort(obj);
		
		
		System.out.println("\nSum Of Marks:"+Student.sum);
	}

}
